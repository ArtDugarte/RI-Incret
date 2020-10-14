package ri_incret;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OperarDevolucion {
    
    private Modelo devolucion = null;

    public Modelo BuscarDevolucion(String cedula) {

        this.devolucion = devolucion;
        ResultSet rs = null;

        Modelo devolucion = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM prestamo P, usuarios U, instrumentos I, estudiantes E, marca_instrumento M, nombre_instrumento N "
                + "WHERE E.cedula_e = '"+ cedula +"' AND P.fk_id_usu = U.id_usu AND P.fk_id_estu = E.id_e "
                + "AND P.fk_id_instru = I.id_instru AND I.fk_nomb_instru = N.id_nombi "
                + "AND I.fk_marca_instru = M.id_marca AND P.prestamo_terminado = 0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                
                devolucion.setNombre(rs.getString("E.nomb_e"));
                devolucion.setApellido(rs.getString("E.ape_e"));
                devolucion.setSerial(rs.getString("I.serial_instru"));
                devolucion.setNombre_instrumento(rs.getString("N.nomb_i"));
                devolucion.setMarca_instrumento(rs.getString("M.nomb_marca"));
                devolucion.setFecha_devolucion(rs.getString("P.fecha_devolucion"));
                devolucion.setid_estudiante(rs.getInt("E.id_e"));
                devolucion.setid_instru(rs.getInt("I.id_instru"));
                
            } else {
                JOptionPane.showMessageDialog(null, "La cédula que ingresó no tiene un Préstamo Activo");
                devolucion = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return devolucion;
    }
    public boolean RegistrarDevolucion(int id, int id_instru){
       
            int op = 0;
            BDConex bd = new BDConex();
            boolean correcto = false;
		
            op = bd.ejecutar("UPDATE prestamo SET prestamo_terminado=1 WHERE fk_id_estu="+ id +" AND prestamo_terminado=0");
            bd.ejecutar("UPDATE estudiantes SET tiene_instrumento=0 WHERE id_e ="+ id +"");
            bd.ejecutar("UPDATE instrumentos SET disponible=1 WHERE id_instru = "+ id_instru +"");
            
            if (op > 0){
			correcto = true;
			JOptionPane.showMessageDialog(null, "La Devolución se registró exitosamente");
            } else{
                
		JOptionPane.showMessageDialog(null, "Ocurrio un Error al registrar la Devolución");
            }
            bd.desconectar();
            return correcto;	
    }
}


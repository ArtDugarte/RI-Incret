package ri_incret;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarPrestamo {
    
    private Modelo prestamo = null;

    public Modelo BuscarPrestamo(String cedula) {

        this.prestamo = prestamo;
        ResultSet rs = null;

        Modelo prestamo = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM prestamo P, usuarios U, instrumentos I, estudiantes E, marca_instrumento M, nombre_instrumento N "
                + "WHERE E.cedula_e = '"+ cedula +"' AND P.fk_id_usu = U.id_usu AND P.fk_id_estu = E.id_e "
                + "AND P.fk_id_instru = I.id_instru AND I.fk_nomb_instru = N.id_nombi "
                + "AND I.fk_marca_instru = M.id_marca AND P.prestamo_terminado = 0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                
                prestamo.setNombre(rs.getString("E.nomb_e"));
                prestamo.setApellido(rs.getString("E.ape_e"));
                prestamo.setDirec(rs.getString("E.direccion"));
                prestamo.setNumTlf(rs.getString("E.num_tlf"));
                prestamo.setSerial(rs.getString("I.serial_instru"));
                prestamo.setNombre_instrumento(rs.getString("N.nomb_i"));
                prestamo.setMarca_instrumento(rs.getString("M.nomb_marca"));
                prestamo.setColor(rs.getString("I.color_instru"));
                prestamo.setusuario(rs.getString("U.nomb_usu"));
                prestamo.setfecha_entrega(rs.getString("P.fecha_entrega"));
                prestamo.setFecha_devolucion(rs.getString("P.fecha_devolucion"));
                
            } else {
                
                JOptionPane.showMessageDialog(null, "La cédula que ingresó no tiene un Préstamo Activo \n                     Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                prestamo = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return prestamo;
    }
    
    public boolean RegistrarPrestamo(int id_usuario, int id_estudiante, int id_instrumento, String fecha_devolucion){
	int op = 0;
	BDConex bd = new BDConex();
	boolean correcto = false;

	op = bd.ejecutar("INSERT INTO `prestamo` (`id_pres`, `fk_id_usu`, `fk_id_estu`, "
                + "`fk_id_instru`, `fecha_entrega`, `fecha_devolucion`, `prestamo_terminado`) "
                + "VALUES (NULL, '"+ id_usuario +"', '"+ id_estudiante +"',"
                + " '"+ id_instrumento +"', CURDATE(), DATE '"+ fecha_devolucion +"', '0');");
	
        if (op > 0) {
            
            bd.ejecutar("UPDATE estudiantes SET tiene_instrumento=1 WHERE id_e ="+ id_estudiante +"");
            bd.ejecutar("UPDATE instrumentos SET disponible=0 WHERE id_instru = "+ id_instrumento +"");
            correcto = true;
            JOptionPane.showMessageDialog(null, "El Préstamo se registró exitosamente");
            
	}else{
            
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al registrar el Préstamo");
	}
        
	bd.desconectar();
	return correcto;
    }
    
    public ArrayList BuscarconMatriz1(){
		  
            ArrayList lista = new ArrayList<>();
            int op = 0;
            BDConex bd = new BDConex();
            boolean correcto = false;
            PreparedStatement statement = null;
            ResultSet result = null;
            Connection connection;
		  
            Modelo iv;
            connection = bd.getConexion();
                 
            try {
            
                if (connection != null) {
                
                     result = bd.consultar("SELECT * FROM prestamo P, usuarios U, instrumentos I, estudiantes E, "
                             + "marca_instrumento M, nombre_instrumento N WHERE P.fk_id_usu = U.id_usu "
                             + "AND P.fk_id_estu = E.id_e AND P.fk_id_instru = I.id_instru "
                             + "AND I.fk_nomb_instru = N.id_nombi AND I.fk_marca_instru = M.id_marca "
                             + "AND P.prestamo_terminado = 0 ORDER BY fecha_entrega");
		   
                        while(result.next()== true){
                            
                            iv = new Modelo();
                            iv.setusuario(result.getString("U.nomb_usu"));
                            iv.setcedula(result.getString("E.cedula_e"));
                            iv.setSerial(result.getString("I.serial_instru"));
                            iv.setfecha_entrega(result.getString("fecha_entrega"));
                            iv.setFecha_devolucion(result.getString("fecha_devolucion"));
                            lista.add(iv);
                        }  
                    }
            }catch (SQLException e) {
                
                System.out.println(e);
                
            }finally{
            
                    try {
                        
                        connection.close();
                        bd.desconectar();
                    
                    }catch (SQLException e){
		    
                        e.printStackTrace();
		    }
            }
        return lista;
    }
    
    public ArrayList BuscarconMatriz2(){
		  
            ArrayList lista = new ArrayList<>();
            int op = 0;
            BDConex bd = new BDConex();
            boolean correcto = false;
            PreparedStatement statement = null;
            ResultSet result = null;
            Connection connection;
		  
            Modelo iv;
            connection = bd.getConexion();
                 
            try {
            
                if (connection != null) {
                
                     result = bd.consultar("SELECT * FROM prestamo P, usuarios U, instrumentos I, "
                             + "estudiantes E, marca_instrumento M, nombre_instrumento N "
                             + "WHERE P.fk_id_usu = U.id_usu AND P.fk_id_estu = E.id_e "
                             + "AND P.fk_id_instru = I.id_instru AND I.fk_nomb_instru = N.id_nombi "
                             + "AND I.fk_marca_instru = M.id_marca AND P.prestamo_terminado = 0 "
                             + "AND fecha_devolucion BETWEEN \"2000-1-1\" AND CURDATE() - INTERVAL 1 DAY ORDER BY fecha_devolucion");
		   
                        while(result.next()== true){
                            
                            iv = new Modelo();
                            iv.setusuario(result.getString("nomb_usu"));
                            iv.setcedula(result.getString("E.cedula_e"));
                            iv.setSerial(result.getString("I.serial_instru"));
                            iv.setfecha_entrega(result.getString("fecha_entrega"));
                            iv.setFecha_devolucion(result.getString("fecha_devolucion"));
                            lista.add(iv);
                        }  
                    }
            }catch (SQLException e) {
                
                System.out.println(e);
                
            }finally{
            
                    try {
                        
                        connection.close();
                        bd.desconectar();
                    
                    }catch (SQLException e){
		    
                        e.printStackTrace();
		    }
            }
        return lista;
    }
}

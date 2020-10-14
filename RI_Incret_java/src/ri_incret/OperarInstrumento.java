package ri_incret;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarInstrumento {

    private Modelo instru = null;

    public Modelo BuscarInstrumento(String serial) {

        this.instru = instru;
        ResultSet rs = null;

        Modelo instru = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM instrumentos I, nombre_instrumento N, marca_instrumento M "
                + "WHERE UPPER(I.serial_instru) = '" + serial + "' AND N.id_nombi = I.fk_nomb_instru "
                + "AND N.borrado_nombi = 0 AND M.id_marca = I.fk_marca_instru AND M.borrado_marca = 0 "
                + "AND I.borrado_instru = 0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                instru.setNombre_instrumento(rs.getString("N.nomb_i"));
                instru.setMarca_instrumento(rs.getString("M.nomb_marca"));
                instru.setColor(rs.getString("color_instru"));
                instru.setDisponible(rs.getBoolean("disponible"));
                instru.setid_instru(rs.getInt("I.id_instru"));
            } else {
                
                JOptionPane.showMessageDialog(null, "El Instrumento no está Registrado \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                instru = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return instru;
    }

    public Modelo BuscarSerial(int id) {

        this.instru = instru;
        ResultSet rs = null;

        Modelo instru = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT *\n" + "FROM prestamo P, instrumentos I\n" + "WHERE P.fk_id_estu = '" + id
                + "'\n" + "AND P.fk_id_instru = I.id_instru AND P.prestamo_terminado = 0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();

                instru.setSerial(rs.getString("I.serial_instru"));

            } else {

                instru.setSerial("Este Estudiante no posee un Instrumento");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return instru;
    }

    public boolean borrar(String serial) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE instrumentos SET borrado_instru=1 WHERE serial_instru= '" + serial + "' AND borrado_instru=0 AND disponible = 1");

        if (op > 0){

            correcto = true;
            JOptionPane.showMessageDialog(null, "El Instrumento fue borrado exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            JOptionPane.showMessageDialog(null, "     Ocurrio un Error al borrar el Instrumento \n Quiza el Instrumento esté en manos de un Estudiante...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean modificar(String serial, String color, int id) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        
        op = bd.ejecutar("UPDATE instrumentos SET color_instru=\"" + color + "\",serial_instru=\"" + serial + "\" WHERE id_instru = " + id + " AND borrado_instru = 0");

        if (op > 0) {

            correcto = true;
            JOptionPane.showMessageDialog(null, "El Instrumento fue modificado exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al modificar el Instrumento \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean RegistrarInstrumento(int id_nombre, int id_marca, String color, String serial) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo instru = null;
        instru = buscar_instrumento(serial);
        
        if(instru == null){
        
            op = bd.ejecutar("INSERT INTO `instrumentos` (`id_instru`, `fk_nomb_instru`, `fk_marca_instru`, "
                    + "`color_instru`, `serial_instru`, `disponible`, `borrado_instru`) "
                    + "VALUES (NULL, '" + id_nombre + "', '" + id_marca + "', '" + color + "', '" + serial + "','1', '0');");

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "El Instrumento se registró exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                 
                JOptionPane.showMessageDialog(null, "Ocurrio un Error al registrar el Instrumento \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
        
            JOptionPane.showMessageDialog(null, "Este Serial ya se encuentra Registrado \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
        return correcto;
    }
    
    public Modelo buscar_instrumento(String serial) {

        this.instru = instru;
        ResultSet rs = null;

        Modelo instru = new Modelo();
        BDConex bd = new BDConex();
        
        rs = bd.consultar("SELECT * FROM instrumentos I, nombre_instrumento N, marca_instrumento M "
                + "WHERE UPPER(I.serial_instru) = '" + serial + "' AND N.id_nombi = I.fk_nomb_instru "
                + "AND N.borrado_nombi = 0 AND M.id_marca = I.fk_marca_instru AND M.borrado_marca = 0 "
                + "AND I.borrado_instru = 0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                instru.setNombre_instrumento(rs.getString("N.nomb_i"));
                instru.setMarca_instrumento(rs.getString("M.nomb_marca"));
                instru.setColor(rs.getString("color_instru"));
                instru.setDisponible(rs.getBoolean("disponible"));
                instru.setid_instru(rs.getInt("I.id_instru"));  
            } else {
                instru = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return instru;
    }
    
    public ArrayList BuscarconMatriz() {

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

                result = bd.consultar("SELECT * FROM instrumentos I, marca_instrumento M, nombre_instrumento "
                        + "N  WHERE I.borrado_instru = 0 AND I.fk_nomb_instru = N.id_nombi "
                        + "AND I.fk_marca_instru = M.id_marca ORDER BY N.nomb_i");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre_instrumento(result.getString("N.nomb_i"));
                    iv.setMarca_instrumento(result.getString("M.nomb_marca"));
                    iv.setColor(result.getString("I.color_instru"));
                    iv.setSerial(result.getString("I.serial_instru"));
                    lista.add(iv);
                }
            }
        } catch (SQLException e) {

            System.out.println(e);

        } finally {

            try {

                connection.close();
                bd.desconectar();

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return lista;
    }
}

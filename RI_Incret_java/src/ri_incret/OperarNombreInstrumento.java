package ri_incret;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarNombreInstrumento {

    private Modelo NombreInstrumento = null;

    public boolean borrar(String nombre) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE nombre_instrumento SET borrado_nombi=1 WHERE nomb_i= \"" + nombre + "\" AND borrado_nombi=0");

        if (op > 0){
            correcto = true;
            JOptionPane.showMessageDialog(null, "El Nombre fue borrado exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al borrar el Nombre \n       Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean RegistrarNombreInstrumento(String nombre) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo NombreInstrumento = null;
        NombreInstrumento = BuscarNombreI(nombre);
        
        if(NombreInstrumento == null){
            
            op = bd.ejecutar("INSERT INTO `nombre_instrumento` (`id_nombi`, `nomb_i`, `borrado_nombi`)"
                + " VALUES (NULL, '" + nombre + "', '0');");

            if (op > 0) {

            correcto = true;
            JOptionPane.showMessageDialog(null, "El Nombre se registró exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } 
            else{
                JOptionPane.showMessageDialog(null, "Ocurrio un Error al registrar el Nombre \n       Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El Nombre del Instrumento ya Existe \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public Modelo BuscarNombreI(String nombre) {

        this.NombreInstrumento = NombreInstrumento;
        ResultSet rs = null;

        Modelo NombreInstrumento = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM `nombre_instrumento` WHERE UPPER(`nomb_i`) = \"" + nombre + "\" AND `borrado_nombi`=0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                NombreInstrumento.setNombre_instrumento(rs.getString("nomb_i"));
            } else {

                NombreInstrumento = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return NombreInstrumento;
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

                result = bd.consultar("SELECT * FROM `nombre_instrumento` WHERE `borrado_nombi` = 0 ORDER BY nomb_i");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre_instrumento(result.getString("nomb_i"));
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

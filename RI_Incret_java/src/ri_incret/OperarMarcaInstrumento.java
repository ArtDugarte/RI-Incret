package ri_incret;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarMarcaInstrumento {

    private Modelo MarcaInstrumento = null;

    public boolean borrar(String marca){

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE marca_instrumento SET borrado_marca=1 WHERE nomb_marca= '" + marca + "' AND borrado_marca=0");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "La Marca fue borrada exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al borrar la Marca \n       Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean RegistrarMarcaInstrumento(String marca) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo MarcaInstrumento = null;
        MarcaInstrumento = BuscarMacaI(marca);

        if (MarcaInstrumento == null) {
            op = bd.ejecutar("INSERT INTO `marca_instrumento` (`id_marca`, `nomb_marca`, `borrado_marca`) "
                    + "VALUES (NULL, '" + marca + "', '0');");

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "La Marca se registró exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                   
                JOptionPane.showMessageDialog(null, "Ocurrio un Error al registrar la Marca \n       Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            
            JOptionPane.showMessageDialog(null, "La Marca del Instrumento ya Existe \n         Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public Modelo BuscarMacaI(String marca) {

        this.MarcaInstrumento = MarcaInstrumento;
        ResultSet rs = null;

        Modelo MarcaInstrumento = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM `marca_instrumento` WHERE UPPER(`nomb_marca`)= \"" + marca + "\" AND `borrado_marca` = 0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                MarcaInstrumento.setMarca_instrumento(rs.getString("nomb_marca"));
            } else {

                MarcaInstrumento = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return MarcaInstrumento;
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

                result = bd.consultar("SELECT * FROM `marca_instrumento` WHERE `borrado_marca`=0 ORDER BY nomb_marca");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setMarca_instrumento(result.getString("nomb_marca"));
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

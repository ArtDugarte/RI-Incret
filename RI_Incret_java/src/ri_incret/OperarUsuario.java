package ri_incret;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarUsuario {

    private Modelo usuario = null;

    public boolean modificar(String usuario, String clave_vieja, String clave_nueva) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE usuarios SET clave_usu=\"" + clave_nueva + "\" WHERE clave_usu=\"" + clave_vieja + "\" AND nomb_usu = \"" + usuario + "\"");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "La Contraseña se modificó exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {            
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al modificar la Contraseña \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean RegistrarUsuario(String user, String contraseña, int administrador) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo usuario = null;
        usuario = buscar_user(user);

        if (usuario == null) {
            op = bd.ejecutar("INSERT INTO `usuarios` (`id_usu`, `nomb_usu`, `clave_usu`, `administrador`) "
                    + "VALUES (NULL, '" + user + "', '" + contraseña + "', '" + administrador + "');");

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "El Usuario se registró exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un Error al registrar el Usuario \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este Nombre de Usuario no está Disponible \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public Modelo buscar_user(String user) {

        this.usuario = usuario;
        ResultSet rs = null;

        Modelo usuario = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM `usuarios` WHERE `nomb_usu` = \"" + user + "\"");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                usuario.setAdministrador(rs.getBoolean("administrador"));
            } else {
                usuario = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return usuario;
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

                result = bd.consultar("SELECT * FROM usuarios WHERE 1");

                while (result.next() == true) {

                    iv = new Modelo();
                    iv.setusuario(result.getString("nomb_usu"));
                    iv.setAdministrador(result.getBoolean("administrador"));
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

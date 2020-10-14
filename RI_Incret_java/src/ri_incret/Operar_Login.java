package ri_incret;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Operar_Login {
    
    private Modelo login = null;
    
	public Modelo IngresarUsuario(String usuario, String clave) {

            this.login = login;
            ResultSet rs = null;

            Modelo login = new Modelo();
            BDConex bd = new BDConex();

            rs = bd.consultar("SELECT * FROM usuarios WHERE nomb_usu='" + usuario + "' and clave_usu='" + clave + "';");

            try {
                if (rs.first()) {
                    rs.beforeFirst();
                    rs.next();
                    login.setAdministrador(rs.getBoolean("administrador"));
                    login.setid_usuario(rs.getInt("id_usu"));
		}else{
                    JOptionPane.showMessageDialog(null, "El Usuario o contraseña no existe en la Base de Datos.","¡ERROR!",JOptionPane.ERROR_MESSAGE);
                    login = null;
		}
		}catch (SQLException e) {
                    e.printStackTrace();
		}
	return login;
    }    
}

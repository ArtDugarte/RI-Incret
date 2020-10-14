package ri_incret;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.PreparedStatement;

public class DesplegableNombre {
    
    public ArrayList DesplegableNombre() {
		  
        ArrayList nombres = new ArrayList<>();
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
                
		    result = bd.consultar("SELECT *\n" + "FROM `nombre_instrumento`\n" + "WHERE `borrado_nombi` =0");
		   
		    while(result.next()== true){
                        iv = new Modelo();
                        iv.setId_nombre(Integer.parseInt(result.getString("id_nombi")));
                        iv.setNombre_instrumento(result.getString("nomb_i"));
		          
                        nombres.add(iv);
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
        return nombres;
    }   
}

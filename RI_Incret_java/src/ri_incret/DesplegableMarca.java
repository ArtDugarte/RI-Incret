package ri_incret;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.PreparedStatement;

public class DesplegableMarca {
    
   public ArrayList DesplegableMarca() {
		  
        ArrayList marcas = new ArrayList<>();
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
                
		    result = bd.consultar("SELECT * FROM `marca_instrumento` WHERE `borrado_marca`=0");
		   
		    while(result.next()== true){
                        iv = new Modelo();
                        iv.setId_marca(Integer.parseInt(result.getString("id_marca")));
                        iv.setMarca_instrumento(result.getString("nomb_marca"));
		          
                        marcas.add(iv);
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
        return marcas;
    }
}
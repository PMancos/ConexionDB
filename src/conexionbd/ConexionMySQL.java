/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author admin1
 */
public class ConexionMySQL {
    
    public String db="amigos";
    public String url="jdbc:mysql://localhost/"+db;
    public String user="root";
    public String pass="";

    public ConexionMySQL() {
    }
    
    public Connection Conectar(){
        
        Connection link=null;
        
        try {
            //cargar driver MySQL
            Class.forName("org.gjt.mm.mysql.Driver");
            
                //crear el enlace a la base de datos
                link=(Connection) DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        return link;
    }
}

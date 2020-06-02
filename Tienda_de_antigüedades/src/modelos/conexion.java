
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
    
    Connection con;
    /*Cambiar los siguientes datos dependiendo la base de datos!
    -Esto es el nombre de la base de datos... vvvv */
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    //La contraseña puede que sea 'admin'
    String pass = "12345";

    public Connection Conectar(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion!");
        }

        return con;  
    }
    
}


package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;
    
    public Usuario ValidarUsuario(String id_usuario, String contraseña){
        Usuario us = new Usuario();
        String sql = "select * from usuario where Id_User=? and Contraseña=?";
        
        try {
            
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1 ,id_usuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            while(rs.next()){
                us.setId_user(rs.getString(1));
                us.setContraseña( rs.getString(3) );
            }
        } catch(Exception e){
            
        }
        return us;
    }
}

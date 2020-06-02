
package modelos;

public class Usuario {
    
    String id_user;
    String contraseña;
    
    public Usuario(){
        
    }

    public Usuario(String id_user, String contraseña) {
        this.id_user = id_user;
        this.contraseña = contraseña;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}

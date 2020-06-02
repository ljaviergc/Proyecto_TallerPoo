
package modelos;


public class Inventario {
    int id_pza;
    String nom_pza;
    int cant_pza;
    float pre_pza;
    
    public Inventario(){
        
    }

    public Inventario(int id_pza, String nom_pza, int cant_pza, float pre_pza) {
        this.id_pza = id_pza;
        this.nom_pza = nom_pza;
        this.cant_pza = cant_pza;
        this.pre_pza = pre_pza;
    }

    public int getId_pza() {
        return id_pza;
    }

    public void setId_pza(int id_pza) {
        this.id_pza = id_pza;
    }

    public String getNom_pza() {
        return nom_pza;
    }

    public void setNom_pza(String nom_pza) {
        this.nom_pza = nom_pza;
    }

    public int getCant_pza() {
        return cant_pza;
    }

    public void setCant_pza(int cant_pza) {
        this.cant_pza = cant_pza;
    }

    public float getPre_pza() {
        return pre_pza;
    }

    public void setPre_pza(float pre_pza) {
        this.pre_pza = pre_pza;
    }


    
    
}
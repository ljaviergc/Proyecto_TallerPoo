
package modelos;


public class Venta {
    int id_venta;
    String id_piezas;
    String fecha_venta;
    float pre_venta;
    int id_pza;
    String nom_pza;
    int cant_pza;
    float pre_pza;
    
    public Venta(){
        
    }

    public Venta(int id_venta, String id_piezas, String fecha_venta, float pre_venta, int id_pza, String nom_pza, int cant_pza, float pre_pza) {
        this.id_venta = id_venta;
        this.id_piezas = id_piezas;
        this.fecha_venta = fecha_venta;
        this.pre_venta = pre_venta;
        this.id_pza = id_pza;
        this.nom_pza = nom_pza;
        this.cant_pza = cant_pza;
        this.pre_pza = pre_pza;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getId_piezas() {
        return id_piezas;
    }

    public void setId_piezas(String id_piezas) {
        this.id_piezas = id_piezas;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public float getPre_venta() {
        return pre_venta;
    }

    public void setPre_venta(float pre_venta) {
        this.pre_venta = pre_venta;
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

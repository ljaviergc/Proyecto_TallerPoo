
package modelos;


public class Registro {
    int id_venta;
    String id_pzas;
    int cantidad_pzas;
    String fecha_venta;
    float total_venta;
    
    public Registro(){
        
    }

    public Registro(int id_venta, String id_pzas, String fecha_venta, float total_venta) {
        this.id_venta = id_venta;
        this.id_pzas = id_pzas;
        this.fecha_venta = fecha_venta;
        this.total_venta = total_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getId_pzas() {
        return id_pzas;
    }

    public void setId_pzas(String id_pzas) {
        this.id_pzas = id_pzas;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public float getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(float total_venta) {
        this.total_venta = total_venta;
    }
    
    
}







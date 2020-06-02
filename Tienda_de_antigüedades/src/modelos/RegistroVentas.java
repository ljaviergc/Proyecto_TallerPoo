
package modelos;

public class RegistroVentas {
    int id_venta;
    String id_piezas;
    String fecha_venta;
    String pre_venta;
    
    public RegistroVentas(){
        
    }

    public RegistroVentas(int id_venta, String id_piezas, String fecha_venta, String pre_venta) {
        this.id_venta = id_venta;
        this.id_piezas = id_piezas;
        this.fecha_venta = fecha_venta;
        this.pre_venta = pre_venta;
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

    public String getPre_venta() {
        return pre_venta;
    }

    public void setPre_venta(String pre_venta) {
        this.pre_venta = pre_venta;
    }
    
    
}

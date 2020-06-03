
package modelos;


public class DetalleVenta {
    int id;
    String id_piezas;
    int cantidad;
    float pre_venta;
    
    public DetalleVenta(){
        
    }

    public DetalleVenta(int id, String id_piezas, int cantidad, float pre_venta) {
        this.id = id;
        this.id_piezas = id_piezas;
        this.cantidad = cantidad;
        this.pre_venta = pre_venta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_piezas() {
        return id_piezas;
    }

    public void setId_piezas(String id_piezas) {
        this.id_piezas = id_piezas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPre_venta() {
        return pre_venta;
    }

    public void setPre_venta(float pre_venta) {
        this.pre_venta = pre_venta;
    }
    
}

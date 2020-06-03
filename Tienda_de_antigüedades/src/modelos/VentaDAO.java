
package modelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaDAO {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    int r = 0;
    
    public String Idventa(){
        String idv ="";
        String sql = "select max(id_venta) from venta";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                idv = rs.getString(1);
            }
        }catch(Exception e){
                
        }
        return idv;
    }
    
    public int DetalleVenta(DetalleVenta dv){
        String sql = "insert into detalle_venta(id_piezas,cantidad,pre_venta)values(?,?,?)";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dv.getId_piezas());
            ps.setInt(2, dv.getCantidad());
            ps.setFloat(3, dv.getPre_venta());
            r = ps.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar registrar el Detalle!");
        }
        return r;
    }
    
    public int RegistrarVenta(Venta v){
        Venta ven = new Venta();
        String sql = "insert into venta(id_piezas,fecha,pre_venta)values(?,?,?)";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getId_piezas());
            ps.setString(2, v.getFecha());
            ps.setFloat(3, v.getPre_venta()); 
            r = ps.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar registrar la venta!");
        }
        return r;
    }
    
    
}

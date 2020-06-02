
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class RegistroVentasDAO implements CRUD{
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar(){
        List<RegistroVentas> lista = new ArrayList<>();
        String sql = "select * from detalle_ventas";
        
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                RegistroVentas rv = new RegistroVentas();
                rv.setId_venta(rs.getInt(1));
                rv.setId_piezas(rs.getString(2));
                rv.setFecha_venta(rs.getString(3));
                rv.setPre_venta(rs.getString(4));
                lista.add(rv);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar listar.");
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}

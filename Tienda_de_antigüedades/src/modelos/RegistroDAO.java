
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RegistroDAO implements CRUD{
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Registro> lista = new ArrayList<>();
         String sql = "select * from ventas";
                  
         try{
             con = cn.Conectar();
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
             
             while ( rs.next() ){
                 Registro reg = new Registro();
                 reg.setId_venta( rs.getInt(1) );
                 reg.setId_pzas( rs.getString(2) );
                 reg.setFecha_venta( rs.getString(3) );
                 reg.setTotal_venta( rs.getFloat(4) );
                 lista.add(reg);
             }
             
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al intentar listar!");
         }
         return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into ventas(id_pzas,fecha_venta,total_venta)values(?,?,?)";
        
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3 , o[2]);
            r = ps.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar agregar!");
        }
        return r;
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

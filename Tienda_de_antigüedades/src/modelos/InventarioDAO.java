
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InventarioDAO implements CRUD{
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    int r;
    
    public Inventario listarId(int id_pza){
        Inventario i = new Inventario();
        String sql = "select * from piezas where id_pza=?";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_pza);
            rs = ps.executeQuery();
            while(rs.next()){
                i.setId_pza(rs.getInt(1));
                i.setNom_pza(rs.getString(2));
                i.setCant_pza(rs.getInt(3));
                i.setPre_pza(rs.getFloat(4));
            }
        }catch(Exception e){
            
        }
        return i;
    }
    
    public int actualizarInventario(int cant, int idpza){
        String sql = "update piezas set cant_pza=? where id_pza=?";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idpza);
            ps.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar el inventario!");
        }
        return r;
    }
    
    @Override
    public List listar() {
         List<Inventario> lista = new ArrayList<>();
         String sql = "select * from piezas";
                  
         try{
             con = cn.Conectar();
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
             
             while ( rs.next() ){
                 Inventario inv = new Inventario();
                 inv.setId_pza( rs.getInt(1) );
                 inv.setNom_pza( rs.getString(2) );
                 inv.setCant_pza( rs.getInt(3) );
                 inv.setPre_pza( rs.getFloat(4) );
                 lista.add(inv);
             }
             
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al intentar listar!");
         }
         return lista;
    }

    @Override
    public int add(Object[] o) {
        r = 0;
        String sql = "insert into piezas(nom_pza,cant_pza,pre_pza)values(?,?,?)";
        
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
        r = 0;
        String sql = "update piezas set nom_pza=?,cant_pza=?,pre_pza=? where id_pza=?";
        
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar!");
        }
        
        return 0;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from piezas where id_pza=?";
        
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar!");
        }
    }

   
    

    
}

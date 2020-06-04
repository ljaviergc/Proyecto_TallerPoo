
package vistas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Inventario;
import modelos.InventarioDAO;
import modelos.Registro;
import modelos.RegistroDAO;



public class VentaForm extends javax.swing.JFrame {
    

    InventarioDAO idao = new InventarioDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    Inventario inv = new Inventario();
    Registro reg = new Registro();
    RegistroDAO rdao = new RegistroDAO();
    
    float Total;
    int cantpza;
    float subtotal;

    
    public VentaForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        Calendar calendario = new GregorianCalendar();
        txtFecha.setText("" + calendario.get(Calendar.DAY_OF_MONTH) + "/" + calendario.get(Calendar.MONTH) + "/" + calendario.get(Calendar.YEAR));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ventaPieza = new javax.swing.JTextField();
        ventaPrecio = new javax.swing.JTextField();
        btnAddITem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarPza = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        ventaDisponible = new javax.swing.JTextField();
        ventaCant = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEfectivo = new javax.swing.JRadioButton();
        btnTarjeta = new javax.swing.JRadioButton();
        btnFinalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ventaNTarjeta = new javax.swing.JTextField();
        txtPIN = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtFecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Venta = new javax.swing.JTable();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta"));

        jLabel1.setText("ID Pieza:");

        jLabel4.setText("Precio:");

        btnAddITem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N
        btnAddITem.setText("AGREGAR");
        btnAddITem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddITemActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        btnBuscarPza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnify.png"))); // NOI18N
        btnBuscarPza.setText("BUSCAR");
        btnBuscarPza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPzaActionPerformed(evt);
            }
        });

        jLabel8.setText("Disponibles:");

        jLabel3.setText("Cantidad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ventaCant, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddITem))
                    .addComponent(ventaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ventaPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPza))
                    .addComponent(ventaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ventaPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPza))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ventaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ventaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddITem)
                        .addComponent(ventaCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodo de Pago"));

        btnEfectivo.setText("Efectivo");

        btnTarjeta.setText("Tarjeta");

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/currency-usd.png"))); // NOI18N
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero:");

        jLabel6.setText("PIN:");

        jLabel7.setText("TOTAL:");

        txtFecha.setText("dd/mm/aa");

        jLabel9.setText("Fecha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEfectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ventaNTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTarjeta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFinalizar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEfectivo)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnTarjeta))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ventaNTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cart.png"))); // NOI18N
        btnInventario.setText("INVENTARIO");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        Tabla_Venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre Producto", "Cantidad", "Total"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Venta);

        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/database.png"))); // NOI18N
        btnRegistro.setText("REGISTRO");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInventario)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistro)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        InventarioForm invf = new InventarioForm();
        invf.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r = 0;
        r = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea salir?");
        if(r == 0){
            Login lg = new Login();
            lg.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAddITemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddITemActionPerformed
       agregarPieza();
    }//GEN-LAST:event_btnAddITemActionPerformed

    void agregarPieza() {
        
        
        modelo = (DefaultTableModel)Tabla_Venta.getModel();
        String idp = ventaPieza.getText();
        String nompza = jTextField1.getText();
        float prepza = Float.parseFloat(ventaPrecio.getText());
        cantpza = Integer.parseInt(ventaCant.getValue().toString());
        int dispza = Integer.parseInt(ventaDisponible.getText());
        subtotal = cantpza * prepza;
        ArrayList lista = new ArrayList();
        if( dispza > 0 && cantpza <= dispza){
            
            lista.add(idp);
            lista.add(nompza);
            lista.add(cantpza);
            lista.add(subtotal);
            Object[] ob = new Object[4];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);   
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            modelo.addRow(ob);
            Tabla_Venta.setModel(modelo);
            calcularTotal();
        }
        else{
            JOptionPane.showMessageDialog(this, "Cantidad de piezas no disponible!");
            ventaCant.requestFocus();
        }
    }
    
    void calcularTotal(){
        Total = 0;
        for(int i = 0 ; i < Tabla_Venta.getRowCount() ; i++){
            subtotal = Float.parseFloat(Tabla_Venta.getValueAt(i, 3).toString());
            Total = Total + subtotal;
        }
        txtTotal.setText("" + Total);
    }
    
    private void btnBuscarPzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPzaActionPerformed
         buscarPieza();
         actualizarInventario();
    }//GEN-LAST:event_btnBuscarPzaActionPerformed
    void buscarPieza(){
        int id = Integer.parseInt(ventaPieza.getText());
        if(ventaPieza.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Debe ingresar el ID de la Pieza!");
        }
        else{
            Inventario inv = idao.listarId(id);
            if(inv.getId_pza() != 0){
                jTextField1.setText(inv.getNom_pza());
                ventaPrecio.setText("" + inv.getPre_pza());
                ventaDisponible.setText("" + inv.getCant_pza());
            }
            else{
                JOptionPane.showMessageDialog(this, "Pieza no encontrada!");
                ventaPieza.requestFocus();
            }
        }
    }
    
    void actualizarInventario(){
        int idpza;
        int cant;
        for(int i = 0 ; i < Tabla_Venta.getRowCount() ; i++){
            Inventario inv = new Inventario();
            idpza = Integer.parseInt(Tabla_Venta.getValueAt(i, 0).toString());
            cant = Integer.parseInt(Tabla_Venta.getValueAt(i, 2).toString());
            inv = idao.listarId(idpza);
            int inva = inv.getCant_pza() - cant;
            idao.actualizarInventario(inva, idpza); 
        }
    }
    
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if(txtTotal.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe de agregar piezas!");
        }
        else{
            if(ventaNTarjeta.getText().equals("") || txtPIN.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Debe ingresar datos del pago!"); 
            }
            else{
                agregarRegistro();
                Limpiar();
                JOptionPane.showMessageDialog(this, "Venta completada!");
            }
        }
        
        
    }//GEN-LAST:event_btnFinalizarActionPerformed
    void agregarRegistro(){
        String idpz = "";
        String piezas = "";
        for(int i = 0 ; i < Tabla_Venta.getRowCount() ; i++){
            idpz = Tabla_Venta.getValueAt(i, 0).toString();
            piezas = piezas + idpz;
            if (i < Tabla_Venta.getRowCount()-1){
                    piezas = piezas + ", ";
            }
            
        }
        String fecha_venta = txtFecha.getText();
        String total_venta = txtTotal.getText();
        Object[] ob = new Object[3];
        ob[0] = piezas;
        ob[1] = fecha_venta;
        ob[2] = total_venta;
        rdao.add(ob);
    }
    
    void Limpiar(){
       for(int i = 0 ; i < modelo.getRowCount() ; i++){
           modelo.removeRow(i);
           i = i - 1;
       }
       ventaPieza.setText("");
       jTextField1.setText("");
       ventaPrecio.setText("");
       ventaDisponible.setText("");
       ventaCant.setValue(0);
       txtTotal.setText("");
       ventaNTarjeta.setText("");
       txtPIN.setText("");
       ventaPieza.requestFocus();
       
    }
    
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        RegistroForm rf = new RegistroForm();
        rf.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed
    
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Venta;
    private javax.swing.JButton btnAddITem;
    private javax.swing.JButton btnBuscarPza;
    private javax.swing.JRadioButton btnEfectivo;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JRadioButton btnTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JPasswordField txtPIN;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JSpinner ventaCant;
    private javax.swing.JTextField ventaDisponible;
    private javax.swing.JTextField ventaNTarjeta;
    private javax.swing.JTextField ventaPieza;
    private javax.swing.JTextField ventaPrecio;
    // End of variables declaration//GEN-END:variables


    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cl.paradigma.test2.main;
import cl.paradigma.test2.vender.VistaVenta;
import cl.paradigma.test2.almacen.VistaAlmacenes;
import cl.paradigma.test2.bodega.VistaBodegas;
import cl.paradigma.test2.caja.VistaCaja;
import cl.paradigma.test2.producto.VistaProductos;
import cl.paradigma.test2.stock.VistaStock;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() 
    {
        initComponents();
        initConten();
    }
    private void initConten()
    {
        ShowJPanel(new VistaVenta());

    }
        public static void ShowJPanel(JPanel i1)
    {
        i1.setSize(497, 428);
        i1.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(i1,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        boton_productos = new javax.swing.JButton();
        boton_bodegas = new javax.swing.JButton();
        boton_Almacenes = new javax.swing.JButton();
        boton_venta = new javax.swing.JButton();
        boton_stock = new javax.swing.JButton();
        boton_caja = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setName(""); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(679, 440));

        panel_menu.setBackground(new java.awt.Color(0, 153, 51));

        boton_productos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_productos.setText("Administrar Productos");
        boton_productos.setBorder(null);
        boton_productos.setBorderPainted(false);
        boton_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_productosActionPerformed(evt);
            }
        });

        boton_bodegas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_bodegas.setText("Administrar Bodegas");
        boton_bodegas.setBorder(null);
        boton_bodegas.setBorderPainted(false);
        boton_bodegas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_bodegas.setPreferredSize(new java.awt.Dimension(36, 20));
        boton_bodegas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_bodegasActionPerformed(evt);
            }
        });

        boton_Almacenes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_Almacenes.setText("Administrar Almacenes");
        boton_Almacenes.setBorder(null);
        boton_Almacenes.setBorderPainted(false);
        boton_Almacenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Almacenes.setPreferredSize(new java.awt.Dimension(36, 20));
        boton_Almacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AlmacenesActionPerformed(evt);
            }
        });

        boton_venta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_venta.setText("Venta");
        boton_venta.setBorder(null);
        boton_venta.setBorderPainted(false);
        boton_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ventaActionPerformed(evt);
            }
        });

        boton_stock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_stock.setText("Stock De Productos");
        boton_stock.setBorder(null);
        boton_stock.setBorderPainted(false);
        boton_stock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_stockActionPerformed(evt);
            }
        });

        boton_caja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_caja.setText("Cajas");
        boton_caja.setBorder(null);
        boton_caja.setBorderPainted(false);
        boton_caja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_caja.setPreferredSize(new java.awt.Dimension(37, 20));
        boton_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_Almacenes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_bodegas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(boton_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_Almacenes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_bodegas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panel_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_productosActionPerformed
        ShowJPanel(new VistaProductos());
    }//GEN-LAST:event_boton_productosActionPerformed

    private void boton_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ventaActionPerformed
        ShowJPanel(new VistaVenta());
    }//GEN-LAST:event_boton_ventaActionPerformed

    private void boton_bodegasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_bodegasActionPerformed
        ShowJPanel(new VistaBodegas());        
    }//GEN-LAST:event_boton_bodegasActionPerformed

    private void boton_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_stockActionPerformed
        ShowJPanel(new VistaStock());  
    }//GEN-LAST:event_boton_stockActionPerformed

    private void boton_AlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AlmacenesActionPerformed
        ShowJPanel(new VistaAlmacenes());  
    }//GEN-LAST:event_boton_AlmacenesActionPerformed

    private void boton_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cajaActionPerformed
        ShowJPanel(new VistaCaja()); 
    }//GEN-LAST:event_boton_cajaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //para agregar nuevos diseños
        FlatGradiantoNatureGreenIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Almacenes;
    private javax.swing.JButton boton_bodegas;
    private javax.swing.JButton boton_caja;
    private javax.swing.JButton boton_productos;
    private javax.swing.JButton boton_stock;
    private javax.swing.JButton boton_venta;
    private static javax.swing.JPanel contenido;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables
}

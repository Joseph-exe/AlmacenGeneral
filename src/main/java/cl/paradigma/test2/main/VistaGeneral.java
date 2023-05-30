/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cl.paradigma.test2.main;
import cl.paradigma.test2.bodega.VistaBodega;
import cl.paradigma.test2.producto.VistaProductos;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class VistaGeneral extends javax.swing.JFrame {

    public VistaGeneral() 
    {
        initComponents();
        initConten();
    }
    private void initConten()
    {
        ShowJPanel(new VistaInicio());

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
        boton_administrar_productos = new javax.swing.JButton();
        boton_administrar_bodegas = new javax.swing.JButton();
        boton_caja = new javax.swing.JButton();
        boton_inicio = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setName(""); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(679, 440));

        panel_menu.setBackground(new java.awt.Color(0, 153, 51));

        boton_administrar_productos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_administrar_productos.setText("Administrar Productos");
        boton_administrar_productos.setBorder(null);
        boton_administrar_productos.setBorderPainted(false);
        boton_administrar_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_administrar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_administrar_productosActionPerformed(evt);
            }
        });

        boton_administrar_bodegas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_administrar_bodegas.setText("Administrar Bodegas");
        boton_administrar_bodegas.setBorder(null);
        boton_administrar_bodegas.setBorderPainted(false);
        boton_administrar_bodegas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_administrar_bodegas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_administrar_bodegasActionPerformed(evt);
            }
        });

        boton_caja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_caja.setText("Caja");
        boton_caja.setBorder(null);
        boton_caja.setBorderPainted(false);
        boton_caja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton_inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_inicio.setText("Inicio");
        boton_inicio.setBorder(null);
        boton_inicio.setBorderPainted(false);
        boton_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_inicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_administrar_bodegas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_administrar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(boton_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_administrar_bodegas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(boton_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(boton_administrar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGap(0, 428, Short.MAX_VALUE)
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
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_administrar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_administrar_productosActionPerformed
        ShowJPanel(new VistaProductos());
    }//GEN-LAST:event_boton_administrar_productosActionPerformed

    private void boton_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_inicioActionPerformed
        ShowJPanel(new VistaInicio());
    }//GEN-LAST:event_boton_inicioActionPerformed

    private void boton_administrar_bodegasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_administrar_bodegasActionPerformed
        ShowJPanel(new VistaBodega());
    }//GEN-LAST:event_boton_administrar_bodegasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //para agregar nuevos diseños
        FlatGradiantoNatureGreenIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGeneral().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_administrar_bodegas;
    private javax.swing.JButton boton_administrar_productos;
    private javax.swing.JButton boton_caja;
    private javax.swing.JButton boton_inicio;
    private static javax.swing.JPanel contenido;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables
}

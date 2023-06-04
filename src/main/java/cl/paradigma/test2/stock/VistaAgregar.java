/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.stock;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class VistaAgregar extends javax.swing.JPanel 
{
    
    private ControladorAgregar controlador;
    
    public VistaAgregar() {
        initComponents();
        controlador = new ControladorAgregar(this);
        controlador.edicion();
    }

    public VistaAgregar(ModeloStock stock) {
        initComponents();
        controlador = new ControladorAgregar(this, stock);
        controlador.edicion();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        boton_registrar = new javax.swing.JButton();
        texto_id = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JLabel();
        texto_precio = new javax.swing.JLabel();
        id_bodega_entrada = new javax.swing.JTextField();
        id_producto_entrada = new javax.swing.JTextField();
        stock_entrada = new javax.swing.JTextField();
        texto_de_registro = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(497, 428));

        fondo.setPreferredSize(new java.awt.Dimension(497, 428));

        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        texto_id.setText("ID Bodega");

        texto_nombre.setText("ID Producto");

        texto_precio.setText("Stock");

        texto_de_registro.setText("Panel de Registro");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(texto_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_bodega_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(texto_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(id_producto_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(texto_de_registro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(texto_precio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stock_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_de_registro)
                .addGap(81, 81, 81)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_bodega_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_producto_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_nombre))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stock_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_precio))
                .addGap(107, 107, 107)
                .addComponent(boton_registrar)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarActionPerformed
    controlador.boton();
    }//GEN-LAST:event_boton_registrarActionPerformed

    public JLabel getTexto_de_registro() {
        return texto_de_registro;
    }

    public JButton getBoton_registrar() {
        return boton_registrar;
    }
    
    public JTextField getId_bodega_entrada() {
        return id_bodega_entrada;
    }

    public JTextField getId_producto_entrada() {
        return id_producto_entrada;
    }

    public JTextField getStock_entrada() {
        return stock_entrada;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_registrar;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_bodega_entrada;
    private javax.swing.JTextField id_producto_entrada;
    private javax.swing.JTextField stock_entrada;
    private javax.swing.JLabel texto_de_registro;
    private javax.swing.JLabel texto_id;
    private javax.swing.JLabel texto_nombre;
    private javax.swing.JLabel texto_precio;
    // End of variables declaration//GEN-END:variables
}

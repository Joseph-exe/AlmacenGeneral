/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.boleta.detalles;

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

    public VistaAgregar(ModeloBoletaDetalle negocio) {
        initComponents();
        controlador = new ControladorAgregar(this, negocio);
        controlador.edicion();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        boton_registrar = new javax.swing.JButton();
        id_texto = new javax.swing.JLabel();
        producto_texto = new javax.swing.JLabel();
        cantidad_texto = new javax.swing.JLabel();
        id_boleta_entrada = new javax.swing.JTextField();
        id_producto_entrada = new javax.swing.JTextField();
        cantidad_entrada = new javax.swing.JTextField();
        texto_de_registro = new javax.swing.JLabel();
        precio_texto = new javax.swing.JLabel();
        precio_entrada = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(497, 428));

        fondo.setPreferredSize(new java.awt.Dimension(497, 428));

        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        id_texto.setText("ID Boleta");

        producto_texto.setText("ID Producto");

        cantidad_texto.setText("Cantidad");

        id_producto_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_producto_entradaActionPerformed(evt);
            }
        });

        texto_de_registro.setText("Panel de Regitro");

        precio_texto.setText("Precio");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(texto_de_registro))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(cantidad_texto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addComponent(cantidad_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_texto)
                                    .addComponent(producto_texto)
                                    .addComponent(precio_texto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(id_producto_entrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(precio_entrada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_boleta_entrada))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_de_registro)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_texto)
                    .addComponent(id_boleta_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_texto)
                    .addComponent(id_producto_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_texto)
                    .addComponent(cantidad_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_texto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(boton_registrar)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarActionPerformed
    controlador.boton();
    }//GEN-LAST:event_boton_registrarActionPerformed

    private void id_producto_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_producto_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_producto_entradaActionPerformed

    public JButton getBoton_registrar() {
        return boton_registrar;
    }

    public JLabel getTexto_de_registro() {
        return texto_de_registro;
    }

    public JTextField getCantidad_entrada() {
        return cantidad_entrada;
    }

    public JTextField getId_boleta_entrada() {
        return id_boleta_entrada;
    }

    public JTextField getId_producto_entrada() {
        return id_producto_entrada;
    }

    public JTextField getPrecio_entrada() {
        return precio_entrada;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_registrar;
    private javax.swing.JTextField cantidad_entrada;
    private javax.swing.JLabel cantidad_texto;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_boleta_entrada;
    private javax.swing.JTextField id_producto_entrada;
    private javax.swing.JLabel id_texto;
    private javax.swing.JTextField precio_entrada;
    private javax.swing.JLabel precio_texto;
    private javax.swing.JLabel producto_texto;
    private javax.swing.JLabel texto_de_registro;
    // End of variables declaration//GEN-END:variables
}

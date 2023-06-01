/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.bodega;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaAgregar extends javax.swing.JPanel 
{
    
    private ControladorAgregarBodega controlador;
    
    public VistaAgregar() {
        initComponents();
        controlador = new ControladorAgregarBodega(this);
        controlador.edicion();
    }

    public VistaAgregar(ModeloBodega negocio) {
        initComponents();
        controlador = new ControladorAgregarBodega(this, negocio);
        controlador.edicion();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        boton_registrar = new javax.swing.JButton();
        texto_id = new javax.swing.JLabel();
        texto_id_almacen = new javax.swing.JLabel();
        texto_peso_maximo = new javax.swing.JLabel();
        id_bodega_insertar = new javax.swing.JTextField();
        id_almacen_insertar = new javax.swing.JTextField();
        peso_max_insertar = new javax.swing.JTextField();
        texto_de_registro = new javax.swing.JLabel();
        texto_volumen_maximo = new javax.swing.JLabel();
        volumen_max_insertar = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(497, 428));

        fondo.setPreferredSize(new java.awt.Dimension(497, 428));

        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        texto_id.setText("ID de la bodega");

        texto_id_almacen.setText("ID del almacen");

        texto_peso_maximo.setText("Peso Maximo");

        id_almacen_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_almacen_insertarActionPerformed(evt);
            }
        });

        texto_de_registro.setText("Panel de Regitro");

        texto_volumen_maximo.setText("Volumen_Maximo");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(texto_peso_maximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(peso_max_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texto_id)
                                    .addComponent(texto_id_almacen)
                                    .addComponent(texto_volumen_maximo))
                                .addGap(113, 113, 113)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(id_almacen_insertar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                    .addComponent(volumen_max_insertar)
                                    .addComponent(id_bodega_insertar, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_de_registro)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_id)
                    .addComponent(id_bodega_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_id_almacen)
                    .addComponent(id_almacen_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_peso_maximo)
                    .addComponent(peso_max_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volumen_max_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_volumen_maximo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(boton_registrar)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarActionPerformed
    controlador.boton();
    }//GEN-LAST:event_boton_registrarActionPerformed

    private void id_almacen_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_almacen_insertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_almacen_insertarActionPerformed

    public JButton getBoton_registrar() {
        return boton_registrar;
    }

    public JTextField getId_bodega_insertar() {
        return id_bodega_insertar;
    }

    public JLabel getTexto_de_registro() {
        return texto_de_registro;
    }

    public JTextField getId_almacen_insertar() {
        return id_almacen_insertar;
    }

    public JTextField getPeso_max_insertar() {
        return peso_max_insertar;
    }

    public JTextField getVolumen_max_insertar() {
        return volumen_max_insertar;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_registrar;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_almacen_insertar;
    private javax.swing.JTextField id_bodega_insertar;
    private javax.swing.JTextField peso_max_insertar;
    private javax.swing.JLabel texto_de_registro;
    private javax.swing.JLabel texto_id;
    private javax.swing.JLabel texto_id_almacen;
    private javax.swing.JLabel texto_peso_maximo;
    private javax.swing.JLabel texto_volumen_maximo;
    private javax.swing.JTextField volumen_max_insertar;
    // End of variables declaration//GEN-END:variables
}

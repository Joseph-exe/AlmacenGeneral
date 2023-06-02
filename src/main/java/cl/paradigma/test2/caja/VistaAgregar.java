/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.caja;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaAgregar extends javax.swing.JPanel 
{
    
    private ControladorAgregarCaja controlador;
    
    public VistaAgregar() {
        initComponents();
        controlador = new ControladorAgregarCaja(this);
        controlador.edicion();
    }

    public VistaAgregar(ModeloCaja negocio) {
        initComponents();
        controlador = new ControladorAgregarCaja(this, negocio);
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
        texto_peso = new javax.swing.JLabel();
        id_entrada = new javax.swing.JTextField();
        tipo_entrada = new javax.swing.JTextField();
        numero_entrada = new javax.swing.JTextField();
        almacen_entrada = new javax.swing.JTextField();
        texto_de_registro = new javax.swing.JLabel();
        texto_stock = new javax.swing.JLabel();
        vendedor_entrada = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(497, 428));

        fondo.setPreferredSize(new java.awt.Dimension(497, 428));

        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        texto_id.setText("ID Caja");

        texto_nombre.setText("Tipo");

        texto_precio.setText("Numero");

        texto_peso.setText("ID Almacen");

        texto_de_registro.setText("Panel de Registro");

        texto_stock.setText("ID Vendedor");

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
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_id)
                            .addComponent(texto_nombre)
                            .addComponent(texto_precio)
                            .addComponent(texto_peso)
                            .addComponent(texto_stock))
                        .addGap(113, 113, 113)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tipo_entrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(numero_entrada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(almacen_entrada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_entrada)
                            .addComponent(vendedor_entrada))))
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
                    .addComponent(id_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nombre)
                    .addComponent(tipo_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_precio)
                    .addComponent(numero_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_peso)
                    .addComponent(almacen_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(texto_stock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(boton_registrar)
                        .addGap(79, 79, 79))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(vendedor_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
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

    public JTextField getAlmacen_entrada() {
        return almacen_entrada;
    }

    public JTextField getId_entrada() {
        return id_entrada;
    }

    public JTextField getNumero_entrada() {
        return numero_entrada;
    }

    public JTextField getTipo_entrada() {
        return tipo_entrada;
    }

    public JTextField getVendedor_entrada() {
        return vendedor_entrada;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almacen_entrada;
    private javax.swing.JButton boton_registrar;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_entrada;
    private javax.swing.JTextField numero_entrada;
    private javax.swing.JLabel texto_de_registro;
    private javax.swing.JLabel texto_id;
    private javax.swing.JLabel texto_nombre;
    private javax.swing.JLabel texto_peso;
    private javax.swing.JLabel texto_precio;
    private javax.swing.JLabel texto_stock;
    private javax.swing.JTextField tipo_entrada;
    private javax.swing.JTextField vendedor_entrada;
    // End of variables declaration//GEN-END:variables
}

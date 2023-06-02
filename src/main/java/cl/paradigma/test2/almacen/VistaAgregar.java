/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.almacen;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VistaAgregar extends javax.swing.JPanel 
{
    
    private ControladorAgregarAlmacen controlador;
    
    public VistaAgregar() {
        initComponents();
        controlador = new ControladorAgregarAlmacen(this);
        controlador.edicion();
    }

    public VistaAgregar(ModeloAlmacen negocio) {
        initComponents();
        controlador = new ControladorAgregarAlmacen(this, negocio);
        controlador.edicion();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        boton_registrar = new javax.swing.JButton();
        texto_id = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JLabel();
        texto_direccion = new javax.swing.JLabel();
        id_almacen_insertar = new javax.swing.JTextField();
        nombre_insertar = new javax.swing.JTextField();
        direccion_insertar = new javax.swing.JTextField();
        texto_de_registro = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(497, 428));

        fondo.setPreferredSize(new java.awt.Dimension(497, 428));

        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        texto_id.setText("ID del Almacen");

        texto_nombre.setText("Nombre");

        texto_direccion.setText("Direccion");

        nombre_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_insertarActionPerformed(evt);
            }
        });

        texto_de_registro.setText("Panel de Regitro");

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
                                .addComponent(texto_direccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                .addComponent(direccion_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texto_id)
                                    .addComponent(texto_nombre))
                                .addGap(130, 130, 130)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nombre_insertar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(id_almacen_insertar))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_de_registro)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_id)
                    .addComponent(id_almacen_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nombre)
                    .addComponent(nombre_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_direccion)
                    .addComponent(direccion_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(boton_registrar)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
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

    private void nombre_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_insertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_insertarActionPerformed

    public JButton getBoton_registrar() {
        return boton_registrar;
    }

    public JLabel getTexto_de_registro() {
        return texto_de_registro;
    }

    public JTextField getDireccion_insertar() {
        return direccion_insertar;
    }

    public JTextField getId_almacen_insertar() {
        return id_almacen_insertar;
    }

    public JTextField getNombre_insertar() {
        return nombre_insertar;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_registrar;
    private javax.swing.JTextField direccion_insertar;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_almacen_insertar;
    private javax.swing.JTextField nombre_insertar;
    private javax.swing.JLabel texto_de_registro;
    private javax.swing.JLabel texto_direccion;
    private javax.swing.JLabel texto_id;
    private javax.swing.JLabel texto_nombre;
    // End of variables declaration//GEN-END:variables
}

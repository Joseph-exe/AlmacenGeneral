/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.vendedores;

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

    public VistaAgregar(ModeloVendedores vendedores) {
        initComponents();
        controlador = new ControladorAgregar(this, vendedores);
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
        id_entrada_vendedor = new javax.swing.JTextField();
        nombre_entrada = new javax.swing.JTextField();
        run_entrada = new javax.swing.JTextField();
        texto_de_registro = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(497, 428));

        fondo.setPreferredSize(new java.awt.Dimension(497, 428));

        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        texto_id.setText("ID Vendedor");

        texto_nombre.setText("Nombre");

        texto_precio.setText("Run");

        texto_de_registro.setText("Panel de Registro");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_de_registro)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_precio)
                            .addComponent(texto_nombre)
                            .addComponent(texto_id))
                        .addGap(98, 98, 98)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_entrada_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(run_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_de_registro)
                .addGap(122, 122, 122)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_id)
                    .addComponent(id_entrada_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_nombre))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_precio)
                    .addComponent(run_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(boton_registrar)
                .addGap(28, 28, 28))
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

    public JTextField getId_entrada_vendedor() {
        return id_entrada_vendedor;
    }

    public JTextField getNombre_entrada() {
        return nombre_entrada;
    }

    public JTextField getRun_entrada() {
        return run_entrada;
    }

    public JLabel getTexto_de_registro() {
        return texto_de_registro;
    }

    public JButton getBoton_registrar() {
        return boton_registrar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_registrar;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_entrada_vendedor;
    private javax.swing.JTextField nombre_entrada;
    private javax.swing.JTextField run_entrada;
    private javax.swing.JLabel texto_de_registro;
    private javax.swing.JLabel texto_id;
    private javax.swing.JLabel texto_nombre;
    private javax.swing.JLabel texto_precio;
    // End of variables declaration//GEN-END:variables
}

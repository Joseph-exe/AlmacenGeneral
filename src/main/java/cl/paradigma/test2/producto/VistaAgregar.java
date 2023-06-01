/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.producto;
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

    public VistaAgregar(ModeloProducto negocio) {
        initComponents();
        controlador = new ControladorAgregar(this, negocio);
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
        id_texto = new javax.swing.JTextField();
        nombre_texto = new javax.swing.JTextField();
        precio_texto = new javax.swing.JTextField();
        peso_texto = new javax.swing.JTextField();
        texto_de_registro = new javax.swing.JLabel();
        texto_stock = new javax.swing.JLabel();
        volumen_texto = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(497, 428));

        fondo.setPreferredSize(new java.awt.Dimension(497, 428));

        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        texto_id.setText("ID");

        texto_nombre.setText("Nombre");

        texto_precio.setText("Precio");

        texto_peso.setText("Peso");

        texto_de_registro.setText("Panel de Registro");

        texto_stock.setText("Volumen");

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
                            .addComponent(nombre_texto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(precio_texto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peso_texto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_texto)
                            .addComponent(volumen_texto))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_de_registro)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_id)
                    .addComponent(id_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nombre)
                    .addComponent(nombre_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_precio)
                    .addComponent(precio_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_peso)
                    .addComponent(peso_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(texto_stock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(boton_registrar)
                        .addGap(79, 79, 79))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(volumen_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    public JTextField getId_texto() 
    {
        return id_texto;
    }

    public JTextField getNombre_texto() {
        return nombre_texto;
    }

    public JTextField getPrecio_texto() {
        return precio_texto;
    }

    public JLabel getTexto_de_registro() {
        return texto_de_registro;
    }

    public JButton getBoton_registrar() {
        return boton_registrar;
    }

    public JTextField getPeso_texto() {
        return peso_texto;
    }

    public JTextField getVolumen_texto() {
        return volumen_texto;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_registrar;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_texto;
    private javax.swing.JTextField nombre_texto;
    private javax.swing.JTextField peso_texto;
    private javax.swing.JTextField precio_texto;
    private javax.swing.JLabel texto_de_registro;
    private javax.swing.JLabel texto_id;
    private javax.swing.JLabel texto_nombre;
    private javax.swing.JLabel texto_peso;
    private javax.swing.JLabel texto_precio;
    private javax.swing.JLabel texto_stock;
    private javax.swing.JTextField volumen_texto;
    // End of variables declaration//GEN-END:variables
}

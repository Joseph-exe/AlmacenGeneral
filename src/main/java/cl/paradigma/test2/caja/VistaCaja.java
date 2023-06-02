/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.caja;
import cl.paradigma.test2.main.VistaPrincipal;
public class VistaCaja extends javax.swing.JPanel 
    {
    //para que no cree mas espacio de controladores
    private ControladorEliminarEditarCaja controlador;
    public VistaCaja() 
    {
        initComponents();
        controlador = new ControladorEliminarEditarCaja(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        boton_agregar = new javax.swing.JButton();
        boton_editar = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Caja", "Tipo", "Numero", "ID Almacen", "ID Vendedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_productos);

        boton_agregar.setText("Agregar");
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        boton_editar.setText("Editar");
        boton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editarActionPerformed(evt);
            }
        });

        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        jButton1.setText("Cierre de Caja");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(boton_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_eliminar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_agregar)
                    .addComponent(boton_editar)
                    .addComponent(boton_eliminar))
                .addContainerGap())
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

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        VistaPrincipal.ShowJPanel(new VistaAgregar());//al presionar agregar se muestra el jpanel agregar
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        controlador.botonEliminarProductos();
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void boton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_editarActionPerformed
        controlador.botonEditarProductos();
    }//GEN-LAST:event_boton_editarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_editar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla_productos;
    // End of variables declaration//GEN-END:variables
}

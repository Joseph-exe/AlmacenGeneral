/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.venta;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class VistaVenta extends javax.swing.JPanel {
    private ControladorVenta controlador;
    
    public VistaVenta() 
    {
        initComponents();
        controlador = new ControladorVenta(this);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        panel_productos = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        id_entrada_producto = new javax.swing.JTextField();
        texto_producto = new javax.swing.JLabel();
        agregar_productos = new javax.swing.JButton();
        boton_vender_total = new javax.swing.JButton();
        texto_total = new javax.swing.JLabel();
        texto_seleccionar_caja = new javax.swing.JLabel();
        variable_valor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carrito = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caja_entrada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fecha_entrada = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setPreferredSize(new java.awt.Dimension(497, 428));

        fondo.setPreferredSize(new java.awt.Dimension(497, 428));

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio"
            }
        ));
        panel_productos.setViewportView(tabla_productos);

        texto_producto.setText("ID Producto");

        agregar_productos.setText("Agregar Producto");
        agregar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_productosActionPerformed(evt);
            }
        });

        boton_vender_total.setText("Vender el Total");
        boton_vender_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_vender_totalActionPerformed(evt);
            }
        });

        texto_total.setText("Total Valor :");

        texto_seleccionar_caja.setText("Seleccione Caja");

        carrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(carrito);

        jLabel1.setText("Carro");

        jLabel2.setText("Productos Disponibles ");

        caja_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_entradaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha");

        fecha_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_entradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_productos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(texto_seleccionar_caja)
                        .addGap(18, 18, 18)
                        .addComponent(caja_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(fecha_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addComponent(texto_producto)
                                        .addGap(7, 7, 7)
                                        .addComponent(id_entrada_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(agregar_productos))
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addComponent(texto_total)
                                        .addGap(18, 18, 18)
                                        .addComponent(variable_valor))
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(boton_vender_total, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(33, 33, 33))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_seleccionar_caja)
                    .addComponent(caja_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(fecha_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(panel_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_producto)
                            .addComponent(id_entrada_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_total)
                            .addComponent(variable_valor))
                        .addGap(34, 34, 34)
                        .addComponent(boton_vender_total))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_productosActionPerformed
        controlador.boton_agregar();
    }//GEN-LAST:event_agregar_productosActionPerformed

    private void boton_vender_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_vender_totalActionPerformed
        controlador.boton_vender_total();
    }//GEN-LAST:event_boton_vender_totalActionPerformed

    private void caja_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_entradaActionPerformed

    private void fecha_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_entradaActionPerformed

    //los de la tabla
    public JTextField getId_entrada_producto() {
        return id_entrada_producto;
    }

    public JLabel getVariable_valor() 
    {
        return variable_valor;
    }

    public JTextField getCaja_entrada() {
        return caja_entrada;
    }

    public JTextField getFecha_entrada() {
        return fecha_entrada;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_productos;
    private javax.swing.JButton boton_vender_total;
    private javax.swing.JTextField caja_entrada;
    public javax.swing.JTable carrito;
    private javax.swing.JTextField fecha_entrada;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_entrada_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane panel_productos;
    public javax.swing.JTable tabla_productos;
    private javax.swing.JLabel texto_producto;
    private javax.swing.JLabel texto_seleccionar_caja;
    private javax.swing.JLabel texto_total;
    private javax.swing.JLabel variable_valor;
    // End of variables declaration//GEN-END:variables
}

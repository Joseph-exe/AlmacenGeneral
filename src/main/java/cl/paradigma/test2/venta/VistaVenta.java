/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cl.paradigma.test2.venta;

import cl.paradigma.test2.producto.DAOProductoslmp;
import cl.paradigma.test2.producto.ModeloProducto;
import cl.paradigma.test2.utilidades.DAOProductos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VistaVenta extends javax.swing.JPanel {
    
    //manejar mejor la tabla
    private DefaultTableModel carritoTableModel;
    private ModeloProducto producto;
    private int total;
    
    public VistaVenta() {
        initComponents();
        carritoTableModel = (DefaultTableModel) carrito.getModel();//le pasamos la tabla en cuestion
        cargarDatos();
        total = 0;
    }

    private void cargarDatos() 
    {
    try {
        DAOProductos dao = new DAOProductoslmp();
        DefaultTableModel model = (DefaultTableModel) tabla_productos.getModel();
        dao.listar().forEach((n) -> model.addRow(new Object[]{n.getId(), n.getNombre(), n.getPrecio()}));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        fondo = new javax.swing.JPanel();
        panel_productos = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        id_entrada_producto = new javax.swing.JTextField();
        texto_producto = new javax.swing.JLabel();
        combo_box_caja = new javax.swing.JComboBox<>();
        agregar_productos = new javax.swing.JButton();
        boton_vender_total = new javax.swing.JButton();
        texto_total = new javax.swing.JLabel();
        texto_seleccionar_caja = new javax.swing.JLabel();
        texto_seleccionar_vendedor = new javax.swing.JLabel();
        combo_box_vendedor = new javax.swing.JComboBox<>();
        variable_valor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carrito = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        combo_box_caja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "caja 1", "caja 2" }));
        combo_box_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_cajaActionPerformed(evt);
            }
        });

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

        texto_seleccionar_vendedor.setText("Seleccione Vendedor");

        combo_box_vendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vendedor1", "vendedor2" }));

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
                        .addGap(12, 12, 12)
                        .addComponent(combo_box_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(texto_seleccionar_vendedor)
                        .addGap(12, 12, 12)
                        .addComponent(combo_box_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(22, 22, 22))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_box_caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_seleccionar_caja)
                            .addComponent(texto_seleccionar_vendedor)
                            .addComponent(combo_box_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
//estos 3 son los botones
    private void combo_box_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box_cajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_box_cajaActionPerformed

    private void agregar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_productosActionPerformed
    String idProductoText = id_entrada_producto.getText();
    
    if  (idProductoText.isEmpty())//cuando el texto este vacio
    {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese el ID del producto.", "AVISO", JOptionPane.WARNING_MESSAGE);
    }
    else{
        int producto_id = Integer.parseInt(idProductoText);
        DAOProductos dao = new DAOProductoslmp();
            try 
            {
                producto = dao.getNegocioById(producto_id);
                if (producto.getNombre() == null)//si selecciono una ID que no existe pero se valida si el nombre es null
                {
                    JOptionPane.showMessageDialog(null, "Este producto no existe \n", "AVISO", JOptionPane.ERROR_MESSAGE);
                }else
                {
                carritoTableModel.addRow(new Object[]{producto.getNombre(), producto.getPrecio()});
                //suma para saber el valor total
                total += producto.getPrecio(); // Sumar el precio al total
                variable_valor.setText(String.valueOf(total)); // Actualizar el valor en la etiqueta
                }
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(null, "Error al agregar a su carro.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    }//GEN-LAST:event_agregar_productosActionPerformed

    private void boton_vender_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_vender_totalActionPerformed
        
    }//GEN-LAST:event_boton_vender_totalActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_productos;
    private javax.swing.JButton boton_vender_total;
    private javax.swing.JTable carrito;
    private javax.swing.JComboBox<String> combo_box_caja;
    private javax.swing.JComboBox<String> combo_box_vendedor;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_entrada_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane panel_productos;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JLabel texto_producto;
    private javax.swing.JLabel texto_seleccionar_caja;
    private javax.swing.JLabel texto_seleccionar_vendedor;
    private javax.swing.JLabel texto_total;
    private javax.swing.JLabel variable_valor;
    // End of variables declaration//GEN-END:variables
}

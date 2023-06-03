/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.venta;

import static cl.paradigma.test2.main.VistaPrincipal.ShowJPanel;
import cl.paradigma.test2.producto.DAOProductoslmp;
import cl.paradigma.test2.producto.ModeloProducto;
import cl.paradigma.test2.stock.DAOStocklmp;
import cl.paradigma.test2.utilidades.DAOProductos;
import cl.paradigma.test2.utilidades.DAOStock;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorVenta {
    // Manejar mejor la tabla
    private ModeloProducto producto;
    private List<ModeloVenta> listaProductos;
    private int total;
    private VistaVenta venta;
    private PanelDeBoleta panel_boleta;
    private DefaultTableModel carroBoletaTableModel;//llamo a la tabla de la boleta
    private DefaultTableModel carritoTableModel;//lamo a la tabla de la vista venta

    public ControladorVenta(VistaVenta vistaVenta) 
    {
        this.venta = vistaVenta;
        carritoTableModel = (DefaultTableModel) venta.carrito.getModel();
        total = 0;
        listaProductos = new ArrayList<>();
        panel_boleta = new PanelDeBoleta();
        carroBoletaTableModel = (DefaultTableModel) panel_boleta.getCarro_boleta().getModel();

        cargarDatos();
    }

    private void cargarDatos() {
        try {
            DAOProductos dao = new DAOProductoslmp();
            DefaultTableModel model = (DefaultTableModel) venta.tabla_productos.getModel();
            dao.listar().forEach((n) -> model.addRow(new Object[]{n.getId(), n.getNombre(), n.getPrecio()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void boton_agregar() 
    {
        
        String idProductoText = venta.getId_entrada_producto().getText();
        if (idProductoText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el ID del producto.", "AVISO", JOptionPane.WARNING_MESSAGE);
        } else {
            int producto_id = Integer.parseInt(idProductoText);
            DAOProductos dao = new DAOProductoslmp();
            try {
                producto = dao.getNegocioById(producto_id);

                if (producto.getNombre() == null) {
                    JOptionPane.showMessageDialog(null, "Este producto no existe.", "AVISO", JOptionPane.ERROR_MESSAGE);
                } else {
                    //agregamos altiro a la tabla los productos que se solicitan para verse como carrito 
                    carritoTableModel.addRow(new Object[]{producto.getNombre(), producto.getPrecio()});
                    carroBoletaTableModel.addRow(new Object[]{producto.getNombre(), producto.getPrecio()});
                    total += producto.getPrecio();//esto suma el total a medida que le llega la ID
                    venta.getVariable_valor().setText(String.valueOf(total));
                    boolean encontrado = false;
                    for (ModeloVenta producto_cantidad : listaProductos) {
                        if (producto_cantidad.getIdProducto() == producto_id) {
                            producto_cantidad.setCantidad(producto_cantidad.getCantidad() + 1);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        listaProductos.add(new ModeloVenta(producto_id, 1));
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al agregar a su carro.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void boton_vender_total() {
        //esta funcion es para que al apretar boton vender se venda el total, refresque la pestaña
        // y actualice la boleta
        for (ModeloVenta producto_cantidad : listaProductos) {
            int idProducto = producto_cantidad.getIdProducto();
            int cantidad = producto_cantidad.getCantidad();
            DAOStock dao = new DAOStocklmp();
            dao.descontar(idProducto, cantidad);
            panel_boleta.getCarro_boleta().setModel(carritoTableModel); // Actualiza el contenido de la tabla carro_boleta con el contenido del carrito principal
            panel_boleta.getTotal_entrada().setText(String.valueOf(total)); // Actualiza el valor total en el JLabel de PanelDeBoleta
            panel_boleta.setVisible(true); // Muestra el JFrame de PanelDeBoleta
            ShowJPanel(new VistaVenta()); // Refrescamos para vaciar el carrito
        }
    }
}

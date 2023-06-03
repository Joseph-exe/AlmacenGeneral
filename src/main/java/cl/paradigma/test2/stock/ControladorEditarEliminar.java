/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.stock;

import cl.paradigma.test2.main.VistaPrincipal;
import cl.paradigma.test2.utilidades.DAOStock;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorEditarEliminar 
{
    private VistaStock vistaStock;
    
    public ControladorEditarEliminar(VistaStock VistaStock)
    {
        this.vistaStock = VistaStock;
        cargarDatos();
    }
    //---------
    //este void como su nombre indica solo es para cargar datos de la tabla
    //-----------
    private void cargarDatos() 
    {
    try {
        DAOStock dao = new DAOStocklmp();
        DefaultTableModel model = (DefaultTableModel) vistaStock.tabla_productos.getModel();
        dao.listar().forEach((n) -> model.addRow(new Object[]
        {
            //se agrega y el orden en que se agrega
            n.getId_bodega_modelo_stock(), 
            n.getId_producto_modelo_stock(), 
            n.getStock_modelo(), 
        }));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error cargar datos.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
    }
    }
    //--------
    //Funcion del boton eliminar
    //--------
    public void botonEliminarProductos()
    {
        DAOStock dao = new DAOStocklmp();
        DefaultTableModel model = (DefaultTableModel) vistaStock.tabla_productos.getModel();
        //
        //selecciona la tabla con su ID respectivo, luego lo borra segun la ID misma
        //con su respectivas verificaciones por si no selecciona nada
        //
        if (vistaStock.tabla_productos.getSelectedRows().length < 1) 
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar Productos a Eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } 
        else
        {
            for (int i : vistaStock.tabla_productos.getSelectedRows()) {
                try 
                {
                    int bodega_id = (int) vistaStock.tabla_productos.getValueAt(i, 0);
                    int producto_id = (int) vistaStock.tabla_productos.getValueAt(i, 1);
                    //int stock_entrada = (int) vistaStock.tabla_productos.getValueAt(i, 1);
                    dao.eliminar(bodega_id, producto_id);
                    model.removeRow(i);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error de boton\n", "AVISO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }    
    }
    //--------------
    //fin de la funcion eliminar
    //--------------
    //Inicio de la funcion editar
    public void botonEditarProductos()
    {
            if (vistaStock.tabla_productos.getSelectedRow() > -1) 
            {
            try {
                //PASAR COLUMNAS
                int negocioId = (int) vistaStock.tabla_productos.getValueAt(vistaStock.tabla_productos.getSelectedRow(), 0);
                int productoId = (int) vistaStock.tabla_productos.getValueAt(vistaStock.tabla_productos.getSelectedRow(), 1);
                DAOStock dao = new DAOStocklmp();
                
                //-----
                //Mostrar la vista editar bloqueando poder editar el ID
                //----
                VistaAgregar vistaEditar = new VistaAgregar(dao.getStockById(negocioId,productoId));
                vistaEditar.getId_bodega_entrada().setEditable(false);
                VistaPrincipal.ShowJPanel(vistaEditar);
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Error de boton editar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            }
            } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar el usuario a editar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }
}


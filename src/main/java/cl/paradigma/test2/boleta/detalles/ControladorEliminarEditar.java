/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.boleta.detalles;

import cl.paradigma.test2.main.VistaPrincipal;
import cl.paradigma.test2.utilidades.DAOBoletaDetalle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class ControladorEliminarEditar 
{
    private VistaDetalles vista_detalle;
    
    public ControladorEliminarEditar(VistaDetalles vistaDetalle)
    {
        this.vista_detalle = vistaDetalle;
        cargarDatos();
    }
    //---------
    //este void como su nombre indica solo es para cargar datos de la tabla
    //-----------
    private void cargarDatos() 
    {
    try {
        DAOBoletaDetalle dao = new DAOBoletaDetalladalmp();
        DefaultTableModel model = (DefaultTableModel) vista_detalle.tabla_productos.getModel();
        dao.listar().forEach((n) -> model.addRow(new Object[]
        {
            //se agrega y el orden en que se agrega
            n.getId_boleta(), 
            n.getId_producto(), 
            n.getCantidad(),
            n.getPrecio(), 
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
        DAOBoletaDetalle dao = new DAOBoletaDetalladalmp();
        DefaultTableModel model = (DefaultTableModel) vista_detalle.tabla_productos.getModel();
        //
        //selecciona la tabla con su ID respectivo, luego lo borra segun la ID misma
        //con su respectivas verificaciones por si no selecciona nada
        //
        if (vista_detalle.tabla_productos.getSelectedRows().length < 1) 
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar Productos a Eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } 
        else
        {
            for (int i : vista_detalle.tabla_productos.getSelectedRows()) {
                try 
                {
                    int bodega_id = (int) vista_detalle.tabla_productos.getValueAt(i, 0);
                    int producto_id = (int) vista_detalle.tabla_productos.getValueAt(i, 1);
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
            if (vista_detalle.tabla_productos.getSelectedRow() > -1) 
            {
            try {
                //PASAR COLUMNAS
                int negocioId = (int) vista_detalle.tabla_productos.getValueAt(vista_detalle.tabla_productos.getSelectedRow(), 0);
                int productoId = (int) vista_detalle.tabla_productos.getValueAt(vista_detalle.tabla_productos.getSelectedRow(), 1);
                DAOBoletaDetalle dao = new DAOBoletaDetalladalmp();
                
                //-----
                //Mostrar la vista editar bloqueando poder editar el ID
                //----
                VistaAgregar vistaEditar = new VistaAgregar(dao.getStockById(negocioId,productoId));
                vistaEditar.getId_boleta_entrada().setEditable(false);
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


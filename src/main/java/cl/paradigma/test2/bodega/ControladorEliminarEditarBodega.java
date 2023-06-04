/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.bodega;
import cl.paradigma.test2.main.VistaPrincipal;
import cl.paradigma.test2.utilidades.DAOBodega;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorEliminarEditarBodega 
{
    private VistaBodegas vistaProductos;
    public ControladorEliminarEditarBodega(VistaBodegas VistaProductos)
    {
        this.vistaProductos = VistaProductos;
        cargarDatos();
    }
    //---------
    //este void como su nombre indica solo es para cargar datos de la tabla
    //-----------
    private void cargarDatos() 
    {
    try {
        DAOBodega dao = new DAOBodegalmp();
        DefaultTableModel model = (DefaultTableModel) vistaProductos.tabla_productos.getModel();
        dao.listar().forEach((bodega) -> model.addRow(new Object[]
        {
            //se agregan estos datos
            bodega.getId_bodega(), 
            bodega.getVolumen_maximo(), 
            bodega.getPeso_maximo(),
            bodega.getId_almacen(),     
        }));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
    //--------
    //Funcion del boton eliminar
    //--------
    public void botonEliminarProductos()
    {
        DAOBodega dao = new DAOBodegalmp();
        DefaultTableModel model = (DefaultTableModel) vistaProductos.tabla_productos.getModel();
        //
        //selecciona la tabla con su ID respectivo, luego lo borra segun la ID misma
        //con su respectivas verificaciones por si no selecciona nada
        //
        if (vistaProductos.tabla_productos.getSelectedRows().length < 1) 
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar Productos a Eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } 
        else
        {
            for (int i : vistaProductos.tabla_productos.getSelectedRows()) {//aca guardamos las ID ya que se seleccionaba por posicion(comenzaba del 0)
                try 
                {
                    dao.eliminar((int) vistaProductos.tabla_productos.getValueAt(i, 0));
                    model.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
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
            if (vistaProductos.tabla_productos.getSelectedRow() > -1) 
            {
            try {
                int producto_id = (int) vistaProductos.tabla_productos.getValueAt(vistaProductos.tabla_productos.getSelectedRow(), 0);
                DAOBodega dao = new DAOBodegalmp();
                //-----
                //Mostrar la vista editar bloqueando poder editar el ID
                //----
                VistaAgregar vistaEditar = new VistaAgregar(dao.getBodegaById(producto_id));
                vistaEditar.getId_bodega_insertar().setEditable(false);
                VistaPrincipal.ShowJPanel(vistaEditar);
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
            } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar el usuario a editar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
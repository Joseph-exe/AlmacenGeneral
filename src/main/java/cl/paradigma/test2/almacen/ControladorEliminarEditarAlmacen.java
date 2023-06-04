/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.almacen;

import cl.paradigma.test2.main.VistaPrincipal;
import cl.paradigma.test2.utilidades.DAOAlmacen;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorEliminarEditarAlmacen 
{
    private VistaAlmacenes vistaAlmacen;
    //constructor
    public ControladorEliminarEditarAlmacen(VistaAlmacenes VistaProductos)
    {
        this.vistaAlmacen = VistaProductos;
        cargarDatos();
    }
    
    // cargamos datos a la tabla
    
    private void cargarDatos() 
    {
    try {
        DAOAlmacen dao = new DAOAlmacenlmp();
        DefaultTableModel model = (DefaultTableModel) vistaAlmacen.tabla_productos.getModel();
        //se cargan en este orden
        dao.listar().forEach((n) -> model.addRow(new Object[]
        {
            n.getId_almacen(),
            n.getNombre_almacen(),
            n.getDireccion_almacen(),
        }));
    } catch (Exception e) 
    {
        System.out.println(e.getMessage());
    }
    }
    //--------
    //Funcion del boton eliminar
    //--------
    public void botonEliminarProductos()
    {
        DAOAlmacen dao = new DAOAlmacenlmp();
        DefaultTableModel model = (DefaultTableModel) vistaAlmacen.tabla_productos.getModel();
        
        //selecciona la tabla con su ID respectivo, luego lo borra segun la ID misma
        //con su respectivas verificaciones por si no selecciona nada
        //
        if (vistaAlmacen.tabla_productos.getSelectedRows().length < 1) 
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar Productos a Eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } 
        else
        {
            for (int i : vistaAlmacen.tabla_productos.getSelectedRows()) {//aca guardamos las ID ya que se seleccionaba por posicion(comenzaba del 0)
                try 
                {
                    dao.eliminar((int) vistaAlmacen.tabla_productos.getValueAt(i, 0));
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
            if (vistaAlmacen.tabla_productos.getSelectedRow() > -1) 
            {
            try {
                int almcen_id = (int) vistaAlmacen.tabla_productos.getValueAt(vistaAlmacen.tabla_productos.getSelectedRow(), 0);
                DAOAlmacen dao = new DAOAlmacenlmp();
                //-----
                //Mostrar la vista editar bloqueando poder editar el ID
                //----
                VistaAgregar vistaEditar = new VistaAgregar(dao.getAlmacenById(almcen_id));
                vistaEditar.getId_almacen_insertar().setEditable(false);
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
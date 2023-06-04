/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.vendedores;

import cl.paradigma.test2.main.VistaPrincipal;
import cl.paradigma.test2.utilidades.DAOVendedores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorEliminarEditar 
{
    private VistaVendedores vistaVendedores;
    public ControladorEliminarEditar(VistaVendedores VistaVendedores)
    {
        this.vistaVendedores = VistaVendedores;
        cargarDatos();
    }
    //---------
    //este void como su nombre indica solo es para cargar datos de la tabla
    //-----------
    private void cargarDatos() 
    {
    try {
        DAOVendedores dao = new DAOVendedoreslmp();
        DefaultTableModel model = (DefaultTableModel) vistaVendedores.tabla_productos.getModel();
        dao.listar().forEach((n) -> model.addRow(new Object[]
        {
            n.getId_vendedor(),
            n.getNombre(),
            n.getRun()
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
        DAOVendedores dao = new DAOVendedoreslmp();
        DefaultTableModel model = (DefaultTableModel) vistaVendedores.tabla_productos.getModel();
        //
        //selecciona la tabla con su ID respectivo, luego lo borra segun la ID misma
        //con su respectivas verificaciones por si no selecciona nada
        //
        if (vistaVendedores.tabla_productos.getSelectedRows().length < 1) 
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar Productos a Eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } 
        else
        {
            for (int i : vistaVendedores.tabla_productos.getSelectedRows()) {//aca guardamos las ID ya que se seleccionaba por posicion(comenzaba del 0)
                try 
                {
                    dao.eliminar((int) vistaVendedores.tabla_productos.getValueAt(i, 0));
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
            if (vistaVendedores.tabla_productos.getSelectedRow() > -1) 
            {
            try {
                int vendedores_id = (int) vistaVendedores.tabla_productos.getValueAt(vistaVendedores.tabla_productos.getSelectedRow(), 0);
                DAOVendedores dao = new DAOVendedoreslmp();
                //-----
                //Mostrar la vista editar bloqueando poder editar el ID
                //----
                VistaAgregar vistaEditar = new VistaAgregar(dao.getVendedoresById(vendedores_id));
                vistaEditar.getId_entrada_vendedor().setEditable(false);
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
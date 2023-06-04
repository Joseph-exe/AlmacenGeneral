/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.caja;

import cl.paradigma.test2.main.VistaPrincipal;
import cl.paradigma.test2.utilidades.DAOCaja;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ControladorEliminarEditarCaja 
{
    private VistaCaja vistaCajas;
    public ControladorEliminarEditarCaja(VistaCaja VistaCaja)
    {
        this.vistaCajas = VistaCaja;
        cargarDatos();
    }
    //---------
    //este void como su nombre indica solo es para cargar datos de la tabla
    //-----------
    private void cargarDatos() 
    {
    try {
        DAOCaja dao = new DAOCajalmp();
        DefaultTableModel model = (DefaultTableModel) vistaCajas.tabla_productos.getModel();
        dao.listar().forEach((n) -> model.addRow(new Object[]
        {
            n.getId_caja(),
            n.getTipo_caja(),
            n.getNumero_caja(),
            n.getId_almacen(),
            n.getId_vendedor()
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
        DAOCaja dao = new DAOCajalmp();
        DefaultTableModel model = (DefaultTableModel) vistaCajas.tabla_productos.getModel();
        //
        //selecciona la tabla con su ID respectivo, luego lo borra segun la ID misma
        //con su respectivas verificaciones por si no selecciona nada
        //
        if (vistaCajas.tabla_productos.getSelectedRows().length < 1) 
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar Productos a Eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } 
        else
        {
            for (int i : vistaCajas.tabla_productos.getSelectedRows()) {//aca guardamos las ID ya que se seleccionaba por posicion(comenzaba del 0)
                try 
                {
                    dao.eliminar((int) vistaCajas.tabla_productos.getValueAt(i, 0));
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
            if (vistaCajas.tabla_productos.getSelectedRow() > -1) 
            {
            try {
                int negocioId = (int) vistaCajas.tabla_productos.getValueAt(vistaCajas.tabla_productos.getSelectedRow(), 0);
                DAOCaja dao = new DAOCajalmp();
                //-----
                //Mostrar la vista editar bloqueando poder editar el ID
                //----
                VistaAgregar vistaEditar = new VistaAgregar(dao.getNegocioById(negocioId));
                vistaEditar.getId_entrada().setEditable(false);
                vistaEditar.getAlmacen_entrada().setEditable(false);
                vistaEditar.getVendedor_entrada().setEditable(false);
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
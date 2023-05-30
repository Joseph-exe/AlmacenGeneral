/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.producto;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ControladorVistaAgregar 
{
    private VistaAgregar vista;
    private boolean esEdicion;
    private ModeloProducto negocioEdicion;

    public ControladorVistaAgregar(VistaAgregar vista) {
        this.vista = vista;
        this.esEdicion = false;
    }

    public ControladorVistaAgregar(VistaAgregar vista, ModeloProducto negocio) {
        this.vista = vista;
        this.esEdicion = true;
        this.negocioEdicion = negocio;
    }

    public boolean esEdicion() {
        return esEdicion;
    }

    public ModeloProducto getNegocioEdicion() {
        return negocioEdicion;
    }
        public void edicion() 
    {
        if (esEdicion()) {
            vista.getTexto_de_registro().setText("Panel de Edicion");
            vista.getBoton_registrar().setText("Aceptar");
        }
        if (getNegocioEdicion() != null)//Mira si hay un objeto
        {
            //actualiza los cuadros de texto pero en editar
            vista.getId_texto().setText(String.valueOf(getNegocioEdicion().getId()));
            vista.getNombre_texto().setText(getNegocioEdicion().getNombre());
            vista.getPrecio_texto().setText(String.valueOf(getNegocioEdicion().getPrecio()));
            vista.getStock_texto().setText(String.valueOf(getNegocioEdicion().getStock()));
        }
    }

    public void botonRegistrarActionPerformed(ActionEvent evt) 
    {
        //verifica si hay campos vacios y si no continua normal
        //----
        if (vista.getId_texto().getText().isEmpty()|| vista.getNombre_texto().getText().isEmpty()|| vista.getPrecio_texto().getText().isEmpty() || vista.getStock_texto().getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos", "AVISO",JOptionPane.WARNING_MESSAGE);
        
        } else {
            
            int id_entrada = Integer.parseInt(vista.getId_texto().getText());
            String nombre_entrada = vista.getNombre_texto().getText();
            int precio_entrada = Integer.parseInt(vista.getPrecio_texto().getText());
            int stock_entrada = Integer.parseInt(vista.getStock_texto().getText());

            ModeloProducto negocio = esEdicion ? negocioEdicion : new ModeloProducto();
            negocio.setId(id_entrada);
            negocio.setNombre(nombre_entrada);
            negocio.setPrecio(precio_entrada);
            negocio.setStock(stock_entrada);

            try {
                DAOProductoslmp dao = new DAOProductoslmp();
                if (!esEdicion) {
                    dao.registrar(negocio);
                } else {
                    dao.modificar(negocio);
                }
                String successMsg = esEdicion ? "modificado" : "registrado";

                JOptionPane.showMessageDialog(vista, "Se a implementado correctamente", "AVISO",JOptionPane.INFORMATION_MESSAGE);
                if (!esEdicion) {
                    vista.getNombre_texto().setText("");
                    vista.getPrecio_texto().setText("");
                    vista.getStock_texto().setText("");
                    vista.getId_texto().setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar","AVISO",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }    
}

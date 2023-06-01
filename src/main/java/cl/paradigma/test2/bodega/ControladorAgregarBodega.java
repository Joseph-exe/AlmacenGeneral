/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.bodega;

import javax.swing.JOptionPane;

public class ControladorAgregarBodega
{
    private VistaAgregar vista;
    private boolean esEdicion;
    private ModeloBodega negocioEdicion;

    public ControladorAgregarBodega(VistaAgregar vista) {
        this.vista = vista;
        this.esEdicion = false;
    }

    public ControladorAgregarBodega(VistaAgregar vista, ModeloBodega negocio) {
        this.vista = vista;
        this.esEdicion = true;
        this.negocioEdicion = negocio;
    }

    public boolean esEdicion() {
        return esEdicion;
    }

    public ModeloBodega getNegocioEdicion() {
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
            vista.getId_bodega_insertar().setText(String.valueOf(getNegocioEdicion().getId_bodega()));
            vista.getId_almacen_insertar().setText(String.valueOf(getNegocioEdicion().getId_almacen()));
            vista.getPeso_max_insertar().setText(String.valueOf(getNegocioEdicion().getPeso_maximo()));
            vista.getVolumen_max_insertar().setText(String.valueOf(getNegocioEdicion().getVolumen_maximo()));
        }
    }

    public void boton() 
    {
        //verifica si hay campos vacios y si no continua normal
        //----
        if (vista.getId_bodega_insertar().getText().isEmpty()|| vista.getId_almacen_insertar().getText().isEmpty()|| vista.getVolumen_max_insertar().getText().isEmpty() || vista.getPeso_max_insertar().getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos", "AVISO",JOptionPane.WARNING_MESSAGE);
        
        } else {
            //convetimos a int
            int id_bodega_entrada = Integer.parseInt(vista.getId_bodega_insertar().getText());
            int id_almacen_entrada = Integer.parseInt(vista.getId_almacen_insertar().getText());
            int peso_max_entrada = Integer.parseInt(vista.getPeso_max_insertar().getText());
            int volumen_max_entrada = Integer.parseInt(vista.getVolumen_max_insertar().getText());

            ModeloBodega bodega = esEdicion ? negocioEdicion : new ModeloBodega();
            bodega.setId_bodega(id_bodega_entrada);
            bodega.setId_almacen(id_almacen_entrada);
            bodega.setPeso_maximo(peso_max_entrada);
            bodega.setVolumen_maximo(volumen_max_entrada);

            try {
                DAOBodegalmp dao = new DAOBodegalmp();
                if (!esEdicion) {
                    dao.registrar(bodega);
                } else {
                    dao.modificar(bodega);
                }
                String successMsg = esEdicion ? "modificado" : "registrado";

                JOptionPane.showMessageDialog(vista, "Se a implementado correctamente", "AVISO",JOptionPane.INFORMATION_MESSAGE);
                if (!esEdicion) {
                    vista.getPeso_max_insertar().setText("");
                    vista.getVolumen_max_insertar().setText("");
                    vista.getId_almacen_insertar().setText("");
                    vista.getId_bodega_insertar().setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar","AVISO",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }    
}

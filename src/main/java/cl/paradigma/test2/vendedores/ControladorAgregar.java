/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.vendedores;

import javax.swing.JOptionPane;

public class ControladorAgregar 
{
    private VistaAgregar vista;
    private boolean esEdicion;
    private ModeloVendedores vendedoresEdicion;

    public ControladorAgregar(VistaAgregar vista) {
        this.vista = vista;
        this.esEdicion = false;
    }

    public ControladorAgregar(VistaAgregar vista, ModeloVendedores vendedor) {
        this.vista = vista;
        this.esEdicion = true;
        this.vendedoresEdicion = vendedor;
    }

    public boolean esEdicion() {
        return esEdicion;
    }

    public ModeloVendedores getNegocioEdicion() {
        return vendedoresEdicion;
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
            vista.getId_entrada_vendedor().setText(String.valueOf(getNegocioEdicion().getId_vendedor()));
            vista.getNombre_entrada().setText(getNegocioEdicion().getNombre());
            vista.getRun_entrada().setText(getNegocioEdicion().getRun());
        }
    }

    public void boton() 
    {
        //verifica si hay campos vacios y si no continua normal
        //----
        if (vista.getId_entrada_vendedor().getText().isEmpty()|| vista.getNombre_entrada().getText().isEmpty()|| vista.getRun_entrada().getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos", "AVISO",JOptionPane.WARNING_MESSAGE);
        
        } else {
            //convetimos a int
            int id_entrada = Integer.parseInt(vista.getId_entrada_vendedor().getText());
            String nombre_entrada = vista.getNombre_entrada().getText();
            String run_entrada = vista.getRun_entrada().getText();

            ModeloVendedores negocio = esEdicion ? vendedoresEdicion : new ModeloVendedores();
            negocio.setId_vendedor(id_entrada);
            negocio.setNombre(nombre_entrada);
            negocio.setRun(run_entrada);

            try {
                DAOVendedoreslmp dao = new DAOVendedoreslmp();
                if (!esEdicion) {
                    dao.registrar(negocio);
                } else {
                    dao.modificar(negocio);
                }
                String successMsg = esEdicion ? "modificado" : "registrado";

                JOptionPane.showMessageDialog(vista, "Se a implementado correctamente", "AVISO",JOptionPane.INFORMATION_MESSAGE);
                if (!esEdicion) {
                    vista.getNombre_entrada().setText("");
                    vista.getRun_entrada().setText("");
                    vista.getId_entrada_vendedor().setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar","AVISO",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }    
}

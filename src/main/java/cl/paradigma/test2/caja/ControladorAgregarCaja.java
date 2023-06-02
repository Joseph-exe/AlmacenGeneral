/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.caja;

import javax.swing.JOptionPane;


public class ControladorAgregarCaja 
{
    private VistaAgregar vista;
    private boolean esEdicion;
    private ModeloCaja negocioEdicion;

    public ControladorAgregarCaja(VistaAgregar vista) {
        this.vista = vista;
        this.esEdicion = false;
    }

    public ControladorAgregarCaja(VistaAgregar vista, ModeloCaja negocio) {
        this.vista = vista;
        this.esEdicion = true;
        this.negocioEdicion = negocio;
    }

    public boolean esEdicion() {
        return esEdicion;
    }

    public ModeloCaja getNegocioEdicion() {
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
            vista.getId_entrada().setText(String.valueOf(getNegocioEdicion().getId_caja()));
            vista.getTipo_entrada().setText(getNegocioEdicion().getTipo_caja());
            vista.getNumero_entrada().setText(String.valueOf(getNegocioEdicion().getNumero_caja()));
            vista.getAlmacen_entrada().setText(String.valueOf(getNegocioEdicion().getId_almacen()));
            vista.getVendedor_entrada().setText(String.valueOf(getNegocioEdicion().getId_vendedor()));
        }
    }
    public void boton() 
    {
        //verifica si hay campos vacios y si no continua normal
        //----
        if (vista.getId_entrada().getText().isEmpty()|| vista.getTipo_entrada().getText().isEmpty()|| vista.getNumero_entrada().getText().isEmpty() || vista.getAlmacen_entrada().getText().isEmpty() || vista.getVendedor_entrada().getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos", "AVISO",JOptionPane.WARNING_MESSAGE);
        
        } else {
            //convetimos a int para pasarlo de una manera mas entendible y legible
            int id_entrada = Integer.parseInt(vista.getId_entrada().getText());
            String tipo_entrada = vista.getTipo_entrada().getText();
            int numero_entrada = Integer.parseInt(vista.getNumero_entrada().getText());
            int almacen_entrada = Integer.parseInt(vista.getAlmacen_entrada().getText());
            int vendedor_entrada = Integer.parseInt(vista.getVendedor_entrada().getText());

            ModeloCaja caja = esEdicion ? negocioEdicion : new ModeloCaja();
            caja.setId_caja(id_entrada);
            caja.setTipo_caja(tipo_entrada);
            caja.setNumero_caja(numero_entrada);
            caja.setId_almacen(almacen_entrada);
            caja.setId_vendedor(vendedor_entrada);

            try {
                DAOCajalmp dao = new DAOCajalmp();
                if (!esEdicion) {
                    dao.registrar(caja);
                } else {
                    dao.modificar(caja);
                }
                String successMsg = esEdicion ? "modificado" : "registrado";

                JOptionPane.showMessageDialog(vista, "Se a implementado correctamente", "AVISO",JOptionPane.INFORMATION_MESSAGE);
                if (!esEdicion) {
                    vista.getTipo_entrada().setText("");
                    vista.getNumero_entrada().setText("");
                    vista.getAlmacen_entrada().setText("");
                    vista.getVendedor_entrada().setText("");
                    vista.getId_entrada().setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar","AVISO",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }    
}
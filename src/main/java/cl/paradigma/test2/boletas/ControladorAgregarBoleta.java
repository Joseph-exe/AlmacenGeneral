/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.boletas;

import javax.swing.JOptionPane;


public class ControladorAgregarBoleta 
{
    private VistaAgregar vista;
    private boolean esEdicion;
    private ModeloBoleta negocioEdicion;

    public ControladorAgregarBoleta(VistaAgregar vista) {
        this.vista = vista;
        this.esEdicion = false;
    }

    public ControladorAgregarBoleta(VistaAgregar vista, ModeloBoleta negocio) {
        this.vista = vista;
        this.esEdicion = true;
        this.negocioEdicion = negocio;
    }

    public boolean esEdicion() {
        return esEdicion;
    }

    public ModeloBoleta getNegocioEdicion() {
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
            vista.getId_boleta_entrada().setText(String.valueOf(getNegocioEdicion().getId_boleta()));
            vista.getFecha_entrada().setText(String.valueOf(getNegocioEdicion().getFecha()));
            vista.getId_caja_entrada().setText(String.valueOf(getNegocioEdicion().getId_caja()));
        }
    }

    public void boton() 
    {
        //verifica si hay campos vacios y si no continua normal
        //----
        if (vista.getId_boleta_entrada().getText().isEmpty()|| vista.getFecha_entrada().getText().isEmpty()|| vista.getId_caja_entrada().getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos", "AVISO",JOptionPane.WARNING_MESSAGE);
        
        } else {
            //convetimos a int
            int id_boleta = Integer.parseInt(vista.getId_boleta_entrada().getText());
            int fecha_entrada = Integer.parseInt(vista.getFecha_entrada().getText());
            int caja_entrada = Integer.parseInt(vista.getId_caja_entrada().getText());

            ModeloBoleta boleta = esEdicion ? negocioEdicion : new ModeloBoleta();
            boleta.setId_boleta(id_boleta);
            boleta.setFecha(fecha_entrada);
            boleta.setId_caja(caja_entrada);

            try {
                DAOBoletalmp dao = new DAOBoletalmp();
                if (!esEdicion) {
                    dao.registrar(boleta);
                } else {
                    dao.modificar(boleta);
                }
                String successMsg = esEdicion ? "modificado" : "registrado";

                JOptionPane.showMessageDialog(vista, "Se a implementado correctamente", "AVISO",JOptionPane.INFORMATION_MESSAGE);
                if (!esEdicion) {
                    vista.getId_boleta_entrada().setText("");
                    vista.getFecha_entrada().setText("");
                    vista.getId_boleta_entrada().setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar","AVISO",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }    
}

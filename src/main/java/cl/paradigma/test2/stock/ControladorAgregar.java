/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.stock;

import javax.swing.JOptionPane;

public class ControladorAgregar 
{
    private VistaAgregar vista;
    private boolean esEdicion;
    private ModeloStock negocioEdicion;

    public ControladorAgregar(VistaAgregar vista) {
        this.vista = vista;
        this.esEdicion = false;
    }

    public ControladorAgregar(VistaAgregar vista, ModeloStock stock) {
        this.vista = vista;
        this.esEdicion = true;
        this.negocioEdicion = stock;
    }

    public boolean esEdicion() {
        return esEdicion;
    }

    public ModeloStock getNegocioEdicion() {
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
            vista.getId_bodega_entrada().setText(String.valueOf(getNegocioEdicion().getId_bodega_modelo_stock()));
            vista.getId_producto_entrada().setText(String.valueOf(getNegocioEdicion().getId_producto_modelo_stock()));
            vista.getStock_entrada().setText(String.valueOf(getNegocioEdicion().getStock_modelo()));
        }
    }
    public void boton() 
    {
        // Verificar si hay campos vacíos y si no, continuar normalmente
        if (vista.getId_bodega_entrada().getText().isEmpty() || vista.getId_producto_entrada().getText().isEmpty() || vista.getStock_entrada().getText().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos", "AVISO", JOptionPane.WARNING_MESSAGE);
        } else {
            // Convertir a int
            int id_bodega = Integer.parseInt(vista.getId_bodega_entrada().getText());
            int id_producto = Integer.parseInt(vista.getId_producto_entrada().getText());
            int stock = Integer.parseInt(vista.getStock_entrada().getText());

            ModeloStock negocio = esEdicion ? negocioEdicion : new ModeloStock();
            negocio.setId_bodega_modelo_stock(id_bodega);
            negocio.setId_producto_modelo_stock(id_producto);
            negocio.setStock_modelo(stock);

            try {
                DAOStocklmp dao = new DAOStocklmp();
                if (!esEdicion) {
                    dao.registrar(negocio);
                } else {
                    dao.modificar(negocio);
                }
                String successMsg = esEdicion ? "modificado" : "registrado";

                JOptionPane.showMessageDialog(vista, "Se ha implementado correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                if (!esEdicion) {
                    vista.getId_bodega_entrada().setText("");
                    vista.getId_producto_entrada().setText("");
                    vista.getStock_entrada().setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }

    }
    }    
}

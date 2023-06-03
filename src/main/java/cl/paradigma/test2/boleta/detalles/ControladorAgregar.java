/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.boleta.detalles;

import javax.swing.JOptionPane;

public class ControladorAgregar 
{
    private VistaAgregar vista;
    private boolean esEdicion;
    private ModeloBoletaDetalle negocioEdicion;

    public ControladorAgregar(VistaAgregar vista) {
        this.vista = vista;
        this.esEdicion = false;
    }

    public ControladorAgregar(VistaAgregar vista, ModeloBoletaDetalle boleta) {
        this.vista = vista;
        this.esEdicion = true;
        this.negocioEdicion = boleta;
    }

    public boolean esEdicion() {
        return esEdicion;
    }

    public ModeloBoletaDetalle getNegocioEdicion() {
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
            vista.getId_producto_entrada().setText(String.valueOf(getNegocioEdicion().getId_producto()));
            vista.getCantidad_entrada().setText(String.valueOf(getNegocioEdicion().getCantidad()));
        }
    }
    public void boton() 
    {
        //verifica si hay campos vacios y si no continua normal
        //----
        if (vista.getId_boleta_entrada().getText().isEmpty() || vista.getId_producto_entrada().getText().isEmpty() || vista.getCantidad_entrada().getText().isEmpty() || vista.getPrecio_entrada().getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos", "AVISO",JOptionPane.WARNING_MESSAGE);
        
        } else {
            //convertimos a int
            int id_bodega = Integer.parseInt(vista.getId_boleta_entrada().getText());
            int id_producto = Integer.parseInt(vista.getId_producto_entrada().getText());
            int cantidad = Integer.parseInt(vista.getCantidad_entrada().getText());
            int precio_venta = Integer.parseInt(vista.getPrecio_entrada().getText());

            ModeloBoletaDetalle negocio = esEdicion ? negocioEdicion : new ModeloBoletaDetalle();
            negocio.setId_boleta(id_bodega);
            negocio.setId_producto(id_producto);
            negocio.setCantidad(cantidad);
            negocio.setPrecio(precio_venta);

            try {
                DAOBoletaDetalladalmp dao = new DAOBoletaDetalladalmp();
                if (!esEdicion) {
                    dao.registrar(negocio);
                } else {
                    dao.modificar(negocio);
                }
                String successMsg = esEdicion ? "modificado" : "registrado";

                JOptionPane.showMessageDialog(vista, "Se a implementado correctamente", "AVISO",JOptionPane.INFORMATION_MESSAGE);
                if (!esEdicion) {
                    vista.getId_boleta_entrada().setText("");
                    vista.getId_producto_entrada().setText("");
                    vista.getCantidad_entrada().setText("");
                    vista.getPrecio_entrada().setText("");
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar","AVISO",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }    
}

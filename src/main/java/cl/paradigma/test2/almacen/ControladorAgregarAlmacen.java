/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.almacen;

import javax.swing.JOptionPane;



public class ControladorAgregarAlmacen 
{

    private VistaAgregar vista;
    private boolean esEdicion;
    private ModeloAlmacen AlmacenEdicion;
    
    //constructores
    public ControladorAgregarAlmacen(VistaAgregar vista) {
        this.vista = vista;
        this.esEdicion = false;
    }

    public ControladorAgregarAlmacen(VistaAgregar vista, ModeloAlmacen negocio) {
        this.vista = vista;
        this.esEdicion = true;
        this.AlmacenEdicion = negocio;
    }

    public boolean esEdicion() {
        return esEdicion;
    }

    public ModeloAlmacen getNegocioEdicion() 
    {
        return AlmacenEdicion;
    }
    
    //para que al presionar editar se cambie los nombres de la VistaAgregar
    //y se rellenen los cuadros de texto con la tabla que habia
    public void edicion() 
    {
    if (esEdicion()) {
        vista.getTexto_de_registro().setText("Panel de Edicion");
        vista.getBoton_registrar().setText("Aceptar");
    }
    if (getNegocioEdicion() != null)//Mira si hay un objeto
    {
        //actualiza los cuadros de texto pero en editar
        vista.getId_almacen_insertar().setText(String.valueOf(getNegocioEdicion().getId_almacen()));
        vista.getNombre_insertar().setText(getNegocioEdicion().getNombre_almacen());
        vista.getDireccion_insertar().setText(getNegocioEdicion().getDireccion_almacen());
    }
    }
    
    public void boton() 
    {
        //verifica si hay campos vacios y si no continua normal
        //----
        if (vista.getId_almacen_insertar().getText().isEmpty()|| vista.getNombre_insertar().getText().isEmpty()|| vista.getDireccion_insertar().getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos", "AVISO",JOptionPane.WARNING_MESSAGE);
        
        } 
        
        else //sigue normal si pasa la verificacion
        {
            //convetimos a int ya que el .empty solo deja con strings la verificacion 
            int id_entrada = Integer.parseInt(vista.getId_almacen_insertar().getText());
            String nombre_entrada = vista.getNombre_insertar().getText();
            String direccion_entrada = vista.getDireccion_insertar().getText();
            
            //crea objetos
            ModeloAlmacen almacen = esEdicion ? AlmacenEdicion : new ModeloAlmacen();
            almacen.setId_almacen(id_entrada);
            almacen.setNombre_almacen(nombre_entrada);
            almacen.setDireccion_almacen(direccion_entrada);
            
            //le hacemos un try a la base de datos 
            try {
                DAOAlmacenlmp dao = new DAOAlmacenlmp();
                if (!esEdicion) {
                    dao.registrar(almacen);
                } else {
                    dao.modificar(almacen);
                }
                
                //si modificado es verdadero se edita, si no se registra 
                String successMsg = esEdicion ? "modificado" : "registrado";
                JOptionPane.showMessageDialog(vista, "Se a implementado correctamente", "AVISO",JOptionPane.INFORMATION_MESSAGE);
                if (!esEdicion) 
                {
                    vista.getNombre_insertar().setText("");
                    vista.getDireccion_insertar().setText("");
                    vista.getId_almacen_insertar().setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar","AVISO",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }
}
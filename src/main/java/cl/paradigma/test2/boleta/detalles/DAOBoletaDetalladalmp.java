package cl.paradigma.test2.boleta.detalles;

import cl.paradigma.test2.utilidades.ConexionBaseDeDatos;
import cl.paradigma.test2.utilidades.DAOBoletaDetalle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class DAOBoletaDetalladalmp extends ConexionBaseDeDatos implements DAOBoletaDetalle
        
{

    @Override
    public void registrar(ModeloBoletaDetalle boleta_detalle) 
    {
       try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("INSERT INTO detalle_de_boleta(boletas_idboletas,productos_idProducto,cantidad,precio_venta)VALUES(?,?,?,?)");
           solicitud.setInt(1, boleta_detalle.getId_boleta());
           solicitud.setInt(2, boleta_detalle.getId_producto());
           solicitud.setInt(3, boleta_detalle.getCantidad());
           solicitud.setInt(4, boleta_detalle.getPrecio());
           solicitud.executeUpdate();
       } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No se a podido agregar.\n" + e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
       }finally{
           this.Cerrar();
       }
    }
    @Override
    public void modificar(ModeloBoletaDetalle boleta_detalle) {
        try 
        {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("UPDATE detalle_de_boleta SET cantidad = ?,precio_venta = ? WHERE boletas_idBoletas = ? and productos_idProducto = ? ");
            solicitud.setInt(1, boleta_detalle.getCantidad());
            solicitud.setInt(2, boleta_detalle.getPrecio());
            solicitud.setInt(3, boleta_detalle.getId_boleta());
            solicitud.setInt(4, boleta_detalle.getId_producto());
            solicitud.executeUpdate();
        } catch(SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No se a podido modificar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }        
    }

    public void eliminar(int boleta_id, int producto_id) {
        //llamo a la la base de datos para que me borre una fila segun su id
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("DELETE FROM detalle_de_boleta WHERE boletas_idboletas = ? AND productos_idProducto = ? ");
            solicitud.setInt(1, boleta_id);
            solicitud.setInt(2, producto_id);
            solicitud.executeUpdate();//actualizamos
            solicitud.close();//cerramos
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "No se a podido eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            } finally {
                this.Cerrar();
            }
    }

    @Override
    public List<ModeloBoletaDetalle> listar() {
        List<ModeloBoletaDetalle> lista = null;
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM detalle_de_boleta");
           lista = new ArrayList();
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               ModeloBoletaDetalle stock = new ModeloBoletaDetalle();
               stock.setId_boleta(resultado.getInt("boletas_idboletas"));
               stock.setId_producto(resultado.getInt("productos_idProducto"));
               stock.setCantidad(resultado.getInt("cantidad"));
               stock.setPrecio(resultado.getInt("precio_venta"));
               lista.add(stock);
           }
           resultado.close();
           solicitud.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de listar.\n" + e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
        }finally{
            this.Cerrar();
        }
        return lista;
    }
    public ModeloBoletaDetalle getBoletaById(int boleta_id, int producto_id) throws Exception 
    {
        ModeloBoletaDetalle detalle_boleta = new ModeloBoletaDetalle();
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM detalle_de_boleta WHERE boletas_idboletas = ? AND productos_idProducto = ? ");
           solicitud.setInt(1,boleta_id);
           solicitud.setInt(2,producto_id);
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next())
           {
               detalle_boleta.setId_boleta(resultado.getInt("boletas_idboletas"));
               detalle_boleta.setId_producto(resultado.getInt("productos_idProducto"));
               detalle_boleta.setCantidad(resultado.getInt("cantidad"));
               detalle_boleta.setPrecio(resultado.getInt("precio_venta"));
           }
           resultado.close();
           solicitud.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error modelo.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        }finally{
            this.Cerrar();
        }
        return detalle_boleta;       
    }
    
}

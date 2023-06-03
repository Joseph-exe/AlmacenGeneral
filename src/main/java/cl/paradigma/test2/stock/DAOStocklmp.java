package cl.paradigma.test2.stock;

import cl.paradigma.test2.utilidades.ConexionBaseDeDatos;
import cl.paradigma.test2.utilidades.DAOStock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOStocklmp extends ConexionBaseDeDatos implements DAOStock
{

    @Override
    public void registrar(ModeloStock stock) 
    {
       try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("INSERT INTO stock_producto_bodega(Bodegas_idBodegas,Productos_idProducto,stock)VALUES(?,?,?);");
           solicitud.setInt(1, stock.getId_bodega_modelo_stock());
           solicitud.setInt(2, stock.getId_producto_modelo_stock());
           solicitud.setInt(3, stock.getStock_modelo());
           solicitud.executeUpdate();
       } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No se a podido agregar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
       }finally{
           this.Cerrar();
       }
    }
    @Override
    public void modificar(ModeloStock stock) {
        try 
        {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("UPDATE stock_producto_bodega SET stock = ? WHERE bodegas_idBodegas = ? and productos_idProducto = ? ");
            solicitud.setInt(1, stock.getStock_modelo());
            solicitud.setInt(2, stock.getId_bodega_modelo_stock());
            solicitud.setInt(3, stock.getId_producto_modelo_stock());
            solicitud.executeUpdate();
        } catch(SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No se a podido modificar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }        
    }

    public void eliminar(int bodega_id, int producto_id) {
        //llamo a la la base de datos para que me borre una fila segun su id
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("DELETE FROM stock_producto_bodega WHERE bodegas_idBodegas = ? AND productos_idProducto = ? ");
            solicitud.setInt(1, bodega_id);
            solicitud.setInt(2, producto_id);
            solicitud.executeUpdate();//actualizamos
            solicitud.close();//cerramos
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "No se a podido eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            } finally {
                this.Cerrar();
            }
    }

    public void descontar(int id_producto, int cantidad) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM stock_producto_bodega WHERE Productos_idProducto = ?");
            solicitud.setInt(1, id_producto);
            ResultSet resultado = solicitud.executeQuery();

            while (resultado.next()) {
                int stockActual = resultado.getInt("stock");
                int bodegaId = resultado.getInt("Bodegas_idBodegas");
                int productoId = resultado.getInt("Productos_idProducto");

                if (stockActual >= cantidad) {
                    int stockActualizado = stockActual - cantidad;

                    // Actualizar el stock en la tabla
                    PreparedStatement actualizar = this.conexion.prepareStatement("UPDATE stock_producto_bodega SET stock = ? WHERE Bodegas_idBodegas = ? AND Productos_idProducto = ?");
                    actualizar.setInt(1, stockActualizado);
                    actualizar.setInt(2, bodegaId);
                    actualizar.setInt(3, productoId);
                    actualizar.executeUpdate();
                    actualizar.close();

                    cantidad = 0; // Se descontó todo el stock necesario, salir del ciclo
                } else {
                    // Descontar la cantidad disponible en la bodega actual
                    cantidad -= stockActual;

                    // Actualizar el stock en la tabla a 0
                    PreparedStatement actualizar = this.conexion.prepareStatement("UPDATE stock_producto_bodega SET stock = 0 WHERE Bodegas_idBodegas = ? AND Productos_idProducto = ?");
                    actualizar.setInt(1, bodegaId);
                    actualizar.setInt(2, productoId);
                    actualizar.executeUpdate();
                    actualizar.close();
                }

                if (cantidad == 0) {
                    break; // Se descontó todo el stock necesario, salir del ciclo
                }
            }

            resultado.close();
            solicitud.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo descontar el stock.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
    }




    @Override
    public List<ModeloStock> listar() {
        List<ModeloStock> lista = null;
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM stock_producto_bodega;");
           lista = new ArrayList();
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               ModeloStock stock = new ModeloStock();
               stock.setId_bodega_modelo_stock(resultado.getInt("bodegas_idBodegas"));
               stock.setId_producto_modelo_stock(resultado.getInt("productos_idProducto"));
               stock.setStock_modelo(resultado.getInt("stock"));
               lista.add(stock);
           }
           resultado.close();
           solicitud.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de listar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        }finally{
            this.Cerrar();
        }
        return lista;
    }
    public ModeloStock getStockById(int bodega_id, int producto_id) throws Exception 
    {
        ModeloStock stock = new ModeloStock();
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM stock_producto_bodega WHERE bodegas_idBodegas = ? AND productos_idProducto = ? ");
           solicitud.setInt(1,bodega_id);
           solicitud.setInt(2,producto_id);
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next())
           {
               stock.setId_bodega_modelo_stock(resultado.getInt("bodegas_idBodegas"));
               stock.setId_producto_modelo_stock(resultado.getInt("productos_idProducto"));
               stock.setStock_modelo(resultado.getInt("stock"));
           }
           resultado.close();
           solicitud.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error modelo.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        }finally{
            this.Cerrar();
        }
        return stock;       
    }
    
}

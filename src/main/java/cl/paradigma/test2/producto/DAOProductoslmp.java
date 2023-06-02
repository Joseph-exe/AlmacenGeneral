/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.producto;
import cl.paradigma.test2.utilidades.ConexionBaseDeDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cl.paradigma.test2.utilidades.DAOProductos;
import javax.swing.JOptionPane;

/**
 *
 * @author Aspire-E15
 */
    public class DAOProductoslmp extends ConexionBaseDeDatos implements DAOProductos{

    @Override
    public void registrar(ModeloProducto producto) {
       try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("INSERT INTO producto(idProducto,nombre,precio,peso,volumen)VALUES(?,?,?,?,?);");
           solicitud.setInt(1, producto.getId());
           solicitud.setString(2, producto.getNombre());
           solicitud.setInt(3, producto.getPrecio());
           solicitud.setInt(4, producto.getPeso());
           solicitud.setInt(5, producto.getVolumen());
           solicitud.executeUpdate();
       } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No se a podido agregar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
       }finally{
           this.Cerrar();
       }
    }

    @Override
    public void modificar(ModeloProducto producto) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("UPDATE producto SET nombre = ?, precio = ?, peso = ?, volumen = ? WHERE idProducto= ? ");
            solicitud.setString(1, producto.getNombre());
            solicitud.setInt(2, producto.getPrecio());
            solicitud.setInt(3, producto.getPeso());
            solicitud.setInt(4, producto.getVolumen());
            solicitud.setInt(5, producto.getId());
            solicitud.executeUpdate();
        } catch(SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No se a podido modificar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }        
    }

    @Override
    public void eliminar(int producto_id) {
        //llamo a la la base de datos para que me borre una fila segun su id
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("DELETE FROM producto WHERE idProducto = ?;");
            solicitud.setInt(1, producto_id);
            solicitud.executeUpdate();//actualizamos
            solicitud.close();//cerramos
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "No se a podido eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            } finally {
                this.Cerrar();
            }
    }

    @Override
    public List<ModeloProducto> listar() {
        List<ModeloProducto> lista = null;
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM producto;");
           
           lista = new ArrayList();
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               ModeloProducto producto = new ModeloProducto();
               producto.setId(resultado.getInt("idProducto"));
               producto.setNombre(resultado.getString("nombre"));
               producto.setPrecio(resultado.getInt("precio"));
               producto.setPeso(resultado.getInt("peso"));
               producto.setVolumen(resultado.getInt("volumen"));
               lista.add(producto);
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

    @Override
    public ModeloProducto getNegocioById(int producto_id) {
        ModeloProducto producto = new ModeloProducto();
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM producto WHERE idProducto = ? LIMIT 1;");
           solicitud.setInt(1,producto_id);
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               producto.setId(resultado.getInt("idProducto"));
               producto.setNombre(resultado.getString("nombre"));
               producto.setPrecio(resultado.getInt("precio"));
               producto.setPeso(resultado.getInt("peso"));
               producto.setVolumen(resultado.getInt("volumen"));
           }
           resultado.close();
           solicitud.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error modelo.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        }finally{
            this.Cerrar();
        }
        return producto;
    }
    
}

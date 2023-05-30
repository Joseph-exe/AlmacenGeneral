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
    public void registrar(ModeloProducto negocio) {
       try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("INSERT INTO negocio(ID,Nombre,Precio,Stock)VALUES(?,?,?,?);");
           solicitud.setInt(1, negocio.getId());
           solicitud.setString(2, negocio.getNombre());
           solicitud.setInt(3, negocio.getPrecio());
           solicitud.setInt(4, negocio.getStock());
           solicitud.executeUpdate();
       } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No se a podido agregar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
       }finally{
           this.Cerrar();
       }
    }

    @Override
    public void modificar(ModeloProducto negocio) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("UPDATE negocio SET Nombre = ?, Precio = ?, Stock = ? WHERE ID= ? ");
            solicitud.setString(1, negocio.getNombre());
            solicitud.setInt(2, negocio.getPrecio());
            solicitud.setInt(3, negocio.getStock());
            solicitud.setInt(4, negocio.getId());
            solicitud.executeUpdate();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se a podido modificar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }        
    }

    @Override
    public void eliminar(int negocioId) {
        //llamo a la la base de datos para que me borre una fila segun su id
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("DELETE FROM negocio WHERE id = ?;");
            solicitud.setInt(1, negocioId);
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
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM negocio;");
           
           lista = new ArrayList();
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               ModeloProducto negocio = new ModeloProducto();
               negocio.setId(resultado.getInt("ID"));
               negocio.setNombre(resultado.getString("Nombre"));
               negocio.setPrecio(resultado.getInt("Precio"));
               negocio.setStock(resultado.getInt("Stock"));
               lista.add(negocio);
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
    public ModeloProducto getNegocioById(int negocioId) {
        ModeloProducto negocio = new ModeloProducto();
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM negocio WHERE id = ? LIMIT 1;");
           solicitud.setInt(1,negocioId);
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               negocio.setId(resultado.getInt("ID"));
               negocio.setNombre(resultado.getString("Nombre"));
               negocio.setPrecio(resultado.getInt("Precio"));
               negocio.setStock(resultado.getInt("Stock"));
           }
           resultado.close();
           solicitud.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error modelo.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        }finally{
            this.Cerrar();
        }
        return negocio;
    }
    
}

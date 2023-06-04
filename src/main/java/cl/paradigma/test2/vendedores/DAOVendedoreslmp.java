/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.vendedores;

import cl.paradigma.test2.utilidades.ConexionBaseDeDatos;
import cl.paradigma.test2.utilidades.DAOVendedores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aspire-E15
 */
    public class DAOVendedoreslmp extends ConexionBaseDeDatos implements DAOVendedores{

    @Override
    public void registrar(ModeloVendedores vendedores) {
       try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("INSERT INTO vendedores(idVendedor,nombre,run)VALUES(?,?,?)");
           solicitud.setInt(1, vendedores.getId_vendedor());
           solicitud.setString(2, vendedores.getNombre());
           solicitud.setString(3, vendedores.getRun());
           solicitud.executeUpdate();
       } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No se a podido agregar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
       }finally{
           this.Cerrar();
       }
    }

    @Override
    public void modificar(ModeloVendedores vendedores) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("UPDATE vendedores SET nombre = ?, run = ? WHERE idvendedor= ? ");
            solicitud.setString(1, vendedores.getNombre());
            solicitud.setString(2, vendedores.getRun());
            solicitud.setInt(3, vendedores.getId_vendedor());
            solicitud.executeUpdate();
        } catch(SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No se a podido modificar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }        
    }

    @Override
    public void eliminar(int vendedor_id) {
        //llamo a la la base de datos para que me borre una fila segun su id
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("DELETE FROM vendedores WHERE idvendedor = ?;");
            solicitud.setInt(1, vendedor_id);
            solicitud.executeUpdate();//actualizamos
            solicitud.close();//cerramos
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "No se a podido eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            } finally {
                this.Cerrar();
            }
    }

    @Override
    public List<ModeloVendedores> listar() {
        List<ModeloVendedores> lista = null;
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM vendedores");
           
           lista = new ArrayList();
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               ModeloVendedores vendedores = new ModeloVendedores();
               
               vendedores.setId_vendedor(resultado.getInt("idvendedor"));
               vendedores.setNombre(resultado.getString("nombre"));
               vendedores.setRun(resultado.getString("run"));
               lista.add(vendedores);
           }
           resultado.close();
           solicitud.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de listar.\n"+e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
        }finally{
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public ModeloVendedores getVendedoresById(int vendedor_id) {
        ModeloVendedores producto = new ModeloVendedores();
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM vendedores WHERE idvendedor = ? LIMIT 1;");
           solicitud.setInt(1,vendedor_id);
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               producto.setId_vendedor(resultado.getInt("idvendedor"));
               producto.setNombre(resultado.getString("nombre"));
               producto.setRun(resultado.getString("run"));
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

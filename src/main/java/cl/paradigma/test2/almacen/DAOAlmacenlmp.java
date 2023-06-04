/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.almacen;

import cl.paradigma.test2.utilidades.ConexionBaseDeDatos;
import cl.paradigma.test2.utilidades.DAOAlmacen;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

    
public class DAOAlmacenlmp extends ConexionBaseDeDatos implements DAOAlmacen
{
    @Override
    //registramos
    public void registrar(ModeloAlmacen almacen) {
       try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("INSERT INTO almacenes(idAlmacen,nombre,direccion)VALUES(?,?,?);");
           solicitud.setInt(1, almacen.getId_almacen());
           solicitud.setString(2, almacen.getNombre_almacen());
           solicitud.setString(3, almacen.getDireccion_almacen());
           solicitud.executeUpdate();
       } catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null, "No se a podido agregar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
       }finally{
           this.Cerrar();
       }
    }
    //modiicamos
    @Override
    public void modificar(ModeloAlmacen almacen) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("UPDATE almacenes SET nombre = ?, direccion = ? WHERE idAlmacen= ? ");
            solicitud.setString(1, almacen.getNombre_almacen());
            solicitud.setString(2, almacen.getDireccion_almacen());
            solicitud.setInt(3, almacen.getId_almacen());
            solicitud.executeUpdate();
        } catch(SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No se a podido modificar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }        
    }
    //eliminamos
    @Override
    public void eliminar(int almacen_id) {
        //llamo a la la base de datos para que me borre una fila segun su id
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("DELETE FROM almacenes WHERE idAlmacen = ?;");
            solicitud.setInt(1, almacen_id);
            solicitud.executeUpdate();//actualizamos
            solicitud.close();//cerramos
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "No se a podido eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            } finally {
                this.Cerrar();
            }
    }
    //listamos
    @Override
    public List<ModeloAlmacen> listar() {
        List<ModeloAlmacen> lista = null;
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM almacenes;");
           
           lista = new ArrayList();
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               ModeloAlmacen almacen = new ModeloAlmacen();
               almacen.setId_almacen(resultado.getInt("idAlmacen"));
               almacen.setNombre_almacen(resultado.getString("nombre"));
               almacen.setDireccion_almacen(resultado.getString("direccion"));
               lista.add(almacen);
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
    //modelamos
    @Override
    public ModeloAlmacen getAlmacenById(int almacen_id) {
        ModeloAlmacen almacen = new ModeloAlmacen();
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM almacenes WHERE idAlmacen = ? LIMIT 1;");
           solicitud.setInt(1,almacen_id);
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               almacen.setId_almacen(resultado.getInt("idAlmacen"));
               almacen.setNombre_almacen(resultado.getString("nombre"));
               almacen.setDireccion_almacen(resultado.getString("direccion"));
           }
           resultado.close();
           solicitud.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error modelo.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        }finally{
            this.Cerrar();
        }
        return almacen;
    }
    
}
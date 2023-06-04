/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.caja;

import cl.paradigma.test2.main.VistaPrincipal;
import static cl.paradigma.test2.main.VistaPrincipal.ShowJPanel;
import cl.paradigma.test2.utilidades.ConexionBaseDeDatos;
import cl.paradigma.test2.utilidades.DAOCaja;
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
    public class DAOCajalmp extends ConexionBaseDeDatos implements DAOCaja{

    @Override
    public void registrar(ModeloCaja caja) {
       try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("INSERT INTO cajas(idCaja,tipo,numero,almacenes_idtable2,vendedor_idvendedor)VALUES(?,?,?,?,?);");
           solicitud.setInt(1, caja.getId_caja());
           solicitud.setString(2, caja.getTipo_caja());
           solicitud.setInt(3, caja.getNumero_caja());
           solicitud.setInt(4, caja.getId_almacen());
           solicitud.setInt(5, caja.getId_vendedor());
           solicitud.executeUpdate();
           JOptionPane.showMessageDialog(null, "Se ha implementado correctamente", "AVISO",JOptionPane.INFORMATION_MESSAGE);
           VistaPrincipal.ShowJPanel(new VistaAgregar());
       } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No se a podido agregar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
       }finally{
           this.Cerrar();
       }
    }

    @Override
    public void modificar(ModeloCaja caja) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("UPDATE cajas SET tipo = ?, numero = ?, almacenes_idtable2 = ?, vendedor_idvendedor = ? WHERE idCaja= ? ");
            solicitud.setString(1, caja.getTipo_caja());
            solicitud.setInt(2, caja.getNumero_caja());
            solicitud.setInt(3, caja.getId_almacen());
            solicitud.setInt(4, caja.getId_vendedor());
            solicitud.setInt(5, caja.getId_caja());
            solicitud.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha Modificado Correctamente", "AVISO",JOptionPane.INFORMATION_MESSAGE);
            ShowJPanel(new VistaCaja());
        } catch(SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No se a podido modificar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }        
    }

    @Override
    public void eliminar(int caja_id) {
        //llamo a la la base de datos para que me borre una fila segun su id
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("DELETE FROM cajas WHERE idCaja = ?;");
            solicitud.setInt(1, caja_id);
            solicitud.executeUpdate();//actualizamos
            solicitud.close();//cerramos
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "No se a podido eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            } finally {
                this.Cerrar();
            }
    }

    @Override
    public List<ModeloCaja> listar() {
        List<ModeloCaja> lista = null;
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM cajas");
           
           lista = new ArrayList();
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               ModeloCaja producto = new ModeloCaja();
               producto.setId_caja(resultado.getInt("idCaja"));
               producto.setTipo_caja(resultado.getString("tipo"));
               producto.setNumero_caja(resultado.getInt("numero"));
               producto.setId_almacen(resultado.getInt("almacenes_idtable2"));
               producto.setId_vendedor(resultado.getInt("vendedor_idvendedor"));
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
    public ModeloCaja getNegocioById(int caja_id) {
        ModeloCaja producto = new ModeloCaja();
        try{
           this.Conectar();
           PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM cajas WHERE idCaja = ? LIMIT 1;");
           solicitud.setInt(1,caja_id);
           ResultSet resultado = solicitud.executeQuery();
           while(resultado.next()){
               producto.setId_caja(resultado.getInt("idCaja"));
               producto.setTipo_caja(resultado.getString("tipo"));
               producto.setNumero_caja(resultado.getInt("numero"));
               producto.setId_almacen(resultado.getInt("almacenes_idtable2"));
               producto.setId_vendedor(resultado.getInt("vendedor_idvendedor"));
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

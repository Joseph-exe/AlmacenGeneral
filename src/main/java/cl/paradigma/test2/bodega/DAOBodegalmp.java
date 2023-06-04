/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.bodega;

import static cl.paradigma.test2.main.VistaPrincipal.ShowJPanel;
import cl.paradigma.test2.utilidades.ConexionBaseDeDatos;
import cl.paradigma.test2.utilidades.DAOBodega;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOBodegalmp extends ConexionBaseDeDatos implements DAOBodega 
{

    @Override
public void registrar(ModeloBodega bodega) {
    try {
        this.Conectar();
        PreparedStatement solicitud = this.conexion.prepareStatement("INSERT INTO bodegas(idBodegas, volumen_max, peso_max, almacenes_idtable2) VALUES (?, ?, ?, ?)");
        solicitud.setInt(1, bodega.getId_bodega());
        solicitud.setInt(2, bodega.getVolumen_maximo());
        solicitud.setInt(3, bodega.getPeso_maximo());
        solicitud.setInt(4, bodega.getId_almacen());
        solicitud.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar,Verifique su informacion.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
    } finally {
        this.Cerrar();
    }
}
    @Override
    public void modificar(ModeloBodega bodega) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("UPDATE bodegas SET almacenes_idtable2 = ?, volumen_max = ?, peso_max = ? WHERE idBodegas = ?");
            solicitud.setInt(1, bodega.getId_almacen());
            solicitud.setInt(2, bodega.getVolumen_maximo());
            solicitud.setInt(3, bodega.getPeso_maximo());
            solicitud.setInt(4, bodega.getId_bodega());
            solicitud.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha Editado Correctamente \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            ShowJPanel(new VistaBodegas());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar.\n" + e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int bodega_id) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("DELETE FROM bodegas WHERE idBodegas = ?");
            solicitud.setInt(1, bodega_id);
            solicitud.executeUpdate();
            solicitud.close();
            JOptionPane.showMessageDialog(null, "Se ha Eliminado Correctamente \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar.\n" + e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
    }
    @Override
    public List<ModeloBodega> listar() {
        List<ModeloBodega> lista = null;
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM bodegas");
            lista = new ArrayList<>();
            ResultSet resultado = solicitud.executeQuery();
            while (resultado.next()) {
                ModeloBodega bodega = new ModeloBodega();
                bodega.setId_bodega(resultado.getInt("idBodegas"));
                bodega.setId_almacen(resultado.getInt("almacenes_idtable2"));
                bodega.setPeso_maximo(resultado.getInt("peso_max"));
                bodega.setVolumen_maximo(resultado.getInt("volumen_max"));
                lista.add(bodega);
            }
            resultado.close();
            solicitud.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar.\n" + e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public ModeloBodega getBodegaById(int bodega_id) {
        ModeloBodega producto = new ModeloBodega();
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM bodegas WHERE idBodegas = ? LIMIT 1");
            solicitud.setInt(1, bodega_id);
            ResultSet resultado = solicitud.executeQuery();
            while (resultado.next()) {
                producto.setId_bodega(resultado.getInt("idBodegas"));
                producto.setId_almacen(resultado.getInt("almacenes_idtable2"));
                producto.setPeso_maximo(resultado.getInt("peso_max"));
                producto.setVolumen_maximo(resultado.getInt("volumen_max"));
            }
            resultado.close();
            solicitud.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el modelo.\n" + e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
        return producto;
    }

}



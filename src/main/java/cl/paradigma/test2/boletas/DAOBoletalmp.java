package cl.paradigma.test2.boletas;

import cl.paradigma.test2.utilidades.ConexionBaseDeDatos;
import cl.paradigma.test2.utilidades.DAOBoleta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOBoletalmp extends ConexionBaseDeDatos implements DAOBoleta {

    @Override
    public void registrar(ModeloBoleta boleta) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("INSERT INTO boletas(idboletas, fecha, cajas_idCajas) VALUES (?, ?, ?)");
            solicitud.setInt(1, boleta.getId_boleta());
            solicitud.setInt(2, boleta.getFecha());
            solicitud.setInt(3, boleta.getId_caja());

            solicitud.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido agregar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(ModeloBoleta boleta) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("UPDATE boletas SET fecha = ?, cajas_idCaja = ? WHERE idboletas = ?");
            solicitud.setInt(1, boleta.getFecha());
            solicitud.setInt(2, boleta.getId_caja());
            solicitud.setInt(3, boleta.getId_boleta());
            solicitud.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar.\n"+ e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int boleta_id) {
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("DELETE FROM boletas WHERE idboletas = ?");
            solicitud.setInt(1, boleta_id);
            solicitud.executeUpdate();
            solicitud.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar.\n"+e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<ModeloBoleta> listar() {
        List<ModeloBoleta> lista = null;
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM boletas");

            lista = new ArrayList<>();
            ResultSet resultado = solicitud.executeQuery();
            while (resultado.next()) {
                ModeloBoleta boleta = new ModeloBoleta();
                boleta.setId_boleta(resultado.getInt("idboletas"));
                boleta.setFecha(resultado.getInt("fecha"));
                boleta.setId_caja(resultado.getInt("cajas_idCaja"));
                lista.add(boleta);
            }
            resultado.close();
            solicitud.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar:\n" + e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public ModeloBoleta getNegocioById(int boleta_id) {
        ModeloBoleta boleta = new ModeloBoleta();
        try {
            this.Conectar();
            PreparedStatement solicitud = this.conexion.prepareStatement("SELECT * FROM boletas WHERE idboletas = ? LIMIT 1");
            solicitud.setInt(1, boleta_id);
            ResultSet resultado = solicitud.executeQuery();
            while (resultado.next()) {
                boleta.setId_boleta(resultado.getInt("idboletas"));
                boleta.setFecha(resultado.getInt("fecha"));
                boleta.setId_caja(resultado.getInt("cajas_idCaja"));
            }
            resultado.close();
            solicitud.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el modelo.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
        return boleta;
    }

}

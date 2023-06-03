/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.paradigma.test2.utilidades;

import cl.paradigma.test2.boleta.detalles.ModeloBoletaDetalle;
import java.util.List;

/**
 *
 * @author Aspire-E15
 */
public interface DAOBoletaDetalle {
    public void registrar(ModeloBoletaDetalle boleta_detalles) throws Exception;
    public void modificar(ModeloBoletaDetalle boleta_detalles) throws Exception;
    public void eliminar(int boleta_detalles_id,int producto_id) throws Exception;
    public List<ModeloBoletaDetalle> listar() throws Exception;
    public ModeloBoletaDetalle getStockById(int boleta_detalles,int producto_id) throws Exception;    
}

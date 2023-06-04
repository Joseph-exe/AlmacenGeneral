/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.paradigma.test2.utilidades;
import cl.paradigma.test2.bodega.ModeloBodega;
import java.util.List;

/**
 *
 * @author Aspire-E15
 */
public interface DAOBodega 
{
    public void registrar(ModeloBodega producto) throws Exception;
    public void modificar(ModeloBodega producto) throws Exception;
    public void eliminar(int bodega_id) throws Exception;
    public List<ModeloBodega> listar() throws Exception;
    public ModeloBodega getBodegaById(int producto_id) throws Exception;
}
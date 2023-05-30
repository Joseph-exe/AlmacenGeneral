/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.paradigma.test2.utilidades;
import cl.paradigma.test2.producto.ModeloProducto;
import java.util.List;

/**
 *
 * @author Aspire-E15
 */
public interface DAOProductos {
    public void registrar(ModeloProducto negocio) throws Exception;
    public void modificar(ModeloProducto negocio) throws Exception;
    public void eliminar(int negocioId) throws Exception;//negocioID es por que solo necesitamos el id
    public List<ModeloProducto> listar() throws Exception;
    public ModeloProducto getNegocioById(int negocioId) throws Exception;
}
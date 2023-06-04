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
    public void registrar(ModeloProducto producto_id) throws Exception;
    public void modificar(ModeloProducto producto_id) throws Exception;
    public void eliminar(int prducto_id) throws Exception;
    public List<ModeloProducto> listar() throws Exception;
    public ModeloProducto getProductoById(int producto_id) throws Exception;
}
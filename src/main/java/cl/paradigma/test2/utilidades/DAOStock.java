/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.paradigma.test2.utilidades;
import cl.paradigma.test2.stock.ModeloStock;
import cl.paradigma.test2.venta.VistaVenta;
import java.util.List;

public interface DAOStock 
{
    public void registrar(ModeloStock stock) throws Exception;
    public void modificar(ModeloStock stock) throws Exception;
    public void eliminar(int bodega_id, int producto_id);
    public void descontar(int idProducto, int cantidad);
    public List<ModeloStock> listar() throws Exception;
    public ModeloStock getStockById(int bodega_id,int producto_id) throws Exception;
}

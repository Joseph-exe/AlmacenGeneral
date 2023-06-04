/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.paradigma.test2.utilidades;
import cl.paradigma.test2.almacen.ModeloAlmacen;
import java.util.List;

/**
 *
 * @author Aspire-E15
 */
public interface DAOAlmacen 
{
    public void registrar(ModeloAlmacen almacen) throws Exception;
    public void modificar(ModeloAlmacen almacen) throws Exception;
    public void eliminar(int almacen_id) throws Exception;
    public List<ModeloAlmacen> listar() throws Exception;
    public ModeloAlmacen getAlmacenById(int almacen_id) throws Exception;
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.paradigma.test2.utilidades;

import cl.paradigma.test2.boletas.ModeloBoleta;
import java.util.List;

/**
 *
 * @author Aspire-E15
 */
public interface DAOBoleta 
{
    public void registrar(ModeloBoleta negocio) throws Exception;
    public void modificar(ModeloBoleta negocio) throws Exception;
    public void eliminar(int negocioId) throws Exception;//negocioID es por que solo necesitamos el id
    public List<ModeloBoleta> listar() throws Exception;
    public ModeloBoleta getNegocioById(int negocioId) throws Exception;
}

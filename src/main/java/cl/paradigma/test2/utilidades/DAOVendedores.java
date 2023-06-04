/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.paradigma.test2.utilidades;

import cl.paradigma.test2.vendedores.ModeloVendedores;
import java.util.List;

/**
 *
 * @author Aspire-E15
 */
public interface DAOVendedores {
    public void registrar(ModeloVendedores vendedores_id) throws Exception;
    public void modificar(ModeloVendedores vendedores_id) throws Exception;
    public void eliminar(int vendedor_id) throws Exception;
    public List<ModeloVendedores> listar() throws Exception;
    public ModeloVendedores getVendedoresById(int vendedores_id) throws Exception;
}
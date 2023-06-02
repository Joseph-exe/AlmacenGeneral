/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.paradigma.test2.utilidades;

import cl.paradigma.test2.caja.ModeloCaja;
import java.util.List;

/**
 *
 * @author Aspire-E15
 */
public interface DAOCaja 
{
    public void registrar(ModeloCaja almacen);
    public void modificar(ModeloCaja almacen);
    public void eliminar(int almacen_id);
    public List<ModeloCaja> listar();
    public ModeloCaja getNegocioById(int almacen_id);
}
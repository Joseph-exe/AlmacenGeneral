/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.stock;

/**
 *
 * @author Aspire-E15
 */
public class ModeloStock 
{
    private int id_bodega_modelo_stock;
    private int id_producto_modelo_stock;
    private int stock_modelo;

    public void setId_bodega_modelo_stock(int id_bodega_modelo_stock) {
        this.id_bodega_modelo_stock = id_bodega_modelo_stock;
    }

    public void setId_producto_modelo_stock(int id_producto_modelo_stock) {
        this.id_producto_modelo_stock = id_producto_modelo_stock;
    }

    public void setStock_modelo(int stock_modelo) {
        this.stock_modelo = stock_modelo;
    }

    public int getId_bodega_modelo_stock() {
        return id_bodega_modelo_stock;
    }

    public int getId_producto_modelo_stock() {
        return id_producto_modelo_stock;
    }

    public int getStock_modelo() {
        return stock_modelo;
    }

}

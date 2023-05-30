/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.producto;

/**
 *
 * @author Aspire-E15
 */
public class ModeloProducto {
    private int id;
    private String Nombre;
    private int Precio;
    private int Stock;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setPrecio(String precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

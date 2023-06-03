/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.boleta.detalles;


/**
 *
 * @author Aspire-E15
 */
public class ModeloBoletaDetalle {
    private int id_boleta;
    private int id_producto;
    private int cantidad;
    private int precio;

    public int getId_boleta() {
        return id_boleta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}

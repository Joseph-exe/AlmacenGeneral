/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.boletas;


/**
 *
 * @author Aspire-E15
 */
public class ModeloBoleta {
    private int id_boleta;
    private int fecha;
    private int id_producto;
    private int id_caja;
    private int cantidad_boleta;
    private int precio_venta;

    public void setId_caja(int id_caja) {
        this.id_caja = id_caja;
    }

    public int getId_caja() {
        return id_caja;
    }

    public int getId_boleta() {
        return id_boleta;
    }

    public int getFecha() {
        return fecha;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad_boleta() {
        return cantidad_boleta;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad_boleta(int cantidad_boleta) {
        this.cantidad_boleta = cantidad_boleta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    } 
    
}

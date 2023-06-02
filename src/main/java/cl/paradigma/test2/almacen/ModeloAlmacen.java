/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.almacen;


/**
 *
 * @author Aspire-E15
 */
public class ModeloAlmacen 
{
    private int id_almacen;
    private String nombre_almacen;
    private String direccion_almacen;

    public int getId_almacen() {
        return id_almacen;
    }

    public String getNombre_almacen() {
        return nombre_almacen;
    }

    public String getDireccion_almacen() {
        return direccion_almacen;
    }

    public void setId_almacen(int id_almacen) {
        this.id_almacen = id_almacen;
    }

    public void setNombre_almacen(String nombre_almacen) {
        this.nombre_almacen = nombre_almacen;
    }

    public void setDireccion_almacen(String direccion_almacen) {
        this.direccion_almacen = direccion_almacen;
    }
}

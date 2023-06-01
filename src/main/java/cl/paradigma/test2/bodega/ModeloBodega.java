/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.bodega;
/**
 *
 * @author Aspire-E15
 */
public class ModeloBodega {
    private int id_bodega;
    private int id_almacen;
    private int peso_maximo;
    private int volumen_maximo;

    public void setId_bodega(int id_bodega) {
        this.id_bodega = id_bodega;
    }

    public int getId_bodega() {
        return id_bodega;
    }

    public int getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(int id_almacen) {
        this.id_almacen = id_almacen;
    }

    public int getPeso_maximo() {
        return peso_maximo;
    }

    public int getVolumen_maximo() {
        return volumen_maximo;
    }

    public void setPeso_maximo(int peso_maximo) {
        this.peso_maximo = peso_maximo;
    }

    public void setVolumen_maximo(int volumen_maximo) {
        this.volumen_maximo = volumen_maximo;
    }
    
}

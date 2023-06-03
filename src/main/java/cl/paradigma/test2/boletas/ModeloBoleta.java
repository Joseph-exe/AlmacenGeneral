/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.boletas;


/**
 *
 * @author Aspire-E15
 */
public class ModeloBoleta 
{
    private int id_boleta;
    private int fecha;
    private int id_caja;

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

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

/**
 * Dao que representa la infrmacion del reporte de ventas diarias
 * @author leonardovalbuenacalderon
 */
public class VentaDiariaDao {
    
        
    /**
     * nombre del mueble
     */
    private String nombre;
    
    /**
     * unidades vendidas
     */
    private int cantidad;
    
    /**
     * valor unitario
     */
    private long constoUnitario;
    
    /**
     * valot total
     */
    private long costoTotal;

    
    /**
     * constructor de la clase
     * @param nombre
     * @param cantidad
     * @param constoUnitario
     * @param costoTotal 
     */
    public VentaDiariaDao(String nombre, int cantidad, long constoUnitario, long costoTotal) {        
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.constoUnitario = constoUnitario;
        this.costoTotal = costoTotal;
    }

    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getConstoUnitario() {
        return constoUnitario;
    }

    public void setConstoUnitario(long constoUnitario) {
        this.constoUnitario = constoUnitario;
    }

    public long getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(long costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    
    
    
}

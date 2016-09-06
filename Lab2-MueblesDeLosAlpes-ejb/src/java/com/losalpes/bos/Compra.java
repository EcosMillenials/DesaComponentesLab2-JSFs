/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ Compra.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.bos;

/**
 * Representación de una compra en el sistema. 
 * 
 * @author jc.albarracin
 */
public class Compra {
   
    /** Referencia de la compra. */
    private int referencia;
    
    /** Valor total de la compra. */
    private double valor;
    
    /** Descripción de los productos adquiridos. */
    private String descripcion;
    
    //-----------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------
    
    /**
     * Constructor sin parámetros de la clase.
     */
    public Compra() {
    }

    /**
     * onstructor de la clase. Inicializa los atributos con los valores que ingresan por parametro.
     * 
     * @param referencia Referencia de la compra.
     * @param valor Valor total de la compra.
     * @param descripcion Descripción de los productos adquiridos.
     */   
    public Compra(int referencia, double valor, String descripcion) {
        this.referencia = referencia;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    
    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    
    
    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}

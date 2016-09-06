/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

/**
 * Clase que representa un cliente
 *
 * @author l.valbuena
 */
public class Cliente {

    private TipoDocumento tipoDocumento;
    private long numeroDocumento;
    private String nombreCompleto;
    private long telefonoResidencia;
    private long telefonocelular;
    private String direccion;
    private String ciudadResidencia;
    private String departamento;
    private String país;
    private String profesion;
    private String email;

    /**
     * Constructor sin parametros
     */
    public Cliente() {

    }

    /**
     * Constructor de la clase con parametros
     *
     * @param tipoDocumento
     * @param numeroDocumento
     * @param nombreCompleto
     * @param telefonoResidencia
     * @param telefonocelular
     * @param direccion
     * @param ciudadResidencia
     * @param departamento
     * @param país
     * @param profesion
     * @param email
     */
    public Cliente(TipoDocumento tipoDocumento, long numeroDocumento, String nombreCompleto,
            long telefonoResidencia, long telefonocelular, String direccion, String ciudadResidencia,
            String departamento, String país, String profesion, String email) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreCompleto = nombreCompleto;
        this.telefonoResidencia = telefonoResidencia;
        this.telefonocelular = telefonocelular;
        this.direccion = direccion;
        this.ciudadResidencia = ciudadResidencia;
        this.departamento = departamento;
        this.país = país;
        this.profesion = profesion;
        this.email = email;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getTelefonoResidencia() {
        return telefonoResidencia;
    }

    public void setTelefonoResidencia(long telefonoResidencia) {
        this.telefonoResidencia = telefonoResidencia;
    }

    public long getTelefonocelular() {
        return telefonocelular;
    }

    public void setTelefonocelular(long telefonocelular) {
        this.telefonocelular = telefonocelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @param obj
     * @return 
     */
    public boolean equals(Object obj) {
        if (obj instanceof Cliente) {
            Cliente tmpCliente = (Cliente) obj;
            
            if (this.numeroDocumento == tmpCliente.numeroDocumento
                && this.nombreCompleto.equals(tmpCliente.nombreCompleto)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}

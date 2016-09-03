/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Cliente;
import com.losalpes.servicios.IServicioClientes;
import com.losalpes.servicios.ServicioClientesMock;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author l.valbuena
 */
@ViewScoped
@ManagedBean
public class EliminarClienteBean {
    
    
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa el cliente a eliminar
     */
    private Cliente cliente;
   
    /**
     * lista de clientes de la busquedad
     */
    private List<Cliente> listaCLientes;
    
    /**
     * filtro por numero de documento
     */
    private long numeroDoc;
    
    /**
     * filtro por nombre
     */
    private String nombre;
    
    /**
     * filtro por email
     */
    private String email;

    

    /**
     * Relación con la interfaz que provee los servicios necesarios del clientes.
     */
    private IServicioClientes clienteService;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase principal
     */
    public EliminarClienteBean() {
        cliente = new Cliente();
        clienteService=new ServicioClientesMock();
        listaCLientes = new ArrayList<Cliente>();
        
    }
    
    /**
     * Realiza la consulta de clientes
     */
    public void consultar() {
        listaCLientes = clienteService.consultarClientes(numeroDoc, nombre, email);
    }
    
    /**
     * elimina el cliente seleccionado
     */
    public void eliminar() {
        clienteService.eliminarCliente(cliente);
        listaCLientes.remove(cliente);
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    
    public List<Cliente> getListaCLientes() {
        return listaCLientes;
    }

    public void setListaCLientes(List<Cliente> listaCLientes) {
        this.listaCLientes = listaCLientes;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(long numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}

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
public class ConsultaClienteBean {
    
    
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa un nuevo cliente a ingresar
     */
    private Cliente cliente;
    
    /**
     * lista de clientes de la busquedad
     */
    private List<Cliente> listaCLientes;

    

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
    public ConsultaClienteBean() {
        cliente = new Cliente();
        clienteService=new ServicioClientesMock();
        listaCLientes = new ArrayList<Cliente>();
        
    }
    
    /**
     * 
     */
    public void consultar() {
        
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
    
}

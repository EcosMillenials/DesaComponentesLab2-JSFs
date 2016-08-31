/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ CatalogoBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.beans;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import com.losalpes.servicios.IServicioClientes;
import com.losalpes.servicios.ServicioClientesMock;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;


/**
 * Managed bean encargado del catálogo de muebles en el sistema
 * 
 */
@ViewScoped
@ManagedBean
public class ClientesBean
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa un nuevo cliente a ingresar
     */
    private Cliente cliente;

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
    public ClientesBean()
    {
        cliente = new Cliente();
        clienteService=new ServicioClientesMock();
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    /**
     * Devuelve el objeto cliente
     * @return mueble Objeto cliente
     */
    public Cliente getCliente()
    {
        return cliente;
    }

    /**
     * Modifica el objeto cliente
     * @param cliente Nuevo cliente
     */
    public void setMueble(Cliente cliente)
    {
        this.cliente = cliente;
    }

    /**
     * Devuelve una lista con todos los cliente del sistema
     * @return muebles cliente del sistema
     */
    public List<Cliente> getClientes()
    {

        return clienteService.darClientes();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un nuevo mueble al sistema
     */
    public void agregarCliente()
    {
        clienteService.agregarCliente(cliente);
        cliente=new Cliente();
    }

    /**
     * Elimina la información del mueble
     */
    public void limpiar()
    {
        cliente=new Cliente();
    }

    /**
     * Devuelve los tipos de muebles
     * @return sitems Tipos de documentos en el sistema
     */
    public SelectItem[] getTiposDocumentos()
    {
        TipoDocumento[] tipos=  TipoDocumento.values();
        SelectItem[] sitems = new SelectItem[tipos.length];
        
        for (int i = 0; i < sitems.length; i++)
        {
             sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }

}

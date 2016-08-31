package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import java.util.List;


/**
 * Contrato funcional de los servicios que se le prestan al cliente
 */
public interface IServicioClientes
{

    /**
     * Agrega un cliente al sistema
     * @param cliente Nuevo cliente
     */
    public void agregarCliente(Cliente cliente);

    /**
     * Devuelve todos los clientes del sistema
     * @return clientes Lista de clientes
     */
    public List<Cliente> darClientes();
    
}

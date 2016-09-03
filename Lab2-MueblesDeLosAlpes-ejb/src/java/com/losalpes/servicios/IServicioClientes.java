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
    
    /**
     * Consulta de clientes por los parametros enviados
     * @param numeroDoc
     * @param nombre
     * @param email
     * @return 
     */
    public List<Cliente> consultarClientes(long numeroDoc, String nombre, String email);
    
    /**
     * Elimina el cliente enviado por parametro
     * @param cliente cliente a eliminar
     */
    public void eliminarCliente(Cliente cliente);
    
}

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioCatalogoMock.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;

import java.util.ArrayList;
import java.util.List;


/**
 * Implementacion de los servicios del catalogo de clientes que se le prestan al sistema. [Mock Object]
 * 
 */

public class ServicioClientesMock implements IServicioClientes
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los clientes del sistema
     */
    private ArrayList<Cliente> clientes;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor sin argumentos de la clase
     */
    public ServicioClientesMock()
    {

        //Inicializa el arreglo de los clientes
        clientes=new ArrayList<Cliente>();

        //Agrega los clientes del sistema
        clientes.add(new Cliente(TipoDocumento.CC, 102145545, "Juan Carlos Albarracion", 
                2301245, 316657854, "Cra 45", "Bogota", "Cundinamarca", "Colombia", "Ing Sisitemas", "juan@gmail.com"));
        clientes.add(new Cliente(TipoDocumento.NIT, 215485475, "pedro Calderon", 
                2303295, 3166254, "Cra 200 n 10", "Bogota", "Cundinamarca", "Colombia", "Ing Sisitemas", "pedro@gmail.com"));
        clientes.add(new Cliente(TipoDocumento.CC, 801011, "Leonardo Valbuena", 
                2303295, 3166254, "Cra 31", "Bogota", "Cundinamarca", "Colombia", "Ing Sisitemas", "lelov.calderon@gmail.com"));
        clientes.add(new Cliente(TipoDocumento.CC, 2014585, "Andrea Aldana", 
                2303295, 3166254, "Cra 41", "Bogota", "Cundinamarca", "Colombia", "Ing Sisitemas", "andrea@gmail.com"));
        

    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un clientes al sistema
     * @param clientes Nuevo clientes
     */
    @Override
    public void agregarCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }

    /**
     * Devuelve los clientes del sistema
     * @return clientes Arreglo con todos los muebles del sistema
     */
    @Override
    public List<Cliente> darClientes()
    {
        return clientes;
    }
    
    /**
     * Consulta de clientes por los parametros enviados
     * @param numeroDoc
     * @param nombre
     * @param email
     * @return 
     */
    @Override
    public List<Cliente> consultarClientes(long numeroDoc, String nombre, 
            String email) {
        return clientes;
    }
    
    /**
     * Elimina el cliente enviado por parametro
     * @param cliente cliente a eliminar
     */
    @Override
    public void eliminarCliente(Cliente cliente) {
        
    }

}

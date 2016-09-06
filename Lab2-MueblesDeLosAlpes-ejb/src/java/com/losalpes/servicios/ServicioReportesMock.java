package com.losalpes.servicios;

import com.losalpes.bos.ReporteDiarioDao;
import com.losalpes.bos.TipoMueble;
import com.losalpes.bos.TipoUsuario;
import com.losalpes.bos.Usuario;
import com.losalpes.bos.VentaDiariaDao;
import com.losalpes.excepciones.AutenticacionException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase que se encarga de la generacion de reportes
 * 
 */
public class ServicioReportesMock implements IServicioReportes
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los usuarios del sistema
     */
    private ArrayList<ReporteDiarioDao> ventasDiarias;

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     *
     */
    public ServicioReportesMock()
    {
        //Inicializa el arreglo que contiene las ventas diarias
        ventasDiarias = new ArrayList<ReporteDiarioDao>();

        //Agrega ventas al reporte
        List<VentaDiariaDao> ventas1 = new ArrayList<VentaDiariaDao>();
        ventas1.add(new VentaDiariaDao("cama", 5, 1000, 5000));
        ventas1.add(new VentaDiariaDao("Sofa", 2, 1500000, 3000000));
        ventas1.add(new VentaDiariaDao("mesa", 5, 1000, 5000));        
        ventasDiarias.add(new ReporteDiarioDao(TipoMueble.Interior, ventas1));
        
        List<VentaDiariaDao> ventas2 = new ArrayList<VentaDiariaDao>();
        ventas2.add(new VentaDiariaDao("Comedor", 5, 1000, 5000));
        ventas2.add(new VentaDiariaDao("Almacen", 1, 5000000, 5000000));        
        ventasDiarias.add(new ReporteDiarioDao(TipoMueble.Exterior, ventas2));
        
        

    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Reporte de ventas diarias
     * @param ciudad
     * @param fechaInicio
     * @param fechaFin
     * @return
     */
    @Override
    public List<ReporteDiarioDao> reporteVentaDiaria(String ciudad, Date fechaInicio, 
            Date fechaFin) {
        return ventasDiarias;
    }

    
}

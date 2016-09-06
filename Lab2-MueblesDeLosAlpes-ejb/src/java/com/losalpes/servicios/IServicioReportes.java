package com.losalpes.servicios;


import com.losalpes.bos.ReporteDiarioDao;
import java.util.Date;
import java.util.List;

/**
 * Contrato funcional de los reporrtes del sistema
 * 
 */
public interface IServicioReportes
{

    /**
     * Reporte de ventas diarias
     * @param ciudad
     * @param fechaInicio
     * @param fechaFin
     * @return
     */
    public List<ReporteDiarioDao> reporteVentaDiaria(String ciudad, Date fechaInicio, Date fechaFin);

}

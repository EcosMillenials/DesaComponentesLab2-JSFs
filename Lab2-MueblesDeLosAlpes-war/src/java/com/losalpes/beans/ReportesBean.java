

package com.losalpes.beans;
import com.losalpes.bos.ReporteDiarioDao;
import com.losalpes.servicios.IServicioReportes;
import com.losalpes.servicios.ServicioReportesMock;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;


/**
 * Managed bean encargado de los reportes del sistema
 * 
 */
@ManagedBean
public class ReportesBean
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    
    /**
     * Filtro reporte x ciudad
     */
    private String ciudad;
    
    /**
     * filtro fecha inicio
     */
    private Date fechaInicio;
    
    /**
     * filtro fecha fin
     */
    private Date fechaFin;
    
    /**
     * informacion con el reporte diario de ventas
     */
    private List<ReporteDiarioDao> ventasDiarias;
    
    /**
     * Relación con la interfaz adecuada para el reporte de ventas
     */
    private IServicioReportes reportes;

    

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase
     */
    public ReportesBean() {
        
        reportes = new ServicioReportesMock();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Consulta del reporte diario de ventas
     */
    public void reporteVentasDiarias() {
        
        ventasDiarias = reportes.reporteVentaDiaria(ciudad, fechaInicio, fechaFin);
        
    }

    
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<ReporteDiarioDao> getVentasDiarias() {
        return ventasDiarias;
    }

    public void setVentasDiarias(List<ReporteDiarioDao> ventasDiarias) {
        this.ventasDiarias = ventasDiarias;
    }
    
    
    
    
    
    
    
}

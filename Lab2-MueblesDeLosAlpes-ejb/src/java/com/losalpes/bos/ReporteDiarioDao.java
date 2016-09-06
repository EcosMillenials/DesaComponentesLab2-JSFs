/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

import java.util.List;

/**
 * Dao que representa la infrmacion del reporte de ventas diarias
 * @author leonardovalbuenacalderon
 */
public class ReporteDiarioDao {
    
        
    /**
     * tipo del mueble
     */
    private TipoMueble tipoMueble;
    
    /**
     * lista de las ventas realizadas por el tipo de mueble
     */
    private List<VentaDiariaDao> ventas;

    /**
     * Constructor de la clase
     * @param tipoMueble
     * @param ventas 
     */
    public ReporteDiarioDao(TipoMueble tipoMueble, List<VentaDiariaDao> ventas) {
        this.tipoMueble = tipoMueble;
        this.ventas = ventas;
    }
    
    /**
     * Retorna el total para este tipo de mueble
     * @return 
     */
    public long getTotal() {
        long total = 0;
        for (VentaDiariaDao venta : ventas) {
            total += venta.getCostoTotal();
        }
        return total;
    }
    
    
    

    public TipoMueble getTipoMueble() {
        return tipoMueble;
    }

    public void setTipoMueble(TipoMueble tipoMueble) {
        this.tipoMueble = tipoMueble;
    }

    public List<VentaDiariaDao> getVentas() {
        return ventas;
    }

    public void setVentas(List<VentaDiariaDao> ventas) {
        this.ventas = ventas;
    }
    
    
    
    
    
}

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ CarritoBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.beans;

import com.losalpes.bos.Compra;
import com.losalpes.bos.Mueble;
import com.losalpes.servicios.IServicioCatalogo;
import com.losalpes.servicios.ServicioCatalogoMock;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Modelo que es actualizado desde la página del carro de compras. 
 * 
 * @author jc.albarracin
 */
@ManagedBean
@SessionScoped
public class CarritoBean {
    
    /** Relación con la interfaz adecuada para el catálogo de muebles.  */
    private IServicioCatalogo servicioCatalogo;
    
    /** Lista de muebles disponibles en el catálogo. */
    private List<Mueble> lstMueblesDisponibles; 
    
    /** Lista de muebles seleccionados en el carrito. */
    private List<Mueble> lstMueblesSeleccionados;
    
    /** Mueble seleccionado por el usuario. */
    private Mueble muebleSeleccionado;
    
    /** Compra actual. */
    private Compra compra;
    
    /** Total de la compra. */
    private double valorMueblesSel;
    
    /** Descripción de la compra. */;
    private String descripcionCompra;
    
    /** Autogenerador de referencia del pago. */
    private int referencia;
    
    /**
     * Constructor de la clase.
     */
    public CarritoBean() {
        referencia = 186598699;
        lstMueblesSeleccionados = new ArrayList<>();
        servicioCatalogo = new ServicioCatalogoMock();
        lstMueblesDisponibles = servicioCatalogo.darMuebles();
    }
    
    /**
     * Agrega el mueble seleccionado a la lista de seleccionados para compra. 
     */
    public void agregarACarrito(){
        lstMueblesSeleccionados.add(muebleSeleccionado);
    }
    
    /**
     * Totaliza el valor de los muebles seleccionados y redirige a la pantalla de resumen. 
     */
    public void irAResumenCompra(){
        valorMueblesSel = totalizarCompra();
    }
    
    /**
     * genera la compra y redirecciona a la página de pago.
     */
    public void pagar(){
        referencia++;
        compra = new Compra(referencia, valorMueblesSel, descripcionCompra);        
    }
    
    /**
     * Confirma el pago y disminuyen las unidades existentes. 
     */
    public void confirmaPago(){
        lstMueblesDisponibles.removeAll(lstMueblesSeleccionados);
        lstMueblesSeleccionados.clear();
    }

    /**
     * Recorre la lista de muebles seleccionados y totaliza(suma) su valor. 
     * 
     * @return Precio total de los libros seleccionados. 
     */
    private double totalizarCompra(){
        StringBuilder descripcionAux = new StringBuilder();
        double valorTotal = 0.0;
        
        for (Mueble muebleAux : lstMueblesSeleccionados) {
            valorTotal += muebleAux.getPrecio();
            descripcionAux.append(muebleAux.getReferencia()).append(" ");
        }
        
        descripcionCompra = descripcionAux.toString();
        
        return valorTotal;
    }
    
    
    public List<Mueble> getLstMueblesDisponibles() {
        return lstMueblesDisponibles;
    }

    public void setLstMueblesDisponibles(List<Mueble> lstMueblesDisponibles) {
        this.lstMueblesDisponibles = lstMueblesDisponibles;
    }

    public List<Mueble> getLstMueblesSeleccionados() {
        return lstMueblesSeleccionados;
    }

    public void setLstMueblesSeleccionados(List<Mueble> lstMueblesSeleccionados) {
        this.lstMueblesSeleccionados = lstMueblesSeleccionados;
    }

    public Mueble getMuebleSeleccionado() {
        return muebleSeleccionado;
    }

    public void setMuebleSeleccionado(Mueble muebleSeleccionado) {
        this.muebleSeleccionado = muebleSeleccionado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public double getValorMueblesSel() {
        return valorMueblesSel;
    }

    public void setValorMueblesSel(double valorMueblesSel) {
        this.valorMueblesSel = valorMueblesSel;
    }

    public String getDescripcionCompra() {
        return descripcionCompra;
    }

    public void setDescripcionCompra(String descripcionCompra) {
        this.descripcionCompra = descripcionCompra;
    }
    
    
}

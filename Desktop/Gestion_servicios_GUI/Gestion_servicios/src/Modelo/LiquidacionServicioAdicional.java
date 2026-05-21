/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Juan
 */
public class LiquidacionServicioAdicional {
    private String numeroOrden; //pk y fk, se quita el set
    private String servicioLiquidacion;
    private String referencia;
    private int cantidad;
    private float valor;
    
    //setter y getter
    
    public String getNumeroOrden() {
        return numeroOrden;
    }

    public String getServicioLiquidacion() {
        return servicioLiquidacion;
    }

    public void setServicioLiquidacion(String servicioLiquidacion) {
        this.servicioLiquidacion = servicioLiquidacion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    //constructor

    public LiquidacionServicioAdicional(String numeroOrden, String servicioLiquidacion, String referencia, int cantidad, float valor) {
        this.numeroOrden = numeroOrden;
        this.servicioLiquidacion = servicioLiquidacion;
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.valor = valor;
    }
    
    //to string

    @Override
    public String toString() {
        return "LiquidacionServicioAdicional{" + "numeroOrden=" + numeroOrden + ", servicioLiquidacion=" + servicioLiquidacion + ", referencia=" + referencia + ", cantidad=" + cantidad + ", valor=" + valor + '}';
    }
    
    
    
    
}//fin clase LiquidacionServicioAdicional

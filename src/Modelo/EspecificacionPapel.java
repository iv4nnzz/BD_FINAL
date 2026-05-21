/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Juan
 */
public class EspecificacionPapel {
    private String numeroOrden; //pk y fk, no se coloca el set
    private String tipoPapel; //pk, no se coloca el set
    private boolean traePapel;
    private int cantidadCarta;
    private int cantidadOficio;
    private int cantidadTotal;
    
    //setter y getter

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public String getTipoPapel() {
        return tipoPapel;
    }

    public boolean isTraePapel() {
        return traePapel;
    }

    public void setTraePapel(boolean traePapel) {
        this.traePapel = traePapel;
    }

    public int getCantidadCarta() {
        return cantidadCarta;
    }

    public void setCantidadCarta(int cantidadCarta) {
        this.cantidadCarta = cantidadCarta;
    }

    public int getCantidadOficio() {
        return cantidadOficio;
    }

    public void setCantidadOficio(int cantidadOficio) {
        this.cantidadOficio = cantidadOficio;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }
    
    //constructor

    public EspecificacionPapel(String numeroOrden, String tipoPapel, boolean traePapel, int cantidadCarta, int cantidadOficio, int cantidadTotal) {
        this.numeroOrden = numeroOrden;
        this.tipoPapel = tipoPapel;
        this.traePapel = traePapel;
        this.cantidadCarta = cantidadCarta;
        this.cantidadOficio = cantidadOficio;
        this.cantidadTotal = cantidadTotal;
    }
    
    //to string

    @Override
    public String toString() {
        return "EspecificacionPapel{" + "numeroOrden=" + numeroOrden + ", tipoPapel=" + tipoPapel + ", traePapel=" + traePapel + ", cantidadCarta=" + cantidadCarta + ", cantidadOficio=" + cantidadOficio + ", cantidadTotal=" + cantidadTotal + '}';
    }
    
    
}//fin clase EspecificacionPapel

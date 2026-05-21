/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Juan
 */
public class Solicitud {
    private String numeroOrden; //fk y pk, se quita el set
    private int reproducciones;
    private String original;
    private String firmaAutorizada;
    private String tipoServicio;
    
    //setter y getter

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getFirmaAutorizada() {
        return firmaAutorizada;
    }

    public void setFirmaAutorizada(String firmaAutorizada) {
        this.firmaAutorizada = firmaAutorizada;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    //constructor

    public Solicitud(String numeroOrden, int reproducciones, String original, String firmaAutorizada, String tipoServicio) {
        this.numeroOrden = numeroOrden;
        this.reproducciones = reproducciones;
        this.original = original;
        this.firmaAutorizada = firmaAutorizada;
        this.tipoServicio = tipoServicio;
    }
    
    
   //to string

    @Override
    public String toString() {
        return "Solicitud{" + "numeroOrden=" + numeroOrden + ", reproducciones=" + reproducciones + ", original=" + original + ", firmaAutorizada=" + firmaAutorizada + ", tipoServicio=" + tipoServicio + '}';
    }
    
}// fin clase solicitud

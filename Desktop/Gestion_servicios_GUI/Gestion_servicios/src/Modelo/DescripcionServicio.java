/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Juan
 */
public class DescripcionServicio {
    private String numeroOrden; //pk y fk, se quita el set
    private String servicioselec;
    
    //setter y getter

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public String getServicioselec() {
        return servicioselec;
    }

    public void setServicioselec(String servicioselec) {
        this.servicioselec = servicioselec;
    }
    
    //constructor

    public DescripcionServicio(String numeroOrden, String servicioselec) {
        this.numeroOrden = numeroOrden;
        this.servicioselec = servicioselec;
    }
    
    //to string

    @Override
    public String toString() {
        return "DescripcionServicio{" + "numeroOrden=" + numeroOrden + ", servicioselec=" + servicioselec + '}';
    }
    
}//fin clase DescripcionServicio

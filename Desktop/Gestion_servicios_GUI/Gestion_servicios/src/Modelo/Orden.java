/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author jpdom
 */
import java.time.LocalDate;
public class Orden {
    private String numero; //pk,no debe de tener set
    private LocalDate fechaSolicitud;
    private String observaciones;
    private String tipoCedula;
    private int cedulaSolicitante;//fk
    
    //getter y setter

    public String getNumero() {
        return numero;
    }


    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTipoCedula() {
        return tipoCedula;
    }

    public void setTipoCedula(String tipoCedula) {
        this.tipoCedula = tipoCedula;
    }

    public int getCedulaSolicitante() {
        return cedulaSolicitante;
    }

    public void setCedulaSolicitante(int cedulaSolicitante) {
        this.cedulaSolicitante = cedulaSolicitante;
    }
    

    //constructor

    public Orden(String numero, LocalDate fechaSolicitud, String observaciones, String tipoCedula, int cedulaSolicitante) {
        this.numero = numero;
        this.fechaSolicitud = fechaSolicitud;
        this.observaciones = observaciones;
        this.tipoCedula = tipoCedula;
        this.cedulaSolicitante = cedulaSolicitante;
    }

    //to tring

    @Override
    public String toString() {
        return "Orden{" + "numero=" + numero + ", fechaSolicitud=" + fechaSolicitud + ", observaciones=" + observaciones + ", tipoCedula=" + tipoCedula + ", cedulaSolicitante=" + cedulaSolicitante + '}';
    }
    
    

    
    
}//fin clase orden

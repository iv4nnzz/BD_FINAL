/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Juan
 */
public class Liquidacion {
    private String numeroOrden; //pk y fk, no debe de tener set
    private String maquina;
    private LocalTime hora;
    private String ficha;
    private String local;
    private String auxiliar;
    private Date fechaElaboracion;

    //setter y getter
    
    public String getNumeroOrden() {
        return numeroOrden;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    
    //constructor

    public Liquidacion(String numeroOrden, String maquina, LocalTime hora, String ficha, String local, String auxiliar, Date fechaElaboracion) {
        this.numeroOrden = numeroOrden;
        this.maquina = maquina;
        this.hora = hora;
        this.ficha = ficha;
        this.local = local;
        this.auxiliar = auxiliar;
        this.fechaElaboracion = fechaElaboracion;
    }

    //to string

    @Override
    public String toString() {
        return "Liquidacion{" + "numeroOrden=" + numeroOrden + ", maquina=" + maquina + ", hora=" + hora + ", ficha=" + ficha + ", local=" + local + ", auxiliar=" + auxiliar + ", fechaElaboracion=" + fechaElaboracion + '}';
    }

    

    
}//fin clase liquidacion

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Juan
 */
public class LiquidacionPapelReproduccion {
    private String numeroOrden; //pk y fk, se le quitan el set
    private String tipoPapel; //pk, se le quitan el set
    private int nroUnidades;
    private int hojasMalasOperario;
    private int hojasMalasMaquina;
    private int hojasNoContabMaquina;
    private int hojaEnBlanco;
    private float valor;
    private int nroReproducciones;
    
    //setter y getter

    public String getNumeroOrden() {
        return numeroOrden;
    }


    public String getTipoPapel() {
        return tipoPapel;
    }


    public int getNroUnidades() {
        return nroUnidades;
    }

    public void setNroUnidades(int nroUnidades) {
        this.nroUnidades = nroUnidades;
    }

    public int getHojasMalasOperario() {
        return hojasMalasOperario;
    }

    public void setHojasMalasOperario(int hojasMalasOperario) {
        this.hojasMalasOperario = hojasMalasOperario;
    }

    public int getHojasMalasMaquina() {
        return hojasMalasMaquina;
    }

    public void setHojasMalasMaquina(int hojasMalasMaquina) {
        this.hojasMalasMaquina = hojasMalasMaquina;
    }

    public int getHojasNoContabMaquina() {
        return hojasNoContabMaquina;
    }

    public void setHojasNoContabMaquina(int hojasNoContabMaquina) {
        this.hojasNoContabMaquina = hojasNoContabMaquina;
    }

    public int getHojaEnBlanco() {
        return hojaEnBlanco;
    }

    public void setHojaEnBlanco(int hojaEnBlanco) {
        this.hojaEnBlanco = hojaEnBlanco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getNroReproducciones() {
        return nroReproducciones;
    }

    public void setNroReproducciones(int nroReproducciones) {
        this.nroReproducciones = nroReproducciones;
    }
    
    
    //constructor

    public LiquidacionPapelReproduccion(String numeroOrden, String tipoPapel, int nroUnidades, int hojasMalasOperario, int hojasMalasMaquina, int hojasNoContabMaquina, int hojaEnBlanco, float valor, int nroReproducciones) {
        this.numeroOrden = numeroOrden;
        this.tipoPapel = tipoPapel;
        this.nroUnidades = nroUnidades;
        this.hojasMalasOperario = hojasMalasOperario;
        this.hojasMalasMaquina = hojasMalasMaquina;
        this.hojasNoContabMaquina = hojasNoContabMaquina;
        this.hojaEnBlanco = hojaEnBlanco;
        this.valor = valor;
        this.nroReproducciones = nroReproducciones;
    }
    
    //to string

    @Override
    public String toString() {
        return "LiquidacionPapelReproduccion{" + "numeroOrden=" + numeroOrden + ", tipoPapel=" + tipoPapel + ", nroUnidades=" + nroUnidades + ", hojasMalasOperario=" + hojasMalasOperario + ", hojasMalasMaquina=" + hojasMalasMaquina + ", hojasNoContabMaquina=" + hojasNoContabMaquina + ", hojaEnBlanco=" + hojaEnBlanco + ", valor=" + valor + ", nroReproducciones=" + nroReproducciones + '}';
    }
    
}

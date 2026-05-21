/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Juan
 */
public class Trabajo {
    private String numeroOrden; //fk y pk, no se coloca set
    private String numero; //pk, no se coloca set
    private String titulo;
    
    //getter y setter

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    //constructor

    public Trabajo(String numeroOrden, String numero, String titulo) {
        this.numeroOrden = numeroOrden;
        this.numero = numero;
        this.titulo = titulo;
    }
    
    //to string

    @Override
    public String toString() {
        return "Trabajo{" + "numeroOrden=" + numeroOrden + ", numero=" + numero + ", titulo=" + titulo + '}';
    }
    
    
}// fin clase Trabajo

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jpdom
 */
public class Dependencia {
    private String centroCosto; //pk, no debe tener set
    private String nombre;

//getter y setter

    public String getCentroCosto() {
        return centroCosto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //constructor

    public Dependencia(String centroCosto, String nombre) {
        this.centroCosto = centroCosto;
        this.nombre = nombre;
    }
    
    
    //to string
    @Override
    public String toString() {
        return "Dependencia{" + "centro_costo=" + centroCosto + ", nombre=" + nombre + '}';
    }

    
}

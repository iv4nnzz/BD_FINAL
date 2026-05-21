/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jpdom
 */
public class Solicitante {
    private int cedula; //pk, no se coloca set
    private String extension;
    private String nombreApellido;
    private String cargo;
    private String centroCostoDependencia; //fk

    //getter y setter

    public int getCedula() {
        return cedula;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCentroCostoDependencia() {
        return centroCostoDependencia;
    }

    public void setCentroCostoDependencia(String centroCostoDependencia) {
        this.centroCostoDependencia = centroCostoDependencia;
    }
    
    //constructor

    public Solicitante(int cedula, String extension, String nombreApellido, String cargo, String centroCostoDependencia) {
        this.cedula = cedula;
        this.extension = extension;
        this.nombreApellido = nombreApellido;
        this.cargo = cargo;
        this.centroCostoDependencia = centroCostoDependencia;
    }
    
    
    //to string

    @Override
    public String toString() {
        return "Solicitante{" + "cedula=" + cedula + ", extension=" + extension + ", nombreApellido=" + nombreApellido + ", cargo=" + cargo + ", centroCostoDependencia=" + centroCostoDependencia + '}';
    }
    
    
}//fin clase solicitante

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author josevivas
 */
public class Veterinario extends Persona {

     private String run;
    private String nombres;
    private String direccion;
    private String especialidad;

    @Override
    public void setRun(String run) {
        this.run = run;
    }

    @Override
    public String getRun() {
        return this.run;
    }

    @Override
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String getNombres() {
        return this.nombres;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad() {
        return this.especialidad;
    }

    @Override
    public String toString() {
        return this.run + ", " +
                this.nombres + ", " +
                this.especialidad;
    }
    
    
    
}

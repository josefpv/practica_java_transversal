/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author josevivas
 */
public abstract class Persona {
    
    public abstract void setRun(String run);
    public abstract String getRun();
    
    public abstract void setNombres(String nombres);
    public abstract String getNombres();
    
    public abstract void setDireccion(String direccion);
    public abstract String getDireccion();
    
    @Override
    public abstract String toString();
    
    
}

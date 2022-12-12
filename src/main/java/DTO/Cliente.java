/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author josevivas
 */
public class Cliente extends Persona{
    
    private String run;
    private String nombres;
    private String direccion;
    private boolean esEmpresa;

    public Cliente() {
        this.run = "";
        this.nombres = "";
        this.direccion = "";
        this.esEmpresa = false;
    }

    public Cliente(String run, String nombres, String direccion, boolean esEmpresa) {
        this.run = run;
        this.nombres = nombres;
        this.direccion = direccion;
        this.esEmpresa = esEmpresa;
    }

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
    
    public void setEsEmpresa(boolean esEmpresa) {
        this.esEmpresa = esEmpresa;
    }
    
    public boolean getEsEmpresa(){
        return this.esEmpresa;
    }
    
    @Override
    public String toString(){
        return this.run + ", " + this.nombres;
    }
    
    
}

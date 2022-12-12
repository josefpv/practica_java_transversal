/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author josevivas
 */
public interface IListClientes<Persona> {
    
    public abstract void Guardar(Persona persona);
    public abstract String Listar();
    public abstract ArrayList<Persona> ListarCombo();
    public abstract String Listar(int posicion);
    public abstract Persona Buscar(int posicion);
  
}

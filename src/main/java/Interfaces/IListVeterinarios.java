/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author josevivas
 */
public interface IListVeterinarios<Persona> {
    
    public abstract void Guardar(Persona veterinario);
    public abstract String Listar();
    public abstract String Listar(int posicion);
    public abstract void Eliminar(int posicion);
    
}

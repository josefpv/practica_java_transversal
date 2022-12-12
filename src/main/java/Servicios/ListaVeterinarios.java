/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import DTO.Persona;
import Interfaces.IListVeterinarios;
import java.util.ArrayList;

/**
 *
 * @author josevivas
 */
public class ListaVeterinarios implements IListVeterinarios {
    
    private ArrayList<Persona> lista;

    public ListaVeterinarios(ArrayList<Persona> lista) {
        this.lista = lista;
    }

    public ListaVeterinarios() {
        this.lista = new ArrayList<Persona>();
    }

    @Override
    public void Guardar(Object veterinario) {
        this.lista.add((Persona) veterinario);
    }

    @Override
    public String Listar() {
        String veterinarios = "";
        for (Persona persona : this.lista) {
            veterinarios = veterinarios + persona.toString() + " \n";
        }
        
        return veterinarios;
    }

    @Override
    public String Listar(int posicion) {
        Persona veterinario = this.lista.get(posicion);
        return veterinario.toString();
    }

    @Override
    public void Eliminar(int posicion) {
        this.lista.remove(posicion);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import DTO.Persona;
import java.util.ArrayList;
import Interfaces.IListClientes;

/**
 *
 * @author josevivas
 */
public class ListaClientes implements IListClientes {
    
    private ArrayList<Persona> lista;

    public ListaClientes(ArrayList<Persona> lista) {
        this.lista = lista;
    }

    public ListaClientes() {
        this.lista = new ArrayList<Persona>();
    }
    
    @Override
    public void Guardar(Object persona) {
        this.lista.add((Persona) persona);
    }

    @Override
    public String Listar() {
        
        String personaTexto = "";
        
        for(Persona persona : this.lista) {
            personaTexto = personaTexto +  persona.toString() + " \n";
        }
        
        return personaTexto;
        
    }
    
    @Override
    public ArrayList<Persona> ListarCombo(){
        return this.lista;
    }

    @Override
    public String Listar(int posicion) {
        Persona persona  = this.lista.get(posicion);
        return persona.toString();
    }

    @Override
    public Object Buscar(int posicion) {
        Persona persona  = this.lista.get(posicion);
        return persona.toString();
    }
    
    
}

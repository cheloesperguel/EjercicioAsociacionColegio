/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioAsociacion;

import java.util.ArrayList;

/**
 *
 * @author Marcelo Esperguel
 */
public class Profesor {
    
    private String nombre;
    private int sueldo;
    private ArrayList<Asignatura> asignaturas;

    public Profesor(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public String toString(){
        
        return "Nombre: "+this.nombre+" Sueldo: "+this.sueldo;
    }
    
    
}

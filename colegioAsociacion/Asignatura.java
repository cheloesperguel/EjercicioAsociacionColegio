/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioAsociacion;

/**
 *
 * @author Marcelo Esperguel
 */
public class Asignatura {
    
    private String nombre;
    private int capacidad;
    private Alumno[] alumnos;
    private Profesor profesor;
    
    public Asignatura(String nombre, int capacidad, Profesor profesor) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.profesor = profesor;
        
        this.profesor.getAsignaturas().add(this);
        
        alumnos = new Alumno[capacidad];
    }
    
    public void agregarAlumno(Alumno a){
        
        for( int i=0; i<alumnos.length; i++){
            
            if(alumnos[i]==null){
                alumnos[i]=a;
                return;
            }                
        }
        
        System.out.println("Error, no hay más cupos");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {

        String cadena="";
        
        cadena+="==============================\n";
        cadena+="       "+this.nombre+"\n";
        cadena+="==============================\n";
        cadena+="Profesor: \n";
        cadena+=this.profesor.toString()+"\n\n";
        cadena+="Lista Alumnos: \n";
        
        for(int i=0; i<alumnos.length;i++){
            
            if(alumnos[i]!=null){
             
                cadena+=this.alumnos[i].toString()+"\n";   
            }
            
        }
        

        return cadena;
    }
    
    
    
    
    
     
    
}

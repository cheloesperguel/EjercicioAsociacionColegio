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
public class Colegio {
    
    private String nombre;
    
    
    private ArrayList<Alumno> alumnos;
    private Asignatura[] asignaturas;
    private ArrayList<Profesor> profesores;
    
    public Colegio(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
        asignaturas = new Asignatura[10];
        profesores = new ArrayList<>();
        
    }
    
    public void inscribirAsignatura(Asignatura a){
        
        for(int i =0; i< asignaturas.length; i++){
            
            if(asignaturas[i]==null){
                asignaturas[i]=a;
                
                return;
            }
            
        }
        
        System.out.println("Error no se pueden inscribir más asignaturas");
       
        
    }
    
    public void matricularAlumno(Alumno a){
        
        alumnos.add(a);
    }
    
    public void contratarProfesor(Profesor p){
        profesores.add(p);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String toString(){
        
        String cadena="    COLEGIO "+this.nombre+"\n";
        cadena+="====================================\n";
        for(int i=0; i<asignaturas.length;i++){
            if(asignaturas[i]!=null){
                cadena+=asignaturas[i].toString();
            }
        }
        
        return cadena;
    }
    
}

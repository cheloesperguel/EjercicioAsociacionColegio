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
public class Alumno {
    
    private String nombre;
    private String matricula;
    
    public Alumno(String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
    }


    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    @Override
    public String toString() {

        return "Nombre: "+ this.nombre +"\nMatricula: "+ this.matricula;
    }
    
    

     
    
    
    
    
}

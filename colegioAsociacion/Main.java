/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioAsociacion;

import java.util.Scanner;
/**
 *
 * @author Marcelo Esperguel
 */
public class Main {

     static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Colegio c = new Colegio("Camilo Henriquez");
        Profesor p = new Profesor("Marcelo",100000);
        Profesor p2 = new Profesor("Oscar",10000232);
        Asignatura a = new Asignatura("Lenguaje",2,p);
        Asignatura a2 = new Asignatura("Matematicas",3,p);
        c.inscribirAsignatura(a);
        c.inscribirAsignatura(a2);
        
        Alumno alumno = new Alumno("Juan","237621376");
        Alumno al2 = new Alumno("Maria","t2e6721");
        
        a.agregarAlumno(alumno);
        a.agregarAlumno(al2);
        
        a2.agregarAlumno(alumno);
        a2.agregarAlumno(al2);
                
        
        System.out.println(c);
        
        
    }
    
}

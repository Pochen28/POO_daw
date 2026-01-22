package org.example;

public class EstudianteApp {
    static void main(){
        Estudiante ivan = new Estudiante("Iván", "1DAW", "jfrbbbjbb");
        Estudiante alex = new Estudiante("Alejandro");

        System.out.println(ivan.toString());
        System.out.println(alex.toString());
        System.out.println(alex.getNia());

        System.out.println("Estudiantes creados: " );
    }
}

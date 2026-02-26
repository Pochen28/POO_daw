package org.example.InicioPOO;

public class App {
    public static void main(String[] args) {

        Persona persona = new Persona("Jose", "Riera", 15);

        System.out.println(persona.nombreCompleto());

        if (persona.mayorEdad()){
            System.out.println("Es mayor de edad.");
        }else {
            System.out.println("Es menor de edad.");
        }

        System.out.println(persona.nombreCompleto("Señor"));
        System.out.println(persona.nombreCompleto());

        Persona persona2 = new Persona("Manuel");

        System.out.println(persona2.nombreCompleto("Señor"));
        System.out.println(persona2.nombreCompleto());



    }
}

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

    }
}

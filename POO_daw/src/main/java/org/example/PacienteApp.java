package org.example;

import java.util.Scanner;

public class PacienteApp {
    static void main() {


    }

    public static void consultar_paciente (){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Intuduce tu nombre y apellidos: ");
        String nombre_paciente = teclado.next();

        System.out.print("Introduce tu edad: ");
        int edad_paciente = teclado.nextInt();

        System.out.print("Introduce tu sexo: ");
        String sexo_paciente = teclado.next();

        System.out.print("Introduce tu peso: ");
        double peso_paciente = teclado.nextInt();

        System.out.print("Introduce tu altura: ");
        double altura_paciente = teclado.nextInt();






    }
}

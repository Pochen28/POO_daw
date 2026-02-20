package org.example.pruebasEnum;

import java.util.Random;
import java.util.Scanner;

public class NivelesApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("¿Qué difucultad vas a querer?");
        String diicultad = teclado.next();

        int puntuacion = aleatorio.nextInt(4000) +1;

    }

}

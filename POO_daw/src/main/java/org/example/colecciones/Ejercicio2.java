package org.example.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Map<Character, Integer>mapita = new HashMap<>();


        String frase = teclado.nextLine().toLowerCase();

        for (Character palabra : frase.toCharArray()){
            mapita.put(palabra, mapita.getOrDefault(palabra, 0)+1);


        }
    }
}

package org.example.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una frase.");
        String frase = teclado.nextLine().toLowerCase();

        HashMap<String, Integer>mapa = new HashMap<>();

        for (String palabra : frase.split(" ")){

            if (mapa.containsKey(palabra)){
                mapa.put(palabra, mapa.get(palabra)+1);
            }else {
                mapa.put(palabra, 1);
            }

        }

        for (Map.Entry<String, Integer>mapa2 : mapa.entrySet()){
            System.out.println(mapa2.getKey() + " : " + mapa2.getValue());
        }
    }
}

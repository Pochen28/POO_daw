package org.example.colecciones;

import java.util.*;

public class CollectionClase {
    public static void main(String[] args) {
        String url = "";

        Scanner teclado = new Scanner(System.in);

        String [] peces = {"boquerones", "sardinas", "anchoas", "tiburon", "merluza", "merluza", "anguila"};

        HashSet<String>desordenada = new HashSet<>(Arrays.asList(peces));
        LinkedList<String>respeta_orden = new LinkedList<>(Arrays.asList(peces));
        TreeSet<String>ordenado = new TreeSet<>(Arrays.asList(peces));

        System.out.println(desordenada);
        System.out.println(respeta_orden);
        System.out.println(ordenado);

        System.out.println("Escribe una frase");
        String frase = teclado.next().toLowerCase();

        String [] nuevo = frase.split("");

        HashSet<String>fraseSinDuplicados = new HashSet<>(Arrays.asList(nuevo));

        System.out.println("La frase que has escrito es " + frase);
        System.out.println("La frase sin duplicados es " + fraseSinDuplicados);


        LinkedHashSet<String>listaurl = new LinkedHashSet<>();
        while (true){
            System.out.print("Escribe una URL visitada o 'salir' para continuar: ");
            url = teclado.next();
            if (url.toLowerCase().equals("salir")){
                break;
            }
            listaurl.add(url);

        }
        int contador = 1;
        System.out.println("Historial de navegación: ");
        for (String frase2 : listaurl){
            System.out.println(contador + frase2);

        }





    }
}

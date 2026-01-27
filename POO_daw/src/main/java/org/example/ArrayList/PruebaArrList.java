package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PruebaArrList {
    static void main() {
        ArrayList<String> listaPartesCoche = new ArrayList<>();
        System.out.println("Elementos insertados: " + listaPartesCoche.size());

        listaPartesCoche.add("Puerta");
        listaPartesCoche.add("Polea");
        listaPartesCoche.add("Piston");
        listaPartesCoche.add("Alternador");

        System.out.println("Eñementos insertados. " + listaPartesCoche.size());

        listaPartesCoche.add(3, "tubo escape");

        System.out.println(listaPartesCoche);

        listaPartesCoche.remove("puerta");

        System.out.println(listaPartesCoche);

        listaPartesCoche.remove(1);

        System.out.println(listaPartesCoche);

        System.out.println("Posición de alternador en la lista: " + listaPartesCoche.indexOf("alternador"));
        System.out.println("Posición de puerta en la lista: " + listaPartesCoche.indexOf("puerta"));

        System.out.println("En la posicion 2 está: " + listaPartesCoche.get(2));

        for (String partes : listaPartesCoche){
            System.out.println("Parte: " + partes);
        }

        for (int i = 0; i < listaPartesCoche.size(); i++) {
            System.out.println("Parte " + (i+1) + ": " + listaPartesCoche.get(i));
        }

        listaPartesCoche.set(0,"carter");

        System.out.println(listaPartesCoche);



        Object no_clonar = listaPartesCoche.clone();

        ArrayList<String> copia = new ArrayList<>(listaPartesCoche);

        System.out.println("La lista contiene puerta?: " + listaPartesCoche.contains("contains"));
        System.out.println("La lista contiene alternador?: " + listaPartesCoche.contains("alternador"));

        System.out.println("Está vacía? " + listaPartesCoche.isEmpty());


        listaPartesCoche.clear();


        System.out.println("Está vacía? " + listaPartesCoche.isEmpty());

        listaPartesCoche.addAll(Arrays.asList("rueda", "freno", "radiador"));

        System.out.println(listaPartesCoche);

    }
}

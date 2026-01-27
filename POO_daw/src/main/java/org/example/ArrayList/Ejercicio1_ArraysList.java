package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1_ArraysList {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        ArrayList<String> listaCompra = new ArrayList<>();

        System.out.println("la lista de la compra está vacía?: " + listaCompra.isEmpty());

        listaCompra.add("pistachos");

        System.out.println("la lista de la compra está vacía?: " + listaCompra.isEmpty());

        listaCompra.addAll(Arrays.asList("leche", "pollo", "almendras", "huevos", "pasta"));

        System.out.println(listaCompra.get(3));

        listaCompra.set(2, "queso");

        System.out.println("Contiene leche: " + listaCompra.contains("leche"));

        String producto = teclado.next();

        if (listaCompra.contains(producto)){
            System.out.println("Ya está en la lista.");
        }else {

            listaCompra.add(producto);
        }

        System.out.println(listaCompra.size());

        ArrayList<String> clonada = new ArrayList<>(listaCompra);

        clonada.clear();

        System.out.println("La lista clonada está vacía?: " + clonada.isEmpty());

        boolean iguales = listaCompra.equals(clonada);

        System.out.println(iguales);

        clonada.addAll(Arrays.asList("sepia", "mejillones"));

        ArrayList<String> faltantes = new ArrayList<>(clonada);

        faltantes.removeAll(clonada);

        System.out.println("Faltan los siguientes elementos. " + faltantes);

        ArrayList<Integer> num_aleatorios = new ArrayList<>();

        for (int i = 0; i < listaCompra.size(); i++) {
            num_aleatorios.add(aleatorio.nextInt(0, 11));


        }

        System.out.println(listaCompra);
        System.out.print(num_aleatorios);


    }
}

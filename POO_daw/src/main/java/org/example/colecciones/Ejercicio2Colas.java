package org.example.colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio2Colas {
    public static void main(String[] args) {

        Queue<String>colaImpresion= new LinkedList<>();

        colaImpresion.offer("Imprimir documento 1");
        colaImpresion.offer("Imprimir documento 2");
        colaImpresion.offer("Imprimir documento 3");
        colaImpresion.offer("Imprimir documento 4");
        colaImpresion.offer("Imprimir documento 5");

        System.out.println("Estado inicial de la cola de impresión" + colaImpresion);

        while (!colaImpresion.isEmpty()){
            System.out.println("Procesando: " + colaImpresion.poll());
            System.out.println("Estado de la cola después de procesar el trabajo: " + colaImpresion);
        }

    }
}

package org.example.iteradores;


import java.util.ArrayList;
import java.util.ListIterator;

import static org.example.iteradores.EjercicioOlimpiadas.teclado;

// Asume fichero llamado solution.java
public class TecladoMaria {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            String palabra = teclado.nextLine();

            ArrayList<Character> listaCaracteres = new ArrayList<>();
            ListIterator<Character> it = listaCaracteres.listIterator();
            for (Character character : palabra.toCharArray()){
                switch (character) {
                    case '<':
                        if (it.hasPrevious()) {
                            it.previous();
                        }
                        break;
                    case '>':
                        if (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '#':
                        if (it.hasPrevious()){
                            it.previous();
                            it.remove();
                        }
                        break;
                }

            }
            for (Character caracteres : listaCaracteres){
                System.out.println(caracteres);
            }
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}
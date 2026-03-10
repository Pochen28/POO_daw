package org.example.colecciones;// Asume fichero llamado solution.java


import java.util.HashMap;
import java.util.Map;

public class VaDeModas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int numero = in.nextInt();
        if (numero == 0) {
            return false;
        }else {
            // CÓDIGO PRINCIPAL AQUÍ
            Map<Integer, Integer>mapita = new HashMap<>();

            for (int i = 0; i < numero; i++) {

            }

            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

} // class solution
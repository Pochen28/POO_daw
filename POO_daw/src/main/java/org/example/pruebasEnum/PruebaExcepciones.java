package org.example.pruebasEnum;

public class PruebaExcepciones {
    public static void main(String[] args) throws MiExcepcion {
        int cuenta = -5;

        if (cuenta <= 5){
            throw new MiExcepcion();
        }
    }
}

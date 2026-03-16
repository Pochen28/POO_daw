package org.example.iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class EjercicioOlimpiadas {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {    
        String palabra = teclado.nextLine();

        ArrayList<Character>listaCaracteres = new ArrayList<>();
        ListIterator<Character>it = listaCaracteres.listIterator();
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
    }
}

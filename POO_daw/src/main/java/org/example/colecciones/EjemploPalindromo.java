package org.example.colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class EjemploPalindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Deque<Character> cola = new LinkedList<>();


        System.out.println("Introduce una palabra");
        String palabra = "reconocer".toUpperCase();

        System.out.println(palabra);
        for (int i = 0; i < palabra.length(); i++) {
            cola.offer(palabra.charAt(i));

        }

        while (!cola.isEmpty()){
            if (cola.peekFirst() == cola.peekLast()){
                cola.pollFirst();
                cola.pollLast();
            }else {
                System.out.println("No es palindromo");
                return;
            }
        }





    }
}

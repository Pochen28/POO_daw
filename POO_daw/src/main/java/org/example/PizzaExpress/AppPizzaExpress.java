package org.example.PizzaExpress;

import java.util.Scanner;

public class AppPizzaExpress {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Hola empleado nuevo, dime tu nombre");
        String nombre = teclado.next();

        Empleado joselu = new Empleado("20", nombre );

    }
}

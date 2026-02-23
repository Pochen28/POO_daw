package org.example.pruebasEnum;

import java.util.Scanner;

public class CuentaBancariaApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria(1200);

        System.out.println("=== Cajero Automático ===");
        System.out.println("  [1]. Consultar saldo\n  [2]. Ingresar dinero\n  [3]. Retirar dinero\n  [X]. Salir");
        System.out.print("Seleccione una opción: ");

        String opcion = teclado.next();
        switch (opcion){
            case "1":


        }
    }
}

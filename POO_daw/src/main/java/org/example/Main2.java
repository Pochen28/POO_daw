package org.example;

import java.util.Scanner;

public class Main2 {

    static int z = 10;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("mete un numero");
        int n = s.nextInt();

        cosa c = new cosa(n, z);

        int r = c.h();

        if (r > 50) {
            System.out.println("grande");
        } else {
            System.out.println("pequeño");
        }

        System.out.println(r);

        for (int i = 0; i < 3; i++) {
            System.out.println(c.h());
        }

        s.close();
    }
}

class cosa {

    int a;
    int b;

    public cosa(int x, int y) {
        a = x;
        b = y;
    }

    public int h() {
        int r = 0;
        for (int i = 0; i < a; i++) {
            r = r + b;
        }
        return r;
    }

    public void p() {
        System.out.println(a + " " + b);
    }
}

//No se especifican lo que son ls variables en su nombre.
//El código se repite, ya que en la salida muestra varias veces el mismo número.
//Se crean variables las cuales nuca se usan

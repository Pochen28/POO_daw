package org.example.InicioPOO;

public class prueba {

    static int a = 10;

    public static int suma() {
        a = a + 2;
        return a;
    }

    public static void main(String[] args) {
        
        suma();

        System.out.println(a);

    }
}

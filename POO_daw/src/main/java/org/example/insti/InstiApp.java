
package org.example.insti;

public class InstiApp {
    static void main() {

        Instituto figueras = new Instituto();
        Instituto lloixa = new Instituto("Lloixa", "Alicante");
        lloixa.setPoblacion(null);
        System.out.println(lloixa.getPoblacion());
    }
}

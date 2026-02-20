package org.example.pruebasEnum;

public class MiExcepcion extends Exception {
    public MiExcepcion() {

        super("El saldo tiene que ser positivo.");
    }
}

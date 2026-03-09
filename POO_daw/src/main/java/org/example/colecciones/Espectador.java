package org.example.colecciones;

import lombok.AllArgsConstructor;

public class Espectador {

    private int edad;

    public Espectador(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

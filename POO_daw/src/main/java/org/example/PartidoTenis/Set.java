package org.example.PartidoTenis;

public class Set {
    private int puntos_j1;



    private int puntos_j2;

    public int getPuntos_j2() {
        return puntos_j2;
    }

    public void setPuntos_j2(int puntos_j2) {
        this.puntos_j2 = puntos_j2;
    }

    public int getPuntos_j1() {
        return puntos_j1;
    }

    public void setPuntos_j1(int puntos_j1) {
        this.puntos_j1 = puntos_j1;
    }

    @Override
    public String toString() {
        return "Set{" +
                "puntos_j1=" + puntos_j1 +
                ", puntos_j2=" + puntos_j2 +
                '}';
    }



}

package org.example.pruebasEnum;

public enum Semaforo {
    AMARILLO(1), ROJO(2), VERDE(3);

    public final int posicion;
    Semaforo(int posicion ){
        this.posicion = posicion;
    }
    public static Semaforo siguiente(Semaforo actual){
        switch (actual){
            case AMARILLO: return ROJO;
            case ROJO: return VERDE;
            case VERDE: return AMARILLO;
            default: return AMARILLO;
        }
    }
}

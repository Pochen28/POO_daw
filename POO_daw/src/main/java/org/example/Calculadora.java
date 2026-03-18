package org.example;

public class Calculadora     {

    private int primernumero;
    private int segundonumero;
    static int resultado = 0;

    public Calculadora(int primernumero, int segundonumero) {
        this.primernumero = primernumero;
        this.segundonumero = segundonumero;
    }

    public int sumar (){
        resultado = primernumero + segundonumero;
        return resultado;
    }

    public int restar (){
        resultado = primernumero - segundonumero;
        return resultado;
    }

    public int multiplicar (){
        resultado = primernumero * segundonumero;
        return resultado;
    }

    public int dividir(){
        resultado = primernumero / segundonumero;
        return resultado;
    }


    public int getPrimernumero() {
        return primernumero;
    }

    public void setPrimernumero(int primernumero) {
        this.primernumero = primernumero;
    }

    public int getSegundonumero() {
        return segundonumero;
    }

    public void setSegundonumero(int segundonumero) {
        this.segundonumero = segundonumero;
    }
}

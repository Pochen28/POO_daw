package org.example.pruebasEnum;

public class CuentaBancaria {

    private int saldo;


    public CuentaBancaria (int saldo){
        this.saldo = saldo;
    }


    public int consultarCuenta (int saldo){
        return saldo;
    }
    public void ingresarDinero (int saldo){

    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


}

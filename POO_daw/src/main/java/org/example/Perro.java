package org.example;

public class Perro {
    private String raza;
    private String pelo;
    private int peso;
    private int patas;
    private String color;

    public Perro (String raza, String pelo, int peso, int patas, String color){
        patas = 4;
        this.raza = raza;
        this.pelo = pelo;
        this.peso = peso;
        this.color = color;
    }

    public Perro (){

    }

    public void ImprimirFicha(){
        System.out.println("Raza: " + this.raza);
        System.out.println("Pelo: " + this.pelo);
        System.out.println("Peso: " + this.peso);
        System.out.println("Patas: " + this.patas);
        System.out.println("Color: " + this.color);

    }
    public String getRaza(){
        return raza;
    }

    public void setRaza (String raza){
        this.raza = raza;
    }

    public String getPelo(){
        return pelo;
    }

    public void setPelo (String pelo){
        this.pelo = pelo;
    }

    public int getpeso(){
        return peso;
    }

    public void setpeso (int peso){
        this.peso = peso;
    }

    public int getPatas(){
        return patas;
    }

    public void setPatas (int patas){
        this.patas = patas;
    }

    public String getColor(){
        return color;
    }

    public void setColor (String color){
        this.color = color;
    }
}

package org.example.dispositivos;

public abstract class Dispositivo {
    protected  String nombre;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected boolean estado;

    public Dispositivo (String nombre){
        this.nombre=nombre;
        estado=false;
    }

    public abstract void encender();

    public void apagar (){


        if (estado){
            estado = false;
            System.out.println(nombre + " apagado.");

        }else {
            System.out.println("Ya está apagado.");
        }
    }

    public void mostrarEstado(){
        if (estado){
            System.out.println(nombre + " encendido");
        }else {
            System.out.println(nombre + " apagado");
        }
    }
}

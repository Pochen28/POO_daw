package org.example.ElFormiguero;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaPrograma = new ArrayList<>();

    public Cadena (String nombre, ArrayList<Programa>listaPrograma){
        this.nombre = nombre;
        this.listaPrograma = listaPrograma;
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaPrograma() {
        return listaPrograma;
    }

    public void setListaPrograma(ArrayList<Programa> listaPrograma) {
        this.listaPrograma = listaPrograma;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaPrograma=" + listaPrograma +
                '}';
    }


}

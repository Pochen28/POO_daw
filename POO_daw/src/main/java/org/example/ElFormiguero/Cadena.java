package org.example.ElFormiguero;

import java.util.ArrayList;

/**
 * Representa una cadena de televisión que gestiona un conjunto de programas.
 */
public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaPrograma;

    /**
     * @param nombre El nombre de la cadena de televisión.
     */
    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaPrograma = new ArrayList<>();
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

    /**
     * Agrega un programa a la lista de la cadena si no existe previamente.
     * @param programa El programa a añadir.
     */
    public void agregarPrograma(Programa programa) {
        if (!listaPrograma.contains(programa)) {
            listaPrograma.add(programa);
        }
    }

    /**
     * Elimina un programa de la lista de la cadena.
     * @param programa El programa a eliminar.
     */
    public void eliminarPrograma(Programa programa) {
        listaPrograma.remove(programa);
    }

    @Override
    public String toString() {
        return "Cadena [nombre='" + nombre + "', listaProgramas=" + listaPrograma + "]";
    }
}
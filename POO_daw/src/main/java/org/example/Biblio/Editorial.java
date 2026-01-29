
package org.example.Biblio;

import java.util.ArrayList;

public class Editorial {
    private String pais;
    private String nombre;

    public ArrayList<Libros> getListaDeLibros() {
        return listaDeLibros;
    }

    public void setListaDeLibros(ArrayList<Libros> listaDeLibros) {
        this.listaDeLibros = listaDeLibros;
    }

    private ArrayList<Libros> listaDeLibros;


    public Editorial(String nombre,String pais){
        this.nombre=nombre;
        this.pais=pais;
        this. listaDeLibros = new ArrayList<>();

    }

    public void anyadirLibro (Libros Libros){
        listaDeLibros.add(Libros);

    }

    public void borrarLibro (Libros Libros){
        listaDeLibros.remove(Libros);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", libros='" + listaDeLibros +
                '}';
    }


}

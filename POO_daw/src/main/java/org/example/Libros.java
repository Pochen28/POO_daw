package org.example;

public class Libros {

    private String titulo;
    private String autor;
    private int id;
    private boolean disponible;

    public static int cantidadLibros = 0;

    public static int librosDisponibles = 0;


    public Libros (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;

    }

}


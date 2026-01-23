package org.example;

public class Libros {

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    private static String prefijoId = "LIB";
    private static int totalLibros = 0;
    private static int stockDisponible = 0;

    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;

        totalLibros++;
        stockDisponible++;
        this.id = prefijoId;
    }

    public void Prestar() {
        if (this.disponible) {
            this.disponible = false;
            stockDisponible--;
            System.out.println("El libro " + this.titulo + " ha sido prestado.");
        } else {
            System.out.println("Error! Ya esta prestado.");
        }
    }

    public void devolver() {
        if (!this.disponible) {
            this.disponible = true;
            stockDisponible++;
            System.out.println("Has devuelto " + this.titulo + ", Gracias!");
        } else {
            System.out.println("Este libro ya esta en la estanteria.");
        }
    }

    @Override
    public String toString() {
        String situacion = this.disponible ? "Disponible" : "Prestado";

        return "LIBRO [" + this.id + "] " + "Título: " + this.titulo + " | " + "Autor: " + this.autor + " | " + "Estado: " + situacion;
    }

    private String generarId() {
        return "LIB " + totalLibros;
    }

    public boolean estaDisponible() {
        return this.disponible;
    }

    public static int getCantidadLibros() {
        return totalLibros;
    }

    public static int getLibrosDisponible() {
        return stockDisponible;
    }

    public String getId() {
        return this.id;
    }
}
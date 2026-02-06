package org.example.ElFormiguero;

import lombok.Data;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Representa a los invitados que acuden al programa. [cite: 61]
 */
@Data
public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    /**
     * Crea un invitado y solicita la fecha de visita por consola. [cite: 89, 90]
     * @param nombre Nombre del invitado.
     * @param profesion Profesión del invitado.
     * @param temporada Temporada de la visita.
     */
    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        this.fecha_visita = solicitarFecha(nombre);
    }

    /**
     * Pide al usuario el año, mes y día de la visita. [cite: 90, 131-136]
     * @param nombre Nombre para el mensaje de consola.
     * @return LocalDate configurado por el usuario.
     */
    private LocalDate solicitarFecha(String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año para " + nombre + ":");
        int a = sc.nextInt();
        System.out.println("Mes:");
        int m = sc.nextInt();
        System.out.println("Día:");
        int d = sc.nextInt();
        return LocalDate.of(a, m, d);
    }
}
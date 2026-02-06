package org.example.ElFormiguero;

import lombok.Getter;
import lombok.ToString;
import java.util.ArrayList;

/**
 * Clase central que gestiona la lógica de empleados e invitados. [cite: 31, 67]
 */
@Getter
@ToString
public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    /**
     * Constructor que inicializa el programa y su director. [cite: 50, 51]
     */
    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.director = new Empleado(nombreDirector, "director", null);
        this.listaEmpleados.add(this.director);
        this.cadena.agregarPrograma(this);
    }

    /**
     * Busca si un invitado ha visitado el programa. [cite: 99]
     * @param nombre Nombre a buscar.
     * @return true si existe en la lista.
     */
    public boolean buscarInvitado(String nombre) {
        return listaInvitados.stream().anyMatch(i -> i.getNombre().equalsIgnoreCase(nombre));
    }

    /**
     * Cuenta las visitas de un invitado. [cite: 97]
     * @param nombre Nombre del invitado.
     * @return Número de visitas.
     */
    public int vecesInvitado(String nombre) {
        return (int) listaInvitados.stream().filter(i -> i.getNombre().equalsIgnoreCase(nombre)).count();
    }
}
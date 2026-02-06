package org.example.ElFormiguero;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gestiona los datos de los trabajadores del programa.
 * Implementa un sistema de ID autogenerado único. [cite: 53, 54]
 */
@Getter
@Setter
@ToString
public class Empleado {
    private final String id;
    private String nombre;
    private String cargo;
    private Empleado director;
    private static int contador = 1;

    /**
     * Constructor que asigna nombre, valida el cargo y genera el ID. [cite: 54, 57]
     * @param nombre Nombre del empleado.
     * @param cargo Puesto (director, técnico, presentador, colaborador). [cite: 57]
     * @param director Jefe directo asignado. [cite: 59]
     */
    public Empleado(String nombre, String cargo, Empleado director) {
        this.id = String.format("EP%03d", contador++);
        this.nombre = nombre;
        setCargo(cargo);
        this.director = director;
    }

    /**
     * Valida que el cargo esté entre los permitidos. Si no, asigna "pte". [cite: 57]
     * @param cargo El cargo a evaluar.
     */
    public void setCargo(String cargo) {
        if (cargo.equalsIgnoreCase("director") || cargo.equalsIgnoreCase("técnico") ||
                cargo.equalsIgnoreCase("presentador") || cargo.equalsIgnoreCase("colaborador")) {
            this.cargo = cargo.toLowerCase();
        } else {
            this.cargo = "pte";
        }
    }
}
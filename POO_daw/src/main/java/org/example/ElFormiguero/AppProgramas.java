package org.example.ElFormiguero;

public class AppProgramas {
    public static void main(String[] args) {
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        Programa el_hormiguero = new Programa("El Hormiguero", antena3, "Director1");
        System.out.println(el_hormiguero);

        el_hormiguero.insertarEmpleado("Pablo Motos", "presentador", null);

        System.out.println("Lista de Empleados: " + el_hormiguero.getListaEmpleados());

        el_hormiguero.insertarInvitado("Aitana", "cantante", 1);

        System.out.println("Lista de Invitados: " + el_hormiguero.getListaInvitados());
    }
}
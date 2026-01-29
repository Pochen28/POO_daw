package org.example.chalet;

import java.util.ArrayList;

public class Casa {

    private String direccion;
    public Casa (String direccion){
        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
    }

    public void crearHabitacion (String nombre, double metrosCuadrados){
        Habitacion habitacion = new Habitacion(nombre, metrosCuadrados);
        listaHabitaciones.add
    }
    public void setListaHabitaciones (ArrayList<Habitacion> listaHabitaciones){
        this.listaHabitaciones = listaHabitaciones;
    }

    public void mostarHabitaciones (){
        System.out.println("habitaciones de la casa de la dirección " + direccion);

        for (Habitacion habitacion){
            System.out.println("- " + habitacion.getNombre()+ " con " + habitacion.getMetrosCuadrados());
        }
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                '}';
    }


}

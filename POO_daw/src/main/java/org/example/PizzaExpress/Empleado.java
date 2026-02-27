package org.example.PizzaExpress;

public class Empleado extends PizzaExpress implements AccionesPedido{
    private String id;
    private String nombre;

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public void obtenerDetalles() {
        System.out.println("Empleado " + getNombre() + "id" + id);
    }

    @Override
    public void cancelar(Pedido pedido) {

    }
}

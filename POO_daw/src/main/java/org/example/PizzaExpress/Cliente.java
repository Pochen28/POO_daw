package org.example.PizzaExpress;

public class Cliente extends PizzaExpress implements AccionesPedido{
    private String nombre;
    private int descuento;

    public Cliente(int descuento, String nombre) {
        this.descuento = descuento;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }



    @Override
    public void obtenerDetalles() {

    }

    @Override
    public void cancelar(Pedido pedido) {

    }
}

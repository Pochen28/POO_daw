package org.example.PizzaExpress;

import java.util.ArrayList;

public class Pedido extends PizzaExpress {
    private Cliente cliente;
    private ArrayList<CartaPizzas> ListaPizzas;
    private EstadoPedido estadopedido;

    public void aplicarDescuento (){

    }

    public Pedido(Cliente cliente, EstadoPedido estadopedido) {
        this.cliente = cliente;
        this.estadopedido = estadopedido;
        ListaPizzas = new ArrayList<>();
    }

    public ArrayList<CartaPizzas> getListaPizzas() {
        return ListaPizzas;
    }

    public void setListaPizzas(ArrayList<CartaPizzas> listaPizzas) {
        ListaPizzas = listaPizzas;
    }

    public EstadoPedido getEstadopedido() {
        return estadopedido;
    }

    public void setEstadopedido(EstadoPedido estadopedido) {
        this.estadopedido = estadopedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public void obtenerDetalles() {

    }
}

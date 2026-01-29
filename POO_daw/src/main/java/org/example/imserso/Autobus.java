package org.example.imserso;

import java.util.ArrayList;

public class Autobus {
    private String matricula;
    private String destino;
    private ArrayList<Abuelo> listaAbuelos;



    public Autobus (){
        this.matricula= matricula;
        this.destino = destino;
        listaAbuelos = new ArrayList<>();
    }
//
//    public void insertarAbuelo(){
//        listaAbuelos.add(Abuelo);
//    }
//
//    public void borrarAbuelo(){
//        listaAbuelos.remove(Abuelo);
//    }

    public void mostrarpasajeros(){

    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Abuelo> getListaAbuelos() {
        return listaAbuelos;
    }

    public void setListaAbuelos(ArrayList<Abuelo> listaAbuelos) {
        this.listaAbuelos = listaAbuelos;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }





    public String getMatricula(){
        return matricula;
    }
}

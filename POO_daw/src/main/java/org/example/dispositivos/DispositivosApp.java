package org.example.dispositivos;

import java.util.ArrayList;

public class DispositivosApp {
    public static void main(String[] args){
        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();

        listaDispositivos.add(new Televisor("LG Smart"));
        listaDispositivos.add(new Televisor("Alexa"));



        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto)dispositivo).sincronizar();
            }
        }

        Dispositivo proyector = new Dispositivo("Proyector") {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El proyector está encendido");
                }else {
                    System.out.println("Encendiendo proyector con control remoto de prestación");
                }
            }
        };

        proyector.encender();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar(){
                System.out.println("Sincronizando proyector con ");
            }
        };

        Dispositivo horno_ia = new Dispositivo("Horno Chat-GPT") {
            @Override
            public void encender() {
                System.out.println();
            }
        };

        listaDispositivos.add(proyector);

        for (Dispositivo dispositivo : listaDispositivos) {
            dispositivo.encender();
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.nombre.equals("Optoma")) {
                proyector_sinc.sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();

        }



    }
}

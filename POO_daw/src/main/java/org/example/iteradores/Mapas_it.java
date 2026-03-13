package org.example.iteradores;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapas_it {
    public static void main(String[] args) {
        HashMap<String, Integer> goleadores = new HashMap<>();
        goleadores.put("ANDRÉ SILVA", 6);
        goleadores.put("RONALDO NAZARIO", 156);

        Iterator<Map.Entry<String, Integer>> it_mapita = goleadores.entrySet().iterator();

        while (it_mapita.hasNext()){
            Map.Entry<String, Integer> goleadorGol = it_mapita.next();
            System.out.println(goleadorGol.getKey() + "ha marcado" + goleadorGol.getValue() + " goleadores.");

            if (goleadorGol.getValue()<100){
                it_mapita.remove();
            }
        }

        System.out.println(goleadores.entrySet());
    }
}

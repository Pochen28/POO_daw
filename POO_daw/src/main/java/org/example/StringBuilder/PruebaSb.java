package org.example.StringBuilder;

public class PruebaSb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Es el vecino");
        sb.append("el que elige").append("al alcalde ");
        sb.insert(13, "alcalde");
        sb.replace(20,24, "vecios");
        sb.reverse();
        System.out.println(sb);
    }
}

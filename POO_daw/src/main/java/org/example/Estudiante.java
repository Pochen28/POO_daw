package org.example;

public class Estudiante {
    public static int contadorEstudiantes = 0;
    public boolean getNia;

    private String nombre;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private  String curso;
    private int nia;
    private String email;

    public Estudiante (String nombre, String curso, String email){

        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        nia = ++contadorEstudiantes;
    }

    public Estudiante (String nombre){
        this (nombre, "", "");
    }

    public static int getContadorEstudiantes(){
        return contadorEstudiantes++;
       
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nia=" + nia +
                ", email='" + email + '\'' +
                '}';
    }
}

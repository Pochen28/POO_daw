package org.example.InicioPOO;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;


    public Persona (){
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }


    public Persona (String nombre, String apellidos, int edad) {
        if (edad<0){
            throw new IllegalArgumentException ("La edad debe de ser positiva.");
        }

        this.nombre = nombre;
        this.apellidos= apellidos;
        this.edad = edad;
    }

    public String getNombre (){
        return this.nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getApellidos (){
        return this.apellidos;
    }

    public void setApellidos (String apellidos){
        this.apellidos = apellidos;
    }

    public int getEdad (){
        return edad;
    }

    public void setEdad (int edad){


        this.edad = edad;
    }

    public String nombreCompleto (){
        return this.nombre + " " + this.apellidos;
    }

    public boolean mayorEdad () {
        return this.edad >= 18;
    }

}

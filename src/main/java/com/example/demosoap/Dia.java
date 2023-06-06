package com.example.demosoap;



public class Dia {
    private String nombre;
    private String traductor;

    public Dia(String nombre, String traductor){
        this.nombre = nombre;
        this.traductor = traductor;
    }

    public Dia(){

    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre( String nombre){
        this.nombre = nombre;
    }

    public String getTraductor(){
        return this.traductor;
    }

    public void setTraductor( String traductor){
        this.traductor = traductor;
    }

}

package com.firstfantasy.datos;

public abstract class Objeto {
    
    private int identificador;
    private String nombre;
    private String tipo;

    public Objeto(int identificador, String nombre, String tipo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Objeto{" + "identificador=" + identificador + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
}

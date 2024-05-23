package com.firstfantasy.datos;

import java.util.ArrayList;

public class Clase {
    private int id;
    private String nombre;
    private ArrayList<String> beneficios;
    private ArrayList<String> perjuicios;

    public Clase(int id, String nombre, ArrayList<String> beneficios, ArrayList<String> perjuicios) {
        this.id = id;
        this.nombre = nombre;
        this.beneficios = beneficios;
        this.perjuicios = perjuicios;
    }

    @Override
    public String toString() {
        return "Clase(" + "id=" + id + ", nombre=" + nombre + ", beneficios=" + beneficios + ", perjuicios=" + perjuicios + ')';
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the beneficios
     */
    public ArrayList<String> getBeneficios() {
        return beneficios;
    }

    /**
     * @param beneficios the beneficios to set
     */
    public void setBeneficios(ArrayList<String> beneficios) {
        this.beneficios = beneficios;
    }

    /**
     * @return the perjuicios
     */
    public ArrayList<String> getPerjuicios() {
        return perjuicios;
    }

    /**
     * @param perjuicios the perjuicios to set
     */
    public void setPerjuicios(ArrayList<String> perjuicios) {
        this.perjuicios = perjuicios;
    }
    
    
    
    
}

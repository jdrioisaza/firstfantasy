package com.firstfantasy.datos;

import java.util.ArrayList;

public class Raza {
    private int id;
    private String nombre;
    private ArrayList<String> ventajas;
    private ArrayList<String> desventajas;

    public Raza(int id, String nombre, ArrayList<String> ventajas, ArrayList<String> desventajas) {
        this.id = id;
        this.nombre = nombre;
        this.ventajas = ventajas;
        this.desventajas = desventajas;
    }

    @Override
    public String toString() {
        return "Raza(" + "id=" + id + ", nombre=" + nombre + ", ventajas=" + ventajas + ", desventajas=" + desventajas + ')';
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
     * @return the ventajas
     */
    public ArrayList<String> getVentajas() {
        return ventajas;
    }

    /**
     * @param ventajas the ventajas to set
     */
    public void setVentajas(ArrayList<String> ventajas) {
        this.ventajas = ventajas;
    }

    /**
     * @return the desventajas
     */
    public ArrayList<String> getDesventajas() {
        return desventajas;
    }

    /**
     * @param desventajas the desventajas to set
     */
    public void setDesventajas(ArrayList<String> desventajas) {
        this.desventajas = desventajas;
    }
    
    
    
    
}

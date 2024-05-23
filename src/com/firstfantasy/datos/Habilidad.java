package com.firstfantasy.datos;

public class Habilidad {
    private int id;
    private String nombre;
    private String descripcion;
    private int costoEnergia;

    public Habilidad(int id, String nombre, String descripcion, int costoEnergia) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costoEnergia = costoEnergia;
    }

    public String usarHabilidad() {
        return nombre + " usado, costo energetico: " + costoEnergia;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the costoEnergia
     */
    public int getCostoEnergia() {
        return costoEnergia;
    }

    /**
     * @param costoEnergia the costoEnergia to set
     */
    public void setCostoEnergia(int costoEnergia) {
        this.costoEnergia = costoEnergia;
    }
    
    
    
}

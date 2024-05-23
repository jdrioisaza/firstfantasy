package com.firstfantasy.datos;

public class Pocion extends Objeto {
    private String efecto;

    public Pocion(String efecto, int id, String nombre) {
        super(id, nombre);
        this.efecto = efecto;
    }

    @Override
    public String toString() {
        return super.toString() + "(Efecto: " + efecto + ")";
    }

    

    /**
     * @return the efecto
     */
    public String getEfecto() {
        return efecto;
    }

    /**
     * @param efecto the efecto to set
     */
    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
}

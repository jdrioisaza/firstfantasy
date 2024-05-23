package com.firstfantasy.datos;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Arma> armas;
    private ArrayList<Pocion> pociones;

    public Inventario(ArrayList<Arma> armas, ArrayList<Pocion> pociones) {
        this.armas = armas;
        this.pociones = pociones;
    }

    
    
    public void addArma(Arma arma){
        armas.add(arma);
    }
    
    public void addPocion(Pocion pocion){
        pociones.add(pocion);
    }

    /**
     * @return the armas
     */
    public ArrayList<Arma> getArmas() {
        return armas;
    }

    /**
     * @return the pociones
     */
    public ArrayList<Pocion> getPociones() {
        return pociones;
    }
}

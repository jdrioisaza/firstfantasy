package com.firstfantasy.personajes;

import com.firstfantasy.objetos.Pocion;
import com.firstfantasy.objetos.Arma;
import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Arma> armas;
    private ArrayList<Pocion> pociones;

    public Inventario(ArrayList<Arma> armas, ArrayList<Pocion> pociones) {
        this.armas = armas;
        this.pociones = pociones;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }
    
    public void addArma(Arma arma) {
        
        armas.add(arma);
        
    }

    public ArrayList<Pocion> getPociones() {
        return pociones;
    }

    public void setPociones(ArrayList<Pocion> pociones) {
        this.pociones = pociones;
    }
    
    public void addPocion(Pocion pocion) {
        
        pociones.add(pocion);
        
    }
    
}

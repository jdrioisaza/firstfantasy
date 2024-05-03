package com.firstfantasy.datos;

import java.util.ArrayList;

public class Inventario {
    
    ArrayList<Arma> armas;
    ArrayList<Pocion> pociones;

    public Inventario(ArrayList<Arma> armas, ArrayList<Pocion> pociones) {
        this.armas = armas;
        this.pociones = pociones;
    }
    
}

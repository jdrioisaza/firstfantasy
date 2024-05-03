package com.firstfantasy.datos;

import java.util.ArrayList;

public class Combate {
    
    ArrayList<Personaje> aliados;
    ArrayList<Enemigo> enemigos;

    public Combate(ArrayList<Personaje> aliados, ArrayList<Enemigo> enemigos) {
        this.aliados = aliados;
        this.enemigos = enemigos;
    }
    
}

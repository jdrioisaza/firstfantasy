package com.firstfantasy.datos;

import java.util.ArrayList;

public class Personaje {
    
    Inventario inventario;
    Arma armaEquipada;
    Raza raza;
    Clase clase;
    int salud;
    ArrayList<Habilidad> habilidades;

    public Personaje(Arma armaEquipada, Raza raza, Clase clase, ArrayList<Habilidad> habilidades, ArrayList<Arma> armas, ArrayList<Pocion> pociones) {
        this.inventario = new Inventario(armas, pociones);
        this.armaEquipada = armaEquipada;
        this.raza = raza;
        this.clase = clase;
        this.habilidades = habilidades;
        this.salud=100;
    }
    
}

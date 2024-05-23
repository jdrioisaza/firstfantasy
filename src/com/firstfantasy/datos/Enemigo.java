package com.firstfantasy.datos;

import java.util.ArrayList;



public class Enemigo extends Personaje {
    
    public Enemigo(Arma armaEquipada, Raza raza, Clase clase, ArrayList<Habilidad> habilidades, ArrayList<Arma> armas, ArrayList<Pocion> pociones, int salud, int energia) {
        super(armaEquipada, raza, clase, habilidades, armas, pociones, salud, energia);
    }
    
}

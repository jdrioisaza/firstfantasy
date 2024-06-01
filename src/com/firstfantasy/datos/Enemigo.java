package com.firstfantasy.datos;

import java.util.ArrayList;

public class Enemigo extends Personaje {

    public Enemigo(int identificador, String nombre, int vida, int energia, int atributoAtaque, int atributoAtaqueEspecial, int atributoDefensa, int atributoDefensaEspecial, Raza raza, Clase clase, Arma armaEquipada, ArrayList<Habilidad> habilidades, ArrayList<Arma> armas, ArrayList<Pocion> pociones) {
        super(identificador, nombre, vida, energia, atributoAtaque, atributoAtaqueEspecial, atributoDefensa, atributoDefensaEspecial, raza, clase, armaEquipada, habilidades, armas, pociones);
    }
    
}

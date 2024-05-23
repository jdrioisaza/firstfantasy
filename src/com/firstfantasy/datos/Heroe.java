/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.firstfantasy.datos;

import java.util.ArrayList;

/**
 *
 * @author MauricioPolo
 */
public class Heroe extends Personaje{
    
    public Heroe(Arma armaEquipada, Raza raza, Clase clase, ArrayList<Habilidad> habilidades, ArrayList<Arma> armas, ArrayList<Pocion> pociones, int salud, int energia) {
        super(armaEquipada, raza, clase, habilidades, armas, pociones, salud, energia);
    }
    
}

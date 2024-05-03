package com.firstfantasy.datos;

import java.util.ArrayList;

public class Videojuego {
    
    String nombre;
    ArrayList<Habilidad> habilidades;
    ArrayList<Clase> clases;
    ArrayList<Raza> razas;
    ArrayList<Personaje> personajes;
    ArrayList<Enemigo> enemigos;
    ArrayList<Combate> combates;
    ArrayList<Arma> armas;
    ArrayList<Pocion> pociones;

    public Videojuego(String nombre) {
        
        this.nombre = nombre;
        this.habilidades = new ArrayList<>();
        this.clases = new ArrayList<>();
        this.razas = new ArrayList<>();
        this.personajes = new ArrayList<>();
        this.enemigos = new ArrayList<>();
        this.combates = new ArrayList<>();
        this.armas = new ArrayList<>();
        this.pociones = new ArrayList<>();
        
    }
    
}

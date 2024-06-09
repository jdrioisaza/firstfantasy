package com.firstfantasy.datos;

import com.firstfantasy.personajes.Habilidad;
import com.firstfantasy.personajes.Raza;
import com.firstfantasy.personajes.Clase;
import com.firstfantasy.personajes.Heroe;
import com.firstfantasy.personajes.Personaje;
import com.firstfantasy.personajes.Enemigo;
import com.firstfantasy.objetos.Pocion;
import com.firstfantasy.objetos.Arma;
import com.firstfantasy.objetos.Objeto;
import java.io.Serializable;
import java.util.ArrayList;

public class Videojuego implements Serializable {
    
    private String nombre;
    private ArrayList<Combate> combates;
    private ArrayList<Habilidad> habilidades;
    private ArrayList<Personaje> personajes;
    private ArrayList<Clase> clases;
    private ArrayList<Raza> razas;
    private ArrayList<Objeto> objetos;

    public Videojuego(String nombre) {
        
        this.nombre = nombre;
        this.combates = new ArrayList<>();
        this.habilidades = new ArrayList<>();
        this.personajes = new ArrayList<>();
        this.clases = new ArrayList<>();
        this.razas = new ArrayList<>();
        this.objetos = new ArrayList<>();
        
    }
    
    public void addCombate(Combate c) {
        
        combates.add(c);
        
    }
    
    public void addHabilidades(Habilidad h) {
        
        habilidades.add(h);
        
    }
    
    public void addPersonaje(Heroe h) {
        
        personajes.add(h);
        
    }
    
    public void addPersonaje(Enemigo e) {
        
        personajes.add(e);
        
    }
    
    public void addClase(Clase c) {
        
        clases.add(c);
        
    }
    
    public void addRaza(Raza r) {
        
        razas.add(r);
        
    }
    
    public void addObjeto(Arma a) {
        
        objetos.add(a);
        
    }
    
    public void addObjeto(Pocion p) {
        
        objetos.add(p);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Combate> getCombates() {
        return combates;
    }

    public void setCombates(ArrayList<Combate> combates) {
        this.combates = combates;
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public ArrayList<Raza> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<Raza> razas) {
        this.razas = razas;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<Objeto> objetos) {
        this.objetos = objetos;
    }
    
}

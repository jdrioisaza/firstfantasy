package com.firstfantasy.datos;

import java.util.ArrayList;

public class Videojuego {
    
    private String nombre;
    private ArrayList<Habilidad> habilidades;
    private ArrayList<Clase> clases;
    private ArrayList<Raza> razas;
    private ArrayList<Heroe> heroes;
    private ArrayList<Enemigo> enemigos;
    private ArrayList<Combate> combates;
    private ArrayList<Arma> armas;
    private ArrayList<Pocion> pociones;

    public Videojuego(String nombre) {
        
        this.nombre = nombre;
        this.habilidades = new ArrayList<>();
        this.clases = new ArrayList<>();
        this.razas = new ArrayList<>();
        this.heroes = new ArrayList<>();
        this.enemigos = new ArrayList<>();
        this.combates = new ArrayList<>();
        this.armas = new ArrayList<>();
        this.pociones = new ArrayList<>();
        
    }

    public void addHabilidad(Habilidad habilidad){
        getHabilidades().add(habilidad);
    }
     public void addClase(Clase clase) {
        getClases().add(clase);
    }

    public void addRaza(Raza raza) {
        getRazas().add(raza);
    }

    public void addHeroe(Heroe heroe) {
        getHeroes().add(heroe);
    }

    public void addEnemigo(Enemigo enemigo) {
        getEnemigos().add(enemigo);
    }

    public void addCombate(Combate combate) {
        getCombates().add(combate);
    }

    public void addArma(Arma arma) {
        getArmas().add(arma);
    }

    public void addPocion(Pocion pocion) {
        getPociones().add(pocion);
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the habilidades
     */
    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    /**
     * @param habilidades the habilidades to set
     */
    public void setHabilidades(ArrayList<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    /**
     * @return the clases
     */
    public ArrayList<Clase> getClases() {
        return clases;
    }

    /**
     * @param clases the clases to set
     */
    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    /**
     * @return the razas
     */
    public ArrayList<Raza> getRazas() {
        return razas;
    }

    /**
     * @param razas the razas to set
     */
    public void setRazas(ArrayList<Raza> razas) {
        this.razas = razas;
    }

    /**
     * @return the enemigos
     */
    public ArrayList<Enemigo> getEnemigos() {
        return enemigos;
    }

    /**
     * @param enemigos the enemigos to set
     */
    public void setEnemigos(ArrayList<Enemigo> enemigos) {
        this.enemigos = enemigos;
    }

    /**
     * @return the combates
     */
    public ArrayList<Combate> getCombates() {
        return combates;
    }

    /**
     * @param combates the combates to set
     */
    public void setCombates(ArrayList<Combate> combates) {
        this.combates = combates;
    }

    /**
     * @return the armas
     */
    public ArrayList<Arma> getArmas() {
        return armas;
    }

    /**
     * @param armas the armas to set
     */
    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    /**
     * @return the pociones
     */
    public ArrayList<Pocion> getPociones() {
        return pociones;
    }

    /**
     * @param pociones the pociones to set
     */
    public void setPociones(ArrayList<Pocion> pociones) {
        this.pociones = pociones;
    }

    /**
     * @return the heroes
     */
    public ArrayList<Heroe> getHeroes() {
        return heroes;
    }

    /**
     * @param heroes the heroes to set
     */
    public void setHeroes(ArrayList<Heroe> heroes) {
        this.heroes = heroes;
    }
    
}

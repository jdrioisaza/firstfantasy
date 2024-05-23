package com.firstfantasy.datos;

import java.util.ArrayList;

public class Combate {
    
    private ArrayList<Personaje> aliados;
    private ArrayList<Enemigo> enemigos;
    private int turno;

    public Combate(ArrayList<Personaje> aliados, ArrayList<Enemigo> enemigos) {
        this.aliados = aliados;
        this.enemigos = enemigos;
        this.turno = 0;
    }
    
    public void iniciarCombate(){
        
    }
    
    public void realizarTurno(){
        
    }

    /**
     * @return the aliados
     */
    public ArrayList<Personaje> getAliados() {
        return aliados;
    }

    /**
     * @param aliados the aliados to set
     */
    public void setAliados(ArrayList<Personaje> aliados) {
        this.aliados = aliados;
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
     * @return the turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }
    
}

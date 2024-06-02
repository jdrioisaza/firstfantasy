package com.firstfantasy.datos;

import com.firstfantasy.personajes.Personaje;
import com.firstfantasy.personajes.Enemigo;
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

    public ArrayList<Personaje> getAliados() {
        return aliados;
    }

    public void setAliados(ArrayList<Personaje> aliados) {
        this.aliados = aliados;
    }

    public ArrayList<Enemigo> getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(ArrayList<Enemigo> enemigos) {
        this.enemigos = enemigos;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
}

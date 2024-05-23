package com.firstfantasy.datos;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Personaje {

    private Inventario inventario;
    private Arma armaEquipada;
    private Raza raza;
    private Clase clase;
    private int salud;
    private int energia;
    private ArrayList<Habilidad> habilidades;

    public Personaje(Arma armaEquipada, Raza raza, Clase clase, ArrayList<Habilidad> habilidades, ArrayList<Arma> armas, ArrayList<Pocion> pociones, int salud, int energia) {
        this.inventario = new Inventario(armas, pociones);
        this.armaEquipada = armaEquipada;
        this.raza = raza;
        this.clase = clase;
        this.habilidades = habilidades;
        this.salud = 100;
        this.energia = 100;
    }

    public void atacar(Personaje objetivo) {
        int nuevaSalud=objetivo.getSalud()-armaEquipada.getDañoPorGolpe();
        objetivo.setSalud(nuevaSalud);
    }

    public void usarHabilidad(int idxHabilidad, Personaje objetivo) {
        Habilidad skill = buscarHabilidad(idxHabilidad);
        if (skill!=null){
            //Codigo para la logica de la habilidad aqui
            gastoEnergiaHabilidad(skill.getCostoEnergia());
        }
    }
    private Habilidad buscarHabilidad(int idHabilidad) {
        for (Habilidad skill : habilidades) {
            if (skill.getId() == idHabilidad) {
                return skill;
            }
        }
        return null;
    }


    public  void gastoEnergiaHabilidad(int gasto){
        energia-=gasto;
    }

    public void cambiarArma(int idArama) {
        Arma weapon = buscarArma(idArama);
        if (weapon != null) {
            armaEquipada = weapon;
        }
    }


    private Arma buscarArma(int idArma) {
        ArrayList<Arma> weapons = inventario.getArmas();
        for (Arma a : weapons) {
            if (a.getId() == idArma) {
                return a;
            }
        }
        return null;
    }

    public void usarPocion(int idxPocion) {
        Pocion pos = buscarPocion(idxPocion);
        if (pos != null) {
            if (Objects.equals(pos.getEfecto(), "CURACION")) {
                recuperSalud();
            }
        }
    }

    private void recuperSalud() {
        if (salud >= 50) {
            salud = 100;
        } else {
            salud += 50;
        }
    }

    public Pocion buscarPocion(int idxPocion) {
        ArrayList<Pocion> pos = inventario.getPociones();
        for (Pocion po : pos) {
            if (po.getId() == idxPocion) {
                return po;
            }
        }
        return null;
    }

    /**
     * @return the inventario
     */
    public Inventario getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    /**
     * @return the armaEquipada
     */
    public Arma getArmaEquipada() {
        return armaEquipada;
    }

    /**
     * @param armaEquipada the armaEquipada to set
     */
    public void setArmaEquipada(Arma armaEquipada) {
        this.armaEquipada = armaEquipada;
    }

    /**
     * @return the raza
     */
    public Raza getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    /**
     * @return the clase
     */
    public Clase getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(Clase clase) {
        this.clase = clase;
    }

    /**
     * @return the salud
     */
    public int getSalud() {
        return salud;
    }

    /**
     * @param salud the salud to set
     */
    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * @return the energia
     */
    public int getEnergia() {
        return energia;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(int energia) {
        this.energia = energia;
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


}

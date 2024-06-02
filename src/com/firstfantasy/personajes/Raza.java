package com.firstfantasy.personajes;

public class Raza {
    
    private int identificador;
    private String nombre;
    private float[] estadisticas; 

    public Raza(int identificador, String nombre, float multiplicadorDaño, float multiplicadorDañoEspecial, float multiplicadorDefensa, float multiplicadorDefensaEspecial/*, float MultiplicadorVampirismo, float MultiplicadorLetalidad*/) {
        this.identificador = identificador;
        this.nombre = nombre;
        //this.estadisticas = new float[]{MultiplicadorDaño, MultiplicadorDañoEspecial, MultiplicadorDefensa, MultiplicadorDefensaEspecial, MultiplicadorVampirismo, MultiplicadorLetalidad};
        this.estadisticas = new float[]{multiplicadorDaño, multiplicadorDañoEspecial, multiplicadorDefensa, multiplicadorDefensaEspecial};
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public float getMultiplicadorDaño() {
        
        return estadisticas[0];
        
    }
    
    public void setMultiplicadorDaño(float multiplicadorDaño) {
        
        this.estadisticas[0] = multiplicadorDaño;
        
    }
    
    public float getMultiplicadorDañoEspecial() {
        
        return estadisticas[1];
        
    }
    
    public void setMultiplicadorDañoEspecial(float multiplicadorDañoEspecial) {
        
        this.estadisticas[1] = multiplicadorDañoEspecial;
        
    }
    
    public float getMultiplicadorDefensa() {
        
        return estadisticas[2];
        
    }
    
    public void setMultiplicadorDefensa(float multiplicadorDefensa) {
        
        this.estadisticas[2] = multiplicadorDefensa;
        
    }
    
    public float getMultiplicadorDefensaEspecial() {
        
        return estadisticas[3];
        
    }
    
    public void setMultiplicadorDefensaEspecial(float multiplicadorDefensaEspecial) {
        
        this.estadisticas[3] = multiplicadorDefensaEspecial;
        
    }
    
    /*
    public float getMultiplicadorVampirismo() {
        
        return estadisticas[4];
        
    }
    
    public void setMultiplicadorVampirismo(float MultiplicadorVampirismo) {
        
        this.estadisticas[4] = MultiplicadorVampirismo;
        
    }
    
    public float getMultiplicadorLetalidad() {
        
        return estadisticas[5];
        
    }
    
    public void setMultiplicadorLetalidad(float MultiplicadorLetalidad) {
        
        this.estadisticas[5] = MultiplicadorLetalidad;
        
    }
    */

    @Override
    public String toString() {
        return "Raza{" + "identificador=" + identificador + ", nombre=" + nombre + ", multiplicadorAtaque=" + estadisticas[0] + ", multiplicadorAtaqueEspecial" + estadisticas[1] + ", multiplicadorDefensa" + estadisticas[2] + "multiplicadorDefensaEspecial" + estadisticas[3] + '}';
    }
    
}

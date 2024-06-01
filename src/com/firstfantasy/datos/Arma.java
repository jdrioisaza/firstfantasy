package com.firstfantasy.datos;

public class Arma extends Objeto {
    
    private String tipoArma;
    private int[] estadisticas;

    public Arma(int identificador, String nombre, String tipo, String tipoArma, int valorModificadorAtaque, int valorModificadorAtaqueEspecial) {
        super(identificador, nombre, "Arma");
        this.tipoArma = tipoArma;
        this.estadisticas = new int[]{valorModificadorAtaque, valorModificadorAtaqueEspecial};
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public int getValorModificadorAtaque() {
        
        return estadisticas[0];
        
    }
    
    public void setValorModificadorAtaque(int valorModificadorAtaque) {
        
        this.estadisticas[0] = valorModificadorAtaque;
        
    }
    
    public int getValorModificadorAtaqueEspecial() {
        
        return estadisticas[1];
        
    }
    
    public void setValorModificadorAtaqueEspecial(int valorModificadorAtaqueEspecial) {
        
        this.estadisticas[1] = valorModificadorAtaqueEspecial;
        
    }

    @Override
    public String toString() {
        return super.toString() + " - Arma{" + "tipoArma=" + tipoArma + ", valorModificadorAtaque=" + estadisticas[0] + ", valorModificadorAtaqueEspecial=" + estadisticas[1] + '}';
    }
    
}

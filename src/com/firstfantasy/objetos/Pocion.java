package com.firstfantasy.objetos;

public class Pocion extends Objeto {
    
    private int[] efectos;

    public Pocion(int identificador, String nombre, int valorModificadorVida, int valorModificadorEnergia, int valorModificadorAtaque, int valorModificadorAtaqueEspecial, int valorModificadorDefensa, int valorModificadorDefensaEspecial) {
        super(identificador, nombre, "Poción");
        this.efectos = new int[]{valorModificadorVida, valorModificadorEnergia, valorModificadorAtaque, valorModificadorAtaqueEspecial, valorModificadorDefensa, valorModificadorDefensaEspecial};
    }

    public int getValorModificadorVida() {
        
        return efectos[0];
        
    }
    
    public void setValorModificadorVida(int valorModificadorVida) {
        
        this.efectos[0] = valorModificadorVida;
        
    }
    
    public int getValorModificadorEnergia() {
        
        return efectos[1];
        
    }
    
    public void setValorModificadorEnergia(int valorModificadorEnergia) {
        
        this.efectos[1] = valorModificadorEnergia;
        
    }
    
    public int getValorModificadorAtaque() {
        
        return efectos[2];
        
    }
    
    public void setValorModificadorAtaque(int valorModificadorAtaque) {
        
        this.efectos[2] = valorModificadorAtaque;
        
    }
    
    public int getValorModificadorAtaqueEspecial() {
        
        return efectos[3];
        
    }
    
    public void setValorModificadorAtaqueEspecial(int valorModificadorAtaqueEspecial) {
        
        this.efectos[3] = valorModificadorAtaqueEspecial;
        
    }
    
    public int getValorModificadorDefensa() {
        
        return efectos[4];
        
    }
    
    public void setValorModificadorDefensa(int valorModificadorDefensa) {
        
        this.efectos[4] = valorModificadorDefensa;
        
    }
    
    public int getValorModificadorDefensaEspecial() {
        
        return efectos[5];
        
    }
    
    public void setValorModificadorDefensaEspecial(int valorModificadorDefensaEspecial) {
        
        this.efectos[5] = valorModificadorDefensaEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + " - Pocion{" + "valorModificadorVida=" + efectos[0] + ", valorModificadorEnergia=" + efectos[1] + ", valorModificadorAtaque=" + efectos[2] + ", valorModificadorAtaqueEspecial=" + efectos[3] + ", valorModificadorDefensa=" + efectos[4] + ", valorModificadorDefensaEspecial=" + efectos[5] + '}';
    }
    
}

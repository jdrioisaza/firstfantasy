package com.firstfantasy.personajes;

public class Habilidad {
    
    private int identificador;
    private String nombre;
    private String descripcion;
    private int costoEnergia;
    private int[] efectos;

    public Habilidad(int identificador, String nombre, String descripcion, int costoEnergia, int valorModificadorVida, int valorModificadorEnergia, int valorModificadorAtaque, int valorModificadorAtaqueEspecial, int valorModificadorDefensa, int valorModificadorDefensaEspecial) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costoEnergia = costoEnergia;
        this.efectos = new int[]{valorModificadorVida, valorModificadorEnergia, valorModificadorAtaque, valorModificadorAtaqueEspecial, valorModificadorDefensa, valorModificadorDefensaEspecial};
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCostoEnergia() {
        return costoEnergia;
    }

    public void setCostoEnergia(int costoEnergia) {
        this.costoEnergia = costoEnergia;
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
        return "Habilidad{" + "identificador=" + identificador + ", nombre=" + nombre + ", descripcion=" + descripcion + ", costoEnergia=" + costoEnergia + "valorModificadorVida=" + efectos[0] + ", valorModificadorEnergia=" + efectos[1] + ", valorModificadorAtaque=" + efectos[2] + ", valorModificadorAtaqueEspecial=" + efectos[3] + ", valorModificadorDefensa=" + efectos[4] + ", valorModificadorDefensaEspecial=" + efectos[5] + '}';
    }
    
}

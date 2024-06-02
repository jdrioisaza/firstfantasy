package com.firstfantasy.personajes;

import com.firstfantasy.objetos.Arma;

public class Clase {
    
    private int identificador;
    private String nombre;
    private String tipoArmaPreferida;
    private float multiplicadorDañoTipoArmaPreferida;
    private float multiplicadorDañoEspecialTipoArmaPreferida;
    private float[] estadisticas;

    public Clase(int identificador, String nombre, String tipoArmaPreferida, float multiplicadorDañoTipoArmaPreferida, float multiplicadorDañoEspecialTipoArmaPreferida, float MultiplicadorDaño, float MultiplicadorDañoEspecial, float MultiplicadorDefensa, float MultiplicadorDefensaEspecial) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipoArmaPreferida = tipoArmaPreferida;
        this.multiplicadorDañoTipoArmaPreferida = multiplicadorDañoTipoArmaPreferida;
        this.multiplicadorDañoEspecialTipoArmaPreferida = multiplicadorDañoEspecialTipoArmaPreferida;
        this.estadisticas = new float[]{MultiplicadorDaño, MultiplicadorDañoEspecial, MultiplicadorDefensa, MultiplicadorDefensaEspecial};
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

    public String getTipoArmaPreferida() {
        return tipoArmaPreferida;
    }

    public void setTipoArmaPreferida(String tipoArmaPreferida) {
        this.tipoArmaPreferida = tipoArmaPreferida;
    }

    public float getMultiplicadorDañoTipoArmaPreferida() {
        return multiplicadorDañoTipoArmaPreferida;
    }

    public void setMultiplicadorDañoTipoArmaPreferida(float multiplicadorDañoTipoArmaPreferida) {
        this.multiplicadorDañoTipoArmaPreferida = multiplicadorDañoTipoArmaPreferida;
    }

    public float getMultiplicadorDañoEspecialTipoArmaPreferida() {
        return multiplicadorDañoEspecialTipoArmaPreferida;
    }

    public void setMultiplicadorDañoEspecialTipoArmaPreferida(float multiplicadorDañoEspecialTipoArmaPreferida) {
        this.multiplicadorDañoEspecialTipoArmaPreferida = multiplicadorDañoEspecialTipoArmaPreferida;
    }
    
    public float getMultiplicadorDaño() {
        
        return estadisticas[0];
        
    }
    
    public void setMultiplicadorDaño(float MultiplicadorDaño) {
        
        this.estadisticas[0] = MultiplicadorDaño;
        
    }
    
    public float getMultiplicadorDañoEspecial() {
        
        return estadisticas[1];
        
    }
    
    public void setMultiplicadorDañoEspecial(float MultiplicadorDañoEspecial) {
        
        this.estadisticas[1] = MultiplicadorDañoEspecial;
        
    }
    
    public float getMultiplicadorDefensa() {
        
        return estadisticas[2];
        
    }
    
    public void setMultiplicadorDefensa(float MultiplicadorDefensa) {
        
        this.estadisticas[2] = MultiplicadorDefensa;
        
    }
    
    public float getMultiplicadorDefensaEspecial() {
        
        return estadisticas[3];
        
    }
    
    public void setMultiplicadorDefensaEspecial(float MultiplicadorDefensaEspecial) {
        
        this.estadisticas[3] = MultiplicadorDefensaEspecial;
        
    }

    @Override
    public String toString() {
        return "Clase{" + "identificador=" + identificador + ", nombre=" + nombre + ", tipoArmaPreferida=" + tipoArmaPreferida + ", multiplicadorAtaque=" + estadisticas[0] + ", multiplicadorAtaqueEspecial" + estadisticas[1] + ", multiplicadorDefensa" + estadisticas[2] + "multiplicadorDefensaEspecial" + estadisticas[3] + '}';
    }
    
    public float[] calcularBonificacionTipoArmaPreferida(Arma arma) {
        
        if (arma.getTipoArma().equals(tipoArmaPreferida)) {
            
            return new float[]{multiplicadorDañoTipoArmaPreferida * arma.getValorModificadorAtaque(), multiplicadorDañoEspecialTipoArmaPreferida, arma.getValorModificadorAtaqueEspecial()};
            
        }
        
        return new float[]{0, 0};
        
    }
    
}

package com.firstfantasy.datos;

public class Arma extends Objeto {
   private int dañoPorGolpe;
   private String tipo;

    public Arma(int dañoPorGolpe, int id, String nombre, String tipo) {
        super(id, nombre);
        this.dañoPorGolpe = dañoPorGolpe;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " (Daño por golpe: " + dañoPorGolpe + ", Tipo: " + tipo + ")";
    }

    
    
    
    
    /**
     * @return the dañoPorGolpe
     */
    public int getDañoPorGolpe() {
        return dañoPorGolpe;
    }

    /**
     * @param dañoPorGolpe the dañoPorGolpe to set
     */
    public void setDañoPorGolpe(int dañoPorGolpe) {
        this.dañoPorGolpe = dañoPorGolpe;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

package com.firstfantasy.personajes;

import com.firstfantasy.objetos.Pocion;
import com.firstfantasy.objetos.Arma;
import java.util.ArrayList;

public abstract class Personaje {

    private int identificador;
    private String nombre;
    private int[] estadisticas;
    private Raza raza;
    private Clase clase;
    private Arma armaEquipada;
    private ArrayList<Habilidad> habilidades;
    private Inventario inventario;

    public Personaje(int identificador, String nombre, int vida, int energia, int atributoAtaque, int atributoAtaqueEspecial, int atributoDefensa, int atributoDefensaEspecial, Raza raza, Clase clase, Arma armaEquipada, ArrayList<Habilidad> habilidades, ArrayList<Arma> armas, ArrayList<Pocion> pociones) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.estadisticas = new int[]{vida, energia, atributoAtaque, atributoAtaqueEspecial, atributoDefensa, atributoDefensaEspecial};
        this.raza = raza;
        this.clase = clase;
        this.armaEquipada = armaEquipada;
        this.habilidades = habilidades;
        this.inventario = new Inventario(armas, pociones);
    }

    public void atacarFisicamente(Personaje objetivo) {
        
        objetivo.recibirDañoFisico((int)(estadisticas[2] * raza.getMultiplicadorDaño() * clase.getMultiplicadorDaño() + armaEquipada.getValorModificadorAtaque() + clase.calcularBonificacionTipoArmaPreferida(armaEquipada)[0]));
        
    }
    
    public void recibirDañoFisico(int daño) {
        
        if (estadisticas[0] + estadisticas[4] - daño <= 0) {
            
            estadisticas[0] = 0;
            
        } else {
            
            estadisticas[0] = estadisticas[0] + estadisticas[4] - daño;
            
        }
        
    }
    
    public void usarPocion(int identificador) {
        
        int indice = buscarPocion(identificador);
        ArrayList<Pocion> pociones = inventario.getPociones();
        
        estadisticas[0] += pociones.get(indice).getValorModificadorAtaque();
        estadisticas[1] += pociones.get(indice).getValorModificadorEnergia();
        estadisticas[2] += pociones.get(indice).getValorModificadorAtaque();
        estadisticas[3] += pociones.get(indice).getValorModificadorAtaqueEspecial();
        estadisticas[4] += pociones.get(indice).getValorModificadorDefensa();
        estadisticas[5] += pociones.get(indice).getValorModificadorDefensaEspecial();
        
        pociones.remove(indice);
        inventario.setPociones(pociones);
        
    }

    public int buscarPocion(int identificador) {
        
        ArrayList<Pocion> pociones = inventario.getPociones();
        
        for (int i = 0; i < pociones.size(); i++) {
            
            if (pociones.get(i).getIdentificador() == identificador) {
                
                return i;
                
            }
            
        }
        
        return -1;
        
    }

}

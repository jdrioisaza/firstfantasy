package com.firstfantasy.personajes;

import com.firstfantasy.excepciones.HabilityNotFoundException;
import com.firstfantasy.excepciones.NotEnoughEnergyException;
import com.firstfantasy.excepciones.PotionNotFoundException;
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

    private String tipo;

    public Personaje(int identificador, String nombre, int vida, int energia, int atributoAtaque, int atributoAtaqueEspecial, int atributoDefensa, int atributoDefensaEspecial, Raza raza, Clase clase, Arma armaEquipada, ArrayList<Habilidad> habilidades, ArrayList<Arma> armas, ArrayList<Pocion> pociones, String tipo) {
        this.identificador = identificador;
        this.nombre = nombre;
        if (vida < 0 || energia < 0 || atributoAtaque < 0 || atributoAtaqueEspecial < 0 || atributoDefensa < 0 || atributoDefensaEspecial < 0) {
            
            throw new IllegalArgumentException("Los estadísticas del personaje no pueden ser negativas");
            
        }
        this.estadisticas = new int[]{vida, energia, atributoAtaque, atributoAtaqueEspecial, atributoDefensa, atributoDefensaEspecial};
        this.raza = raza;
        this.clase = clase;
        this.armaEquipada = armaEquipada;
        this.habilidades = habilidades;
        this.inventario = new Inventario(armas, pociones);
        this.tipo=tipo;
    }

    public void atacarFisicamente(Personaje objetivo) {
        
        objetivo.recibirDañoFisico((int)(estadisticas[2] * raza.getMultiplicadorDaño() * clase.getMultiplicadorDaño() + armaEquipada.getValorModificadorAtaque() + clase.calcularBonificacionTipoArmaPreferida(armaEquipada)[0]));
        
    }
    
    public void recibirDañoFisico(int daño) {
        
        reducirVida((estadisticas[4] - daño < 0) ? daño - estadisticas[4] : 0);
        
    }
    
    public void usarHabilidad(Personaje objetivo, int identificadorHabilidad) throws NotEnoughEnergyException, HabilityNotFoundException {
        
        Habilidad habilidad = buscarHabilidad(identificadorHabilidad);
        
        if (estadisticas[1] > habilidad.getCostoEnergia()) {
            
            reducirEnergia(habilidad.getCostoEnergia());
            objetivo.recibirHabilidad(habilidad);
            
        } else {
            
            throw new NotEnoughEnergyException("No tienes suficiente energía para usar esa habilidad");
            
        }
        
    }
    
    public void recibirHabilidad(Habilidad habilidad) {
        
        reducirVida((estadisticas[5] - habilidad.getValorModificadorVida() < 0) ? habilidad.getValorModificadorVida() - estadisticas[5] : 0);
        reducirEnergia(habilidad.getValorModificadorEnergia());
        reducirAtaque(habilidad.getValorModificadorAtaque());
        reducirAtaqueEspecial(habilidad.getValorModificadorAtaqueEspecial());
        reducirDefensa(habilidad.getValorModificadorDefensa());
        reducirDefensaEspecial(habilidad.getValorModificadorDefensaEspecial());
        
    }
    
    public Habilidad buscarHabilidad(int identificador) throws HabilityNotFoundException {
        
        for (Habilidad habilidad : habilidades) {
            
            if (habilidad.getIdentificador() == identificador) {
                
                return habilidad;
                
            }
            
        }
        
        throw new HabilityNotFoundException("No existe ninguna habilidad con ese identificador");
        
    }
    
    public void reducirVida(int valorModificador) {
        
        if (estadisticas[0] - valorModificador < 0) {
            
            estadisticas[0] = 0;
            
        } else {
            
            estadisticas[0] -= valorModificador;
            
        }
        
    }
    
    public void reducirEnergia(int valorModificador) {
        
        if (estadisticas[1] - valorModificador < 0) {
            
            estadisticas[1] = 0;
            
        } else {
            
            estadisticas[1] -= valorModificador;
            
        }
        
    }
    
    public void reducirAtaque(int valorModificador) {
        
        if (estadisticas[2] - valorModificador < 0) {
            
            estadisticas[2] = 0;
            
        } else {
            
            estadisticas[2] -= valorModificador;
            
        }
        
    }
    
    public void reducirAtaqueEspecial(int valorModificador) {
        
        if (estadisticas[3] - valorModificador < 0) {
            
            estadisticas[3] = 0;
            
        } else {
            
            estadisticas[3] -= valorModificador;
            
        }
        
    }
    
    public void reducirDefensa(int valorModificador) {
        
        if (estadisticas[4] - valorModificador < 0) {
            
            estadisticas[4] = 0;
            
        } else {
            
            estadisticas[4] -= valorModificador;
            
        }
        
    }
    
    public void reducirDefensaEspecial(int valorModificador) {
        
        if (estadisticas[5] - valorModificador < 0) {
            
            estadisticas[5] = 0;
            
        } else {
            
            estadisticas[5] -= valorModificador;
            
        }
        
    }
    
    public void usarPocion(int identificador) throws PotionNotFoundException {
        
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

    public int buscarPocion(int identificador) throws PotionNotFoundException {
        
        ArrayList<Pocion> pociones = inventario.getPociones();
        
        for (int i = 0; i < pociones.size(); i++) {
            
            if (pociones.get(i).getIdentificador() == identificador) {
                
                return i;
                
            }
            
        }
        
        throw new PotionNotFoundException("No existe ninguna poción con ese identificador");
        
    }

}

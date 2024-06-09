package com.firstfantasy.persistencia;

import com.firstfantasy.datos.Videojuego;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {
    
    public void guardar(Videojuego videojuego, String nombreArchivo) throws FileNotFoundException, IOException{
        
        FileOutputStream archivo = new FileOutputStream(nombreArchivo);    
        ObjectOutputStream guardar = new ObjectOutputStream(archivo);
        guardar.writeObject(videojuego);
        archivo.close();
        guardar.close();
        
    }
    
    public Videojuego cargar(String nombreArchivo) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        FileInputStream archivo = new FileInputStream(nombreArchivo);
        ObjectInputStream cargar = new ObjectInputStream(archivo);
        Videojuego videojuego = (Videojuego)cargar.readObject();
        archivo.close();
        cargar.close();
        return videojuego;
        
    }
    
}

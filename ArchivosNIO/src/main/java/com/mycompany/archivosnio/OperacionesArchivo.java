/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.archivosnio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *Crear un directorio, añadir un archivo al directorio y añadir contenido al archivo
 * @author FERMIN
 */
public class OperacionesArchivo {
    public void crearDirectorio(){
        Path path=Paths.get("E:\\programacionIII");
        try{
            if(!Files.exists(path)){
                Files.createDirectory(path);
                System.out.println("Directorio creado...");
            }
            else{
                System.out.println("Ya existe el directorio");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void crearArchivo(){
        Path path=Paths.get("E:\\programacionIII\\miArchivo.txt");
        try{
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("Archivo creado...");
            }
            else{
                System.out.println("Ya existe el archivo");
                //agregando el contenido al archivo creado anteriormente
                Files.write(path,"Creando archivo JAVA 8".getBytes(),StandardOpenOption.APPEND);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    
    
    
}

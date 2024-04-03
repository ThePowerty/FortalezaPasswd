/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccc.dam.password;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * Se limita a leer la configuracion, tan solo el umbral de aceptación automática.
 *
 * @author Williams
 */
public class Configuracion {
    
    private static final String FICHERO_CONFIGURACION = "./config.properties";
    
    private static final int UMBRAL_POR_DEFECTO = 8;
    
    private static final String UMBRAL_CLAVE = "umbralFortaleza";
    
    private Properties configuracion;
    
    
    
    private void cargar() {
        configuracion = new Properties();
        
        File file = new File(FICHERO_CONFIGURACION);
        try (FileReader configReader = new FileReader(file)) {
            configuracion.load(configReader);
        } catch(IOException e) {
            //Do nothing
        }
    }
    
    public Configuracion() {
          cargar();                
    }
    
    public int getUmbralFortalezaPermitido() {
        try {
            return Integer.parseInt(configuracion.getProperty(UMBRAL_CLAVE));
        } catch(Exception e) {
            return UMBRAL_POR_DEFECTO;
        }
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccc.dam.password;

/**
 * 
 * La clase calificador se limita a, dados los puntos de una contraseña, decirnos su nivel de fortaleza y si 
 * pasa del nivel aceptable. Como veis el nivel aceptable (que por defecto es 8) se obtiene de la configuración.
 * 
 * Como podeis ver la clase Calificador no se preocupa de como se calculan los puntos ni de como obtiene la 
 * configuración el nivel aceptable
 * 
 * Como os decia en la sesión, cada clase es independiente y se ocupa de una cosa
 * 
 * 
 * @author Williams
 */
public class Calificador {
           
    private final int umbralAceptacion;
    
   
    //Enum que contiene los valores posible de fortaleza
    public enum Fortaleza {
        
            MUY_DEBIL("Muy debil", 5),
            DEBIL("Debil", 10),
            MODERADA("Moderada", 15),
            FUERTE("Fuerte", 20),
            MUY_FUERTE("Muy Fuerte", 25);
                    
        
        private final String description;
        private final int severity;
        
        private Fortaleza(String description, int severity) {
            this.description = description;
            this.severity = severity;
        }


        public String getDescription() {
            return description;
        }
        
        public int getSeverity() {
            return severity;
        }
            
    }
    
    public Calificador(Configuracion config) {
        this.umbralAceptacion = config.getUmbralFortalezaPermitido();
    }
            
    public boolean isAceptable(int puntuacion) {
        return puntuacion >= umbralAceptacion;
    }
    
    public Fortaleza calificar(int puntuacion) {
        switch (puntuacion) {
            case 0:
            case 1:
            case 2:
                return Fortaleza.MUY_DEBIL;
            case 3:
            case 4:
            case 5:
                return Fortaleza.DEBIL;
            case 6:
            case 7:
                return Fortaleza.MODERADA;
            case 8: 
            case 9:
                return Fortaleza.FUERTE;
            case 10:
                return Fortaleza.MUY_FUERTE;
            default :
                throw new RuntimeException(("Puntuacion fuera de rango"));
        }
    }
    
}

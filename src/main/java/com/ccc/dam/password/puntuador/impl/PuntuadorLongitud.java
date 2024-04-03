/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccc.dam.password.puntuador.impl;

import com.ccc.dam.password.puntuador.Puntuador;

/**
 *
 * @author Williams
 */
public class PuntuadorLongitud implements Puntuador {
   
        @Override
        public Integer apply(String password) {
            
            int puntos;
            
            if (password.length() < 7) {
                puntos = 0;
            }  else if (password.length() < 9) {
                puntos = 1;
            } else if (password.length() < 13) {
                puntos = 2;
            } else {
                puntos = 3;
            }
                        
            return puntos;
        }                            
}

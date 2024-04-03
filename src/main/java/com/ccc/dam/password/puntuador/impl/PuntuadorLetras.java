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
public class PuntuadorLetras implements Puntuador {


    @Override
    public Integer apply(String password) {
        
        int puntos = 0;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                puntos = 1;
                break;
            }
        }

        
        return puntos;

    }
}

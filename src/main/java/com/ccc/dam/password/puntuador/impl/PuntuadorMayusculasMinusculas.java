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
public class PuntuadorMayusculasMinusculas implements Puntuador{
    
    @Override
    public Integer apply(String password) {
        boolean containsUpper = false;
        boolean containsLower = false;
        int puntos;
        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                containsUpper = true;
            } else if (Character.isLowerCase(c)) {
                containsLower = true;
            }

            if (containsLower && containsUpper) {
                break;
            }
        }

        if (containsLower && containsUpper) {
            puntos = 2;
        } else {
            puntos = 0;
        }

        return puntos;

    }
}

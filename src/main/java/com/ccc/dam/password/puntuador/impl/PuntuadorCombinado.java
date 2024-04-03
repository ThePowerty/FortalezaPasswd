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
public class PuntuadorCombinado implements Puntuador {

    @Override
    public Integer apply(String password) {
        
        Puntuador puntuadorLongitud = new PuntuadorLongitud();
        Puntuador puntuadorLetras = new PuntuadorLetras();
        Puntuador puntuadorMayusculasMinusculas = new PuntuadorMayusculasMinusculas();
        Puntuador puntuadorNumeros = new PuntuadorNumeros();
        Puntuador puntuadorSimbolos = new PuntuadorSimbolos();
                                                
        int total = puntuadorLongitud.apply(password)                
                + puntuadorLetras.apply(password)
                + puntuadorMayusculasMinusculas.apply(password)
                + puntuadorNumeros.apply(password)
                + puntuadorSimbolos.apply(password);

        //NOTA: Cuando todos los puntuadores dan la maxima nota, al final obtendo 9 y por tanto le doy la puntuación 
        if (total == 9) {
            total++;
        }
        return total;
    }

}

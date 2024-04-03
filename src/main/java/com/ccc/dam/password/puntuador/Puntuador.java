/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccc.dam.password.puntuador;


import java.util.function.Function;

/**
 *
 *  Definimos una interfaz puntuador que hereda de Function y toma como entrada un String (el password) y devuelve
 *  un entero (una puntuacion).
 * 
 *  Cada clase que implemente esta interfaz analiza en password y devuelve los puntos asignados en razón de su criterio particular
 *  así por ejemplo, un puntuador de Numeros comprobará si el password tiene números y devolverá los puntos (0 o 1) que corresponden 
 *  a ese criterio.
 * 
 *  Las implementaciones particulares de puntuador las teneis en el paquete com.ccc.dam.password.puntuador.impl
 * 
 *  PuntuadorLetras: Nos da la puntuación (0 o 1) correspondiente al criterio tiene letras
 *  PuntuadorLongitud: Nos da la puntuación (0, 1, 2, 3) correspondiente al criterio de longitud
 * 
 *  etc
 * 
 *  PuntuadorCombinado: Es el que se usa para calcular los puntos totales. Hace uso de todos los demás puntuadores
 * 
 * Como podeis ver, los puntuadores solo se preocupan de puntuar, no saben nada de fortaleza.
 * 
 * 
 * 
 * @author Williams
 */
@FunctionalInterface
public interface Puntuador extends Function<String, Integer> {

}

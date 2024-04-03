/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ccc.dam.password;

import com.ccc.dam.password.puntuador.Puntuador;
import com.ccc.dam.password.Calificador.Fortaleza;
import com.ccc.dam.password.puntuador.impl.PuntuadorCombinado;
import java.util.Scanner;

/**
 * La clase principal y metodo main hacen lo mínimo: Leer la entrada de usuario, dar los mensajes y delega en el resto 
 * de las clases los calculos.
 * 
 * El objetivo es que sea muy sencillo retirar la entrada por consola y cambiarlo por una interfaz gráfica.
 * 
 * 
 * @author Williams
 */
public class FortalezaPassword {

    public static void main(String[] args) {
        
        Scanner consoleInput = new Scanner(System.in);
        
        
        
        boolean aceptable = false;
        
        Calificador calificador = new Calificador(new Configuracion());
        Puntuador puntuadorCombinado = new PuntuadorCombinado();
        
        while (!aceptable) {
            System.out.print("Introduce tu password: ");
            String password = consoleInput.nextLine();
            int puntuacion = puntuadorCombinado.apply(password);
            Fortaleza fortaleza = calificador.calificar(puntuacion);
            System.out.println("La fortaleza de tu contraseña es : " + fortaleza.getDescription() + "(" + puntuacion + ")");
            aceptable = calificador.isAceptable(puntuacion);
            if (!aceptable) {
                System.out.print("Tu contraseña no es suficientemente fuerte. ¿Quieres aceptarla (SI/NO)?: ");
                String aceptar = consoleInput.nextLine();
                aceptable = aceptar.toUpperCase().equals("SI");
            }
            
        }
            
        System.out.println("Contraseña aceptada");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intercambiovalores;

/**
 *
 * @author Camila
 */
public class IntercambioValores {

    public static void main(String[] args) {
        int h = 35;
        int h2 = 20;
        
        System.out.println(" El valor de h es: " + h + " y el valor de h2 es: " + h2);
        
        int h3;
        
        h3 = h2;
        h2= h;
        h = h3;
        
        System.out.println(" El valor de h es: " + h + " y el valor de h2 es: " + h2);
    }
}

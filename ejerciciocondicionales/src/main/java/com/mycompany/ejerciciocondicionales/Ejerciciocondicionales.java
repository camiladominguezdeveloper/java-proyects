/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocondicionales;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ejerciciocondicionales {

    public static void main(String[] args) {
        
        double sueldo = 0;
        int categoria;
        
        System.out.println("Ingrese el tipo de categoría que desea calcular el sueldo");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if(categoria == 1) {
            sueldo = 15890 + (15890*0.10);
        } 
        else {
            if (categoria == 2) {
                sueldo = 25630.89;
            } 
            else {
                if (categoria == 3) {
                    sueldo = 35560.20 - (35560.20*0.11);
                }
                else {
                    System.out.println("Debe ingresar un número de categoría válido");
                }
            }
        }
        if (categoria ==1 || categoria == 2 || categoria == 3) {
        System.out.println("El total del sueldo para la categoría seleccionada " + categoria + " es de " + sueldo);
    }
    }
}

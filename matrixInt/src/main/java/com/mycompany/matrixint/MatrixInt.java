/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixint;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MatrixInt {

    public static void main(String[] args) {
        int vector [] = new int [15];
        Scanner teclado = new Scanner (System.in);
        
        for (int i=0; i<vector.length; i++) {
            System.out.println("Ingrese el valor para el índice " + i);
            vector[i] = teclado.nextInt();
        }
        
        int contador = 0;
        
        for (int i=0; i<vector.length; i++) {
            if (vector[i] == 3) {
                contador++;
//                tambien podemos sumar 1 al contador escribiendo contador = contador + 1
            }
        }
        
        System.out.println("La cantidad de veces que aparece el número 3 en el vector es " + contador);
    }
}

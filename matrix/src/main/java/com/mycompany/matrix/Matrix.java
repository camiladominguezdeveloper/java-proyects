/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrix;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Matrix {

    public static void main(String[] args) {
        int matriz [][] = new int [3][3];
        
        Scanner teclado = new Scanner (System.in);
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++) {
                System.out.println("Ingrese el valor de la posición f: " + f + " c: " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }
        
        for (int f=0; f<3; f++) {
            for(int c=0; c<3; c++) {
                System.out.println("El valor de la posición f: " + f + " c: " + c);
                System.out.println("es de: " + matriz[f][c]);
            }
        }
    }
}

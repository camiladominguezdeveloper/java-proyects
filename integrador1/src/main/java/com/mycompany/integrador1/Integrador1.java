/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.integrador1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Integrador1 {

    public static void main(String[] args) {
        double notas [][] = new double [4][4];
        
        Scanner teclado = new Scanner (System.in);
        
        for (int f = 0; f<4; f++) {
            for (int c = 0; c<3; c++) {
                int col = c+1;
                int al = f+1;
                System.out.println("Ingrese la nota " + col + " del alumno " + al);
                notas[f][c] = teclado.nextDouble();
            }
        }
        
        for (int f = 0; f<4; f++) {
            notas[f][3] = 0;
            for (int c = 0; c<3; c++) {
                notas[f][3] = notas [f][3] + notas[f][c];
            }
            notas[f][3] = notas[f][3]/3;
        }
        
        for (int f = 0; f<4; f++) {
            int al = f+1;
            System.out.println("Las notas del alumno " + al + " son: ");
            for(int c = 0; c<3; c++) {
                System.out.println(notas[f][c]);
            }
            System.out.println("Y su promedio es: " + notas[f][3]);
        }
    }
}

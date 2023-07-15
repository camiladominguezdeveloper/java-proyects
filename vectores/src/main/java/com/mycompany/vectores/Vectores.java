/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vectores;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Vectores {

    public static void main(String[] args) {
        int vector [] = new int [4];
        
        Scanner teclado = new Scanner (System.in);
        
        for (int i=0; i<vector.length; i++) {
            System.out.println("Ingrese el valor para el índice " + i);
            vector[i] = teclado.nextInt();
        }
        
        for (int i=0; i<vector.length; i++) {
            System.out.println("Estoy en el índice: " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("------------------");
        }
    }
}

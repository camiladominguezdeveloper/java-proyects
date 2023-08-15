/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ImprimePalabras2 {

    public static void main(String[] args) {
        System.out.println("Ingrese una palabra");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.next();
        
        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es " + palabra);
            System.out.println("Ingrese una palabra");
            palabra = teclado.next();
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalif;

/**
 *
 * @author Camila
 */
public class CondicionalIf {

    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        
        if (num2 > num1) {
            System.out.println("El num2 es mayor al num1");
        }
        else {
            
           if (num1 == num2){
            System.out.println("num1 y num2 son iguales");
           }
           else{
               System.out.println("El num1 es mayor al num2");
           }
        }
    }
}

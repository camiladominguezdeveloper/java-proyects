/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Camila
 */
public class LinkedLists {

    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<> ();
        
        //Agregar al final de la lista
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Carlos", 45));
        lista.add(new Persona(3, "Mariano", 15));
        lista.add(new Persona(4, "Valeria", 23));
        
        //Agregar al inicio de la lista
        lista.add(0, new Persona(5, "Malen", 34));
       
        //recorrer por indice
        System.out.println("-------------FOR--------------");
        for(int i=0; i<lista.size(); i++){
            System.out.println("prueba: " + lista.get(i).getNombre());
        }
        
        //recorrido foreach
        System.out.println("-------------FOR EACH--------------");
        for(Persona perso:lista){
            System.out.println("prueba: " + perso.getNombre());
        }
    }
}

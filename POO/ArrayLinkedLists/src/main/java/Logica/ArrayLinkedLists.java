/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Camila
 */
public class ArrayLinkedLists {

    public static void main(String[] args) {
        LinkedList<Persona> listaLinked = new LinkedList<> ();
        List<Persona> listaArray = new ArrayList<> ();
        
        //Agregar al final de la lista Linked
        listaLinked.add(new Persona(1, "Luisina", 30));
        listaLinked.add(new Persona(2, "Carlos", 45));
        listaLinked.add(new Persona(3, "Mariano", 15));
        listaLinked.add(new Persona(4, "Valeria", 23));
      
        //Agregar al final de la lista Array
        listaArray.add(new Persona(1, "Luisina", 30));
        listaArray.add(new Persona(2, "Carlos", 45));
        listaArray.add(new Persona(3, "Mariano", 15));
        listaArray.add(new Persona(4, "Valeria", 23));
        
        //Remove en ArrayList
        listaArray.remove(1);
        
        //Remove en LinkedList
        String nombreBorrar = "Carlos";
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona2);
                break;
            }
        }
        
        //recorrido foreach Linked
        System.out.println("-------------FOR EACH--------------");
        for(Persona perso:listaLinked){
            System.out.println("prueba: " + perso.getNombre());
        }
        
        //recorrido foreach Array
        System.out.println("-------------FOR EACH--------------");
        for(Persona perso:listaArray){
            System.out.println("prueba: " + perso.getNombre());
        }
        
        //Método Tamaño de la lista
        System.out.println("Qué tamaño tienen las listas?");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        //Obtener primer y último objeto
        System.out.println("PRIMER y último OBJETO (solo para LINKED LIST)");
        System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Último de LinkedList: " + listaLinked.getLast().toString());
        
        //BORRAR toda la lista
        System.out.println("Borrando listas");
        listaArray.clear();
        listaLinked.clear();
        
        //Comprobar si está vacía la lista
        System.out.println("Está vacía alguna lista?");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
       
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

/**
 *
 * @author Camila
 */
public class EjercicioIntegrador {

    public static void main(String[] args) {
        Squirtle squir = new Squirtle();
        Charmander charma = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        squir.atacarAraniazo();
        squir.atacarHidrobomba();
        charma.atacarAraniazo();
        charma.atacarLanzallamas();
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
    }
}

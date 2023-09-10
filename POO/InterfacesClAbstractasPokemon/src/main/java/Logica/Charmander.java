/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Camila
 */
public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ataca con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander ataca con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander ataca con Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataca con Puño Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ataca con Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataca con Ascuas");
    }
    
}

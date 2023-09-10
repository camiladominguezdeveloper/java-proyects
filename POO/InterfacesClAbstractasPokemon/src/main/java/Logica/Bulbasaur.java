/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Camila
 */
public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur ataca con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur ataca con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur ataca con Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur ataca con Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur ataca con Paralizar");
    }
    
}

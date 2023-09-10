/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Camila
 */
public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle ataca con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle ataca con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle ataca con Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataca con Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca con Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataca con Pistola de Agua");
    }
    
}

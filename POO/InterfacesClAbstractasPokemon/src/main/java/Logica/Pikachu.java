/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Camila
 */
public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu ataca con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu ataca con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu ataca con Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu ataca con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu ataca con Puño Trueno");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claabstractas;

/**
 *
 * @author Camila
 */
public abstract class Figura {
    
    protected double x; //posición en x
    protected double y; //posición en y

    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    public abstract double calcularArea();
    
}

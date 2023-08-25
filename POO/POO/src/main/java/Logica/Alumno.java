/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Camila
 */
public class Alumno {
    
    int id;
    String nombre;
    String apellido;
    
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
    public void saberAprobado(double calificacion) {
    if(calificacion >= 6) {
        System.out.println("Aprobé la materia");
    } else {
        System.out.println("Uyy, no aprobé");
    }
    }
    
}

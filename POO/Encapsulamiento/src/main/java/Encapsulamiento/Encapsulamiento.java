/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Encapsulamiento;

/**
 *
 * @author Camila
 */
public class Encapsulamiento {

    public static void main(String[] args) {
        
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Candelaria", "Remorino");
        
        System.out.println("id: " + alu2.getId());
        System.out.println("nombre: " + alu2.getNombre());
        System.out.println("apellido: " + alu2.getApellido());
        
    }
}

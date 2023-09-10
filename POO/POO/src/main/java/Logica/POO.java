/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

/**
 *
 * @author Camila
 */
public class POO {

    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Luisina", "de Paula");
        
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        
        alu1.setId(8);
        alu1.setNombre("Francisca");
        alu1.setApellido("Sotto");
        
        System.out.println("----------------");
        
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());
        
        System.out.println("-----------------");
        alu2.setId(35);
        
        System.out.println("-----------------");
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        
    }
}

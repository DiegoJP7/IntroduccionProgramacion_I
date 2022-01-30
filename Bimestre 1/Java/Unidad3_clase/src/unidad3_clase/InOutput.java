/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3_clase;

/**
 *
 * @author diegojp
 */
public class InOutput {
    
    public static void main(String[] args) {
        
        String nombre = "Diego";
        int edad = 19;
        double estatura = 1.81;
        String empresa = "UTPL";
        
        System.out.println("Mi nombre es: " +nombre);
        System.out.println("La edad es:"  +edad);
        System.out.println("La estatura es:"  +estatura);
        System.out.println("Trabaja en: "  +empresa);
        
        System.out.println("---System.out.print---");
        
        System.out.print("Mi nombre es: " +nombre);
        System.out.print("La edad es:"  +edad);
        System.out.print("La estatura es:"  +estatura);
        System.out.print("Trabaja en: "  +empresa);
        
        System.out.println("---System.out.printlnf---");
        
        System.out.printf("Mi nombre es %s, tengo %d años, mido %f"
                + " y trabajo en la %s \n", nombre, 
                edad, 
                estatura, 
                empresa);
    }
    
}

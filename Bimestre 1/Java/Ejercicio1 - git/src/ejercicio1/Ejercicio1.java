/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author diegojp
 */
public class Ejercicio1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        double duraLlam;
        double costMinuto;
        double cosTotal;
        
        String nombre;
        
        System.out.println("--Programa para calcular el costo total de una llamada-- \n");
        System.out.println("Ingresar el nombre del usuario");
        nombre = leer.next();
        
        //Ingresar datos
        System.out.println("Ingresar el tiempo de llamada en minutos: ");
        duraLlam = leer.nextDouble();
        
        System.out.println("Ingresar el valor de la llamada por minutos: ");
        costMinuto = leer.nextDouble();
        
        //Proceso

        cosTotal = duraLlam * costMinuto;
        
        
        System.out.println("La duracion de la llamada es: " + duraLlam + "\n");
        System.out.println("El costo por minuto de la llamada es:  " +costMinuto+ "\n");
        System.out.println("El costo total de la llamada es:    " +cosTotal+ "\n");
        
                
    
               
        
                
    }
    
}

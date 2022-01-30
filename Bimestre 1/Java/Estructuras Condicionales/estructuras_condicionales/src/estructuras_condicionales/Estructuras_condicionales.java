/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras_condicionales;
import java.util.Scanner;


/**
 *
 * @author diegojp
 */
public class Estructuras_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        //Declaracacion de variables 
        
        int num = 0;
        
        //Entrada de datos
        System.out.println("Estructuras logicas condicionales simples");
        System.out.println("Programa para verificar si un numero es par");
        
        System.out.println("Ingrese un numero para verificar: ");
        num = leer.nextInt();
        /*
                if (num %2 == 0) {
            System.out.println("El numero " +num + " es par" );
            if ((num %2 == 0) && (num > 0)){
                System.out.println("El numero " +num + " es par y positivo");
            }
        
    }
        else{ 
            System.out.println("El numero "+num +" es impar" );
        }*/
    
        //Proceso
        if (num %2 == 0) {
            System.out.println("El numero " +num + " es par" );
            if ((num %2 == 0) && (num > 0)){
                System.out.println("El numero " +num + " es par y positivo");
            }
        
    }
        else{ 
            System.out.println("El numero "+num +" es impar" );
        }   
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Psitivo {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         //Declaracacion de variables
        int num1=0;
        
        
        //Ingreso de datos
         System.out.println("Programa para verificar si un numero es positivo o negativo");
         System.out.println("Ingrese un numero para verificar: ");
         num1 = leer.nextInt();
         
         //Proceso
         if (num1 >=0){
             System.out.println("El numero es positivo");
         }
         else{
             System.out.println("El numero es negativo");
         }
                 
         
        
     }
        // TODO code application logic here
        
        
        
    
}

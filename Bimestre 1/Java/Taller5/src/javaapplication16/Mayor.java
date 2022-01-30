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
public class Mayor {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            //Declare las variables 
            double num1, num2;
            num1=0;num2=0;
            
            //Ingreso de datos
            System.out.println("Programa para verificar si un numero es mayor o menor a otro numero");
        
            System.out.println("Ingrese el primer numero para verificar: ");
            num1 = leer.nextDouble();
            System.out.println("Ingrese el segundo numero verificar: ");
            num2 = leer.nextDouble();
            
            //Proceso
            if(num1 > num2){
                System.out.println("El numero "+num1+ " es mayor al numero "+num2);
            }
            else{
                System.out.println("El numero "+num2+ " es mayor al numero "+num1);
            }
          
            
        }
        
    
}

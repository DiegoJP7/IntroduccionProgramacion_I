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
            double num1, num2,num3;
            num1=0;num2=0;num3=0;
            
            //Ingreso de datos
            System.out.println("Programa para verificar cual es el mayor de 3 numeros");
        
            System.out.println("Ingrese el primer numero para verificar: ");
            num1 = leer.nextDouble();
            System.out.println("Ingrese el segundo numero verificar: ");
            num2 = leer.nextDouble();
            System.out.println("Ingrese el tercer numero verificar: ");
            num3 = leer.nextDouble();
            
            //Proceso
            if((num1 > num2)&&(num1 > num3)){
                System.out.println("El numero "+num1+ " es mayor al numero "+num2+ " y al " +num3); 
            }
            else{
                if (num2>num3){
                    System.out.println("El numero "+num2+ " es mayor al numero "+num1+ " y al " +num3);
                }
                else{
                    System.out.println("El numero "+num3+ " es mayor al numero "+num1+ " y al " +num2);
                }
            }
           
                
                
                
                
            
       
            
          
            
        }
        
    
}

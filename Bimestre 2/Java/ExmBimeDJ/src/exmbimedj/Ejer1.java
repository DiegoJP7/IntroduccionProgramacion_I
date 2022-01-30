/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmbimedj;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //Variables
        int num,opc;
        
        //Proceso
        System.out.println("Ingrese el número a verificar:");
        num = leer.nextInt();
        System.out.println("Seleccione la opción a realizar");
        System.out.println("1. Verificar si es par o impar");
        System.out.println("2. Verificar si es positivo o negativo");
        System.out.println("3. Verificar si es múltiplo de 3");
        System.out.println("4. Verificar si es primo");
        opc = leer.nextInt();
        
        switch (opc){
            case 1:{
            if(num%2==0){
                System.out.println("El numero es par");
            }
            else{
                System.out.println("El numero es impar");
            }
               
            }
            break;
            case 2:{
                if (num>0){
                    System.out.println("El numero ingresado es positivo");
                    
                }
                else{
                    System.out.println("El numero ingresado es negativo");
                }
            }
            break;
            case 3:{
                if(num%3==0){
                    System.out.println("El numero es multiplo de 3:");
                    
                }
                else{
                    System.out.println("El numero no es multiplo de 3");
                }
            }
            break;
            case 4:{
                if(num%2==0){
                    System.out.println("El numero ingresado no es un numero primo");
                }
                else{
                    System.out.println("El numero ingresado es un numero primo");
                }    
                
            }
            
        }
    }
    
}

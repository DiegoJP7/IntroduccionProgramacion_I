/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionfc1;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Problema3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         //Declaracion de variables
        int num1, num2, dif,multiplo;
        num1=0;num2=0;
        System.out.println("Programa para determinar si la diferencia entre los dos es un número divisor exacto de alguno de los dos números.\n");
        System.out.println("Ingrese el primer numero: ");
        num1= leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2= leer.nextInt();
        
        //Proceso
        if (num1>num2){
            dif = num1 - num2;
        }
        else{
            
            dif= num2 - num1;
            
        }
        multiplo=dif;
        System.out.println("La diferencia es: "+multiplo);
            
        
        if ((num1%multiplo == 0)||(num2%multiplo == 0)){
            System.out.println("La diferencia entre ambos numeros es un divisor de uno de los numeros");  
        }
        else {
            System.out.println("La diferencia de "+multiplo+" no es divisor para ninguno de los dos números ");
        }
        
    }
    
    
}

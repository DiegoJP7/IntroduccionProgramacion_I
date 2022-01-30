/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exmbimedj;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Variables
        int i,l,num1,num2;
        i=0;
        l=0;
        
        //proceso
        System.out.println("Programa para mostrar los múltiplos comprendidos entre dos número ingresados Ingrese el primer número: 20");
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextInt();
        
        
        if(num1>num2){
            l=num1;
            i=num2;
        }
        else{
            l=num1;
            i=num2;
        }
        for(i=1;i<=l;i+=1){
            if(i%3==0){
                
             System.out.println("Los múltiplos de 3 comprendidos entre 4 y 20 son:"+i);   
            }
            
        }
        
        
    }
    
}

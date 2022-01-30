/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaipdj;
import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Fibonacci {
    public static void main(String[] args){
 
        Scanner leer = new Scanner(System.in);
        //Variables
        int i,fib1,fib2,num;
        i=0;fib1=0;fib2=1;num=0;
  
        do{
            System.out.print("Ingrese el tamaño/limite de la serie: ");
            num = leer.nextInt();
            
        }while(num<=1);
  
        System.out.println("El " + num + " tiene como primeros numero de la serie Fibonacci" );                 

       

        
        for(i=1;i<=num;i++){
            
            System.out.print(fib2 +"\n" );
            fib2 = fib1 + fib2;
            fib1 = fib2 - fib1;

        }
        
    }
    
}

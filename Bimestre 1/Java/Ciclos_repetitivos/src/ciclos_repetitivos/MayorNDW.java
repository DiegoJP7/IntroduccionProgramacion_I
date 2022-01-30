/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_repetitivos;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class MayorNDW {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        int i, n,num,mayor,menor;
        i=1;n=0;num=0;mayor=0;menor=0;
        //Ingrese los datos
        System.out.println("\n***Encontrar el numero mayor de N numerosque ingrese el usuario. \n");
        System.out.println("Ingrese el limite de los numeros:");
        n = leer.nextInt();
        do{
            System.out.println("\n Ingrese un numero: ");
            num = leer.nextInt();
            if(num>mayor){
            mayor=num;    
            }
            i=i+1;
        }while(i<=n);
        System.out.println("El numero mayor de los valoes es " +mayor);
        
        System.out.println("\n*** Encontrar el numero menor de N");
        for(i=1; i<=n; i++){
            System.out.println("Ingrese el numero");
            num = leer.nextInt();
            
            if(i==1){
                menor = num;
                
            }
            System.out.println("**menor<- "+menor);
            if(num<menor){
                menor=num;
                
            }
            System.out.println("El numero menor es: "+menor);
        }
        
        
        
        
         
    }
        
    
}

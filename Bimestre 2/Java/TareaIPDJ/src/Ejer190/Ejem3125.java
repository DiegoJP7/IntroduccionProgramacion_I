/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer190;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Ejem3125 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int suma,i;
        suma=0;
        //Proceso
        for (i=1;i<=999;i=i+1){
            if(i%3==0 || (i%5==0)){
                suma=suma+i;  
            }   
           
        }
        
        System.out.println("Respuesta es: "+suma);
        
    }
    
}

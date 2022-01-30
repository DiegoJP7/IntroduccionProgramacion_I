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
public class Ejer4 {
    public static void main(String[] args) {
        //Variables 
         Scanner leer = new Scanner(System.in);
        int i,n,arriba,abajo,suma,suma1,l;
        i=2;n=1;arriba=1;abajo=7;suma=1;suma1=0;l=0;
        
        //Proceso
        System.out.println("Ingrese el limite:");
        n = leer.nextInt();
        System.out.println("("+arriba+"/"+abajo+")^"+i);
        while(i<=n){
            
            arriba=2;
            abajo=abajo+i+1;
            suma1=abajo*i;
            arriba=arriba;
            suma=arriba+arriba;
            i=i+2;
            l=l+1;
            
            System.out.println("("+arriba+"/"+abajo+")^"+i);
            
            
        }
        
        System.out.println("La suma es:"+suma+"/"+suma1);
    }
}

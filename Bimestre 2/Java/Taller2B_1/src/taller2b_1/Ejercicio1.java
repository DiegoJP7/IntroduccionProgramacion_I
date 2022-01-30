/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2b_1;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int n,i,aux,Ai,Bi;
        n=5;aux=0;Ai=0;Bi=0;
        int [] A = new int [n];
        int [] B = new int [n];
        for(i=0;i<n;i++){
            System.out.println("Ingresar los 5 Primeros Numeros del Vector A");
            A[i]=leer.nextInt();
            
        }
        System.out.println("--------------------------------------------");
        for(i=0;i<n;i++){
            System.out.println("Ingresar los 5 Primeros Numeros del Vector B");
            B[i]=leer.nextInt();
        }
        System.out.println("--------------------------------------------");
        System.out.println("***Vector original A *******");
        for(i=0; i<n; i++){
            
            System.out.println("A["+i+"]="+A[i]);

        }
        System.out.println("********Vector original B*********");
        for(i=0; i<n; i++){
            
            System.out.println("B["+i+"]="+B[i]);
        }

        for(i=0;i<n;i++){
            if((A[i]==B[i])&&(i==i)){
                System.out.println("El vector A y el vector B tienen el "
                        + "mismo numero "+A[i]+" y comparten la misma posicion en ["+i+"]");
            }
        }
    }
    
    
}

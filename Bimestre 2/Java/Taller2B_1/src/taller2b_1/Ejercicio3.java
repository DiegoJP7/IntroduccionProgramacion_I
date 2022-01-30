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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int i, n,mayor;
        n=0;mayor=0;
        System.out.println("Encontrar el número mayor dentro de un vector.");
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        int [] A = new int [n];
        
        System.out.println("Ingrese los terminos del vector");
        for(i=0; i<n; i++){
            System.out.println("A["+i+"]");
            A[i]=leer.nextInt();
            
        }
        //Presentar vector original
        System.out.println("Vector original");
        for(i=0; i<n; i++){
            System.out.println("A["+i+"]="+A[i]);
        }
        //Numero mayor
        for(i=0; i<n; i++){
            if(A[i]>mayor){
            mayor=A[i];    
            }
        }
        System.out.println("El numero mayor del vector es: "+mayor);
    }
    
}

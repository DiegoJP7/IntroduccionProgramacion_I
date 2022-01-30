/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class VectorParImp {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,i,aux;
        n=0;
        
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        System.out.println("----------------------------");
        int [] A = new int [n];
        int [] par = new int [n];
        int [] impar = new int [n];
        for(i=0; i<n; i++){
            System.out.println("Ingrese los terminos del vector");
            A[i]=leer.nextInt();
        
        }
        //Presentar vector original
        System.out.println("Vector original");
        for(i=0; i<n; i++){
            System.out.println("A["+i+"]="+A[i]);
        }
        for(i=0; i<n; i++){
                if(A[i]%2==0){
                aux=par[i];
                par[i]=A[i];
                System.out.println("Pares "+i+" : "+par[i]);
                
                
                
                }
                
        }
        System.out.println("------------------");
        for(i=1; i<n; i++){
            if(A[i]%2!=0){
                impar[i]=A[i];
                aux=impar[i];
                System.out.println("Impares "+i+" : "+impar[i]);
                
                }
        }

        
        
    }
}

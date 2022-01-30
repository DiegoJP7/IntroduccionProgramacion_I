/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Taller2Ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n,i,j,menor,k,e;
        n=0;i=0;j=0;k=0;e=0;
        
        
        System.out.println(" **** Leer una matriz de NxN e identificar en qué posiciones están los menores por fila. ****");
        System.out.println("Ingrese el tamaño de la matriz");
        n=leer.nextInt();
        
        int[][]A=new int[n][n];
        System.out.println("\n ingresar los terminos de la matriz");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                
                System.out.println("A["+i+"]["+j+"]=");
                A[i][j]=leer.nextInt();
            }
        }
        menor=A[1][1];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        
        for(i=0;i<n;i++){
            menor=A[i][0];
                for(j=0;j<n;j++){
                    if(A[i][j]<menor){
                        menor=A[i][j];
                        A[k][e]=A[i][j];

                    }
                    
                }
                System.out.println("el elemento menor de la fila "+i+" es "+menor+" y esta en "+A[k][e]);
                
                k=0;
                e=0;
            }
    }
}

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
public class Matrices3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, j;
        n=0;i=0;j=0;
        
        System.out.println("----Operaciones sobre matrices cuadradas");
        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        n=leer.nextInt();
        //Ingrese los elementos de la matriz
        int[][] A= new int[n][n];
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                
                System.out.print("A["+i+"]["+j+"]");
                A[i][j]=leer.nextInt();
            }
        System.out.println("La matriz A es:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                
                System.out.print(A[i][j]+" ");
                
            }
        }    
        }
        System.out.println("Cambiar por 0 la diagonal principal");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    A[i][j]=0;
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                
                System.out.print(A[i][j]+" ");
                System.out.print("");
            }
        }
        System.out.println("Cambiar por 1 la diagonal principal");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    A[i][j]=0;
                }
            }
        }
        System.out.println("Cambiar por 99 las esquinas de la matriz");
        A[0][0]=99;
        A[0][0]=99;
        A[0][0]=99;
        A[0][0]=99;
    }
    
}

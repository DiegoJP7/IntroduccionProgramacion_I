/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoipb2;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,k,i,j, suma;
        k=0; n=0;
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = leer.nextInt();


        
        
        int[][] A = new int [n][n];
        int[][] B = new int [n][n];
        int[][] C = new int [A.length][B.length];

        
            // Ingresar vector A
            System.out.println("Ingresar vector A");
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    System.out.print("A ["+i+"] ["+j+"] = ");
                    A[i][j] = leer.nextInt();
                }
            }
            //Ingresar vector B
            System.out.println("Ingresar vector B");
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    System.out.print("B ["+i+"] ["+j+"] = ");
                    B[i][j] = leer.nextInt();
                }
            }
        
            System.out.println("Vector A");
            //presentar vector A
            for(i=0; i<n; i++) {
                for(j=0; j<n ; j++) {
                    System.out.print(A[i][j] + "  ");
                }
                System.out.println(" ");
            }
            System.out.println("Vector B");
            // Presentar vector B
            for(i = 0; i<n; i++) {
                for(j = 0;j < n ; j++) {
                    System.out.print(B[i][j] + "  ");
                }
                System.out.println(" ");
            }
            System.out.println("Vector C");
            //Vector C
        
            suma=0;
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    for(k=0;k<(C.length);k++){
                         suma=((A[i][j])+(B[i][j]));
                         
                    }
                    C[i][j]= suma;
                    suma=0;
   
                }    
            }
                                
                           
                           
            // Presentar vector C
            for (i=0;i < n; i++) {
                for (j = 0; j < n ; j++) {
                    System.out.print(C[i][j] + "  ");
                }
                System.out.println(" ");
            }
        
    }
}

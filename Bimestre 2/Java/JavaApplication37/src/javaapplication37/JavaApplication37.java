/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication37;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner leer = new Scanner(System.in);
        int n,m, j,i;
        m=0; n=0;
        System.out.print("Ingrese el tamaño en filas de la matriz: ");
        n = leer.nextInt();
        System.out.print("Ingrese el tamaño en columnas de la matriz: ");
        m = leer.nextInt();
        int[][] A = new int [n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        
        for (i = 0; i < n; i++) {
            for (j = 0; j <m ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }    
        for (j = 0; j <m; j++) {
            for (i = 0;  i<n ; i++) {
                System.out.print(A[i][j] + "  ");
                
            }
            System.out.println(" ");
        }
    }
    
}

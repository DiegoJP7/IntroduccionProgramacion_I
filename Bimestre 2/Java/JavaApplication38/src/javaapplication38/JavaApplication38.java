/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner leer = new Scanner(System.in);
        int n,m, n1,m1,k,i,j, result, suma;
        m=0;k=0; n=0;n1=0;m1=0;
        System.out.print("Ingrese el tamaño en filas de la matriz: ");
        n = leer.nextInt();
        
        System.out.print("Ingrese el tamaño en columnas de la matriz: ");
        m = leer.nextInt();
        
        System.out.print("Ingrese el tamaño en filas de la matriz 2: ");
        n1 = leer.nextInt();
        
        System.out.print("Ingrese el tamaño en columnas de la matriz 2: ");
        m1 = leer.nextInt();
        int[][] A = new int [n][m];
        int[][] B = new int [n1][m1];
        int[][] C = new int [A.length][B.length];
        if(m==n1){
            // Ingresar vector A
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    System.out.print("A ["+i+"] ["+j+"] = ");
                    A[i][j] = leer.nextInt();
                }
            }
            //Ingresar vector B
            for(i=0;i<n1;i++){
                for(j=0;j<m1;j++){
                    System.out.print("B ["+i+"] ["+j+"] = ");
                    B[i][j] = leer.nextInt();
                }
            }
        
            System.out.println("VECTOR A");
            //presentar vector A
            for(i=0; i<n; i++) {
                for(j=0; j<m ; j++) {
                    System.out.print(A[i][j] + "  ");
                }
                System.out.println(" ");
            }
            System.out.println("VECTOR B");
            // Presentar vector B
            for(i = 0; i < n1; i++) {
                for(j = 0;j < m1 ; j++) {
                    System.out.print(B[i][j] + "  ");
                }
                System.out.println(" ");
            }
            System.out.println("VECTOR C");
            //Vector C
        
            result=0;
            suma=0;
            for(i=0;i<(m);i++){
                for(j=0;j<(n1);j++){
                    for(k=0;k<(C.length);k++){
                         result=((A[i][k])*(B[k][j]));
                         suma = suma + result;
                    }
                C[i][j]= suma;
                suma=0;
                }    
            }
                                
                           
                           
            // Presentar vector C
            for (i = 0; i < n; i++) {
                for (j = 0; j < m1 ; j++) {
                    System.out.print(C[i][j] + "  ");
                }
                System.out.println(" ");
            }
        }
        else{
            System.out.println("Las 2 matrices no se pueden multiplicar.");
        } 
    }
    
    
    
}

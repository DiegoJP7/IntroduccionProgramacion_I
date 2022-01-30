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
public class matriz2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,m,i,j;
        n=0;m=0;i=0;j=0;
        
        //Ingresar el tamaño de la matirz
        System.out.println("Ingrese le numero de filas");
        n =leer.nextInt();
        
        System.out.println("Ingrese el tamaño de las columnas");
        m =leer.nextInt();
        int[][] A= new int[n][m];
        
        //Ingresar elementos de la matriz
        
        System.out.println("\n ingresar los terminos de la matriz");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                
                System.out.println("A["+i+"]["+j+"]=");
                A[i][j]=leer.nextInt();
            }
        }
        
        System.out.println("La matriz A es:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                
                System.out.print(A[i][j]+" ");
                
            }
            System.out.println("");
        }
        System.out.println("------------------------");
        int suma=0;
        int []B=new int[n];
        
        for (i=0;i<n;i++){
            for(j=0;j<m;j++){
                
                suma= suma + A[i][j];
            }
            
            B[i]=suma;
            suma = 0; 
        }
        System.out.println("El vector B es");
        for (int k=0;k<n;k++){
            System.out.println(B[k]+" ");
        }
        
    }
}

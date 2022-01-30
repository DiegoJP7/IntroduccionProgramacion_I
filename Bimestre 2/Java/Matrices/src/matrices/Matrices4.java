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
public class Matrices4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n,i,j;
        n=0;i=0;j=0;
        
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
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
System.out.println("Cambiar  por 0 la diagonal principal");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(A[i][j]%2==0){
                    A[i][j]=0;
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Cambiar por 1 cuando i-n=0");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if((i==n-1) || (j==n-1)){
                    A[i][j]=1;
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}

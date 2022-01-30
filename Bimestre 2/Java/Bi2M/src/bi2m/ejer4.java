/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bi2m;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class ejer4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,m,i,j,numparA,numparB;
        n=0;i=0;j=0;numparA=0;numparB=0;
        //Ingresar el tamaño de la matirz
        System.out.println("Ingrese los elementos de la matriz A");
        System.out.println("Ingrese le numero de filas");
        n =leer.nextInt();
        
        System.out.println("Ingrese el tamaño de las columnas");
        m =leer.nextInt();
        int[][] A= new int[n][m];
        int[][] B= new int[n][m];
        System.out.println("\n ingresar los terminos de la matriz A");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                
                System.out.println("A["+i+"]["+j+"]=");
                A[i][j]=leer.nextInt();
                
            }
        }
        System.out.println("\n ingresar los terminos de la matriz B");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                
                System.out.println("B["+i+"]["+j+"]=");
                B[i][j]=leer.nextInt();
            }
            }
        for (i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(A[i][j]%2==0){
                    numparA=numparA+1;

                }
            }
        }
        for (i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(B[i][j]%2==0){
                    numparB=numparB+1;

                }
            }
        }
        if(numparA==numparB){
            System.out.println("son iguales y el numero de pares entre los 2 vectores es:"+numparB);    
        }
        else{
            System.out.println("no lo son");
        }
            
    }
}

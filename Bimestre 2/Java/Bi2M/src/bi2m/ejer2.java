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
public class ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mayorA,mayorB;
        mayorA=0;mayorB=0;
        int n,m,i,j;
        n=0;i=0;j=0;
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
                
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                mayorA=A[i][j];
                if(A[i][j]>mayorA){
                    
                }
                 
            }
        mayorA=A[i][j];    
        }
        System.out.println("El numero mayor de A es: "+mayorA);
        //B
        
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                
                if(B[i][j]>mayorB){
                    mayorB=B[i][j];
                }
                 
            }
        mayorB=B[i][j];    
        }
        System.out.println("El numero mayor de B es: "+mayorB);
        
        //Comparar los numeros mayores
        
                if(mayorA==mayorB){
                    System.out.println("El numero mayor A es "+mayorA+" y el numero mayor de b es "+mayorB+" entonces ambos numero son iguales");
                }
                 
            
            
        
    }
    
}

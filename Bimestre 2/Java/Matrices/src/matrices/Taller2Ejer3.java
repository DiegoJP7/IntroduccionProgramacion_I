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
public class Taller2Ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,m,i,j,media,suma;
        n=0;i=0;j=0;media=0;suma=0;
        
        System.out.println("Ingrese el numero de personas");
        n=leer.nextInt();
        System.out.println("Ingrese los criterios a calificar");
        m=leer.nextInt();
        
        int[][] A= new int[n][m];
        
        
        for(i=0;i<n;i++){
            System.out.println("ingresar el valor de los criterios para la persona "+i);
            for(j=0;j<n;j++){
                
                System.out.println("Persona " +i+"\nCriterio "+j);
                A[i][j]=leer.nextInt();
                System.out.println("---------------------------");
            }
        }
        suma=A[0][j-1];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                
                
            }
        }
        //Media
        media=suma/m;
        for(i=0;i<n;i++){
            System.out.print(" Criterios Persona "+i+" = ");
            for(j=0;j<n;j++){
                
                System.out.print(A[i][j]+" ");
                
            }
            System.out.print("Media="+media);
            System.out.println("");
        }
        
        
        
    }
}

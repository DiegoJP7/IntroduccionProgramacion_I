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
public class Taller2Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m,i,j,k;
        m=0;i=0;j=0;k=0;
        System.out.println(" **** Una matriz m × m es simétrica si sus elementos satisfacen aij = aji.\n" +
"Realice un algoritmo que determine si una matriz es o no simétrica. ****");
        System.out.println("Ingrese el tamaño de la matriz");
        m=leer.nextInt();
        int[][]A=new int[m][m];
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                
                System.out.println("A["+i+"]["+j+"]=");
                A[i][j]=leer.nextInt();
                
            }
            
        }
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                System.out.print(A[j][i]+" ");
            }
            System.out.println("");
        }
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                if(A[i][j]==A[j][i]){
                    k=0;
                }
                else{
                    k=k+1;
                }
            }
            
        }
        if(k==0){
            System.out.println("La matriz es simetrica");
        }
        else{
            System.out.println("La matriz no es simetrica");
        }
    }
}

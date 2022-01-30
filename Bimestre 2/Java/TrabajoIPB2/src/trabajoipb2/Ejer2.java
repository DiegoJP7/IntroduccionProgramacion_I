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
public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                int n,m, j,i;
        m=0; n=0;
        System.out.print("Ingrese el tamaño en filas de la matriz: ");
        n = leer.nextInt();
        
        int[][] A = new int [n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("Diagonal Principal=0");
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                if(i<j){
                    A[i][j] = 0;
                }
                
            }
            
        }
       for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}

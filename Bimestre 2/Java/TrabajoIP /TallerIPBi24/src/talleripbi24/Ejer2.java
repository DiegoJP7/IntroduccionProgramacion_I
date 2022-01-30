/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleripbi24;
import java.util.Scanner;
/**
 *
 * @author diegojp
 */
public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Lee la matriz de orden 3
        int i,j;
        double [][] M = new double[3][3];
        double det;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("ingrese el valor de M["+i+"]["+j+"]= ");
                M[i][j]= leer.nextDouble();
            }
            det = Sarrus(M);
            System.out.println("El determinante de la matriz es igual a: "+det);           
        }        
    }
    public static double Sarrus(double [][]M){
        int i, j, t, dc;
        double A[][] = new double [3][5];
        double d, sumad, z, sumai, det;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                A[i][j] = M[i][j];
            }        
        }
        // Comlumnas adicionales de la matriz ampliada
        for (i = 0; i < 3; i++) {
            for (j = 3; j < 5; j++) {
                A[i][j] = A[i][j-3];
            }        
        }
        //calculo del determinante
        i = 1;j = 1;dc = 1;t = 3;d = 1;sumad = 0;
        while(i<=3){
            while((j<=t)&&(t<=5)){
                d = d * A[i][j];
                i = i + 1;
                j = j + 1;
            }
            sumad = sumad + d;
            d = 1;
            i =1;
            dc = dc + 1;
            j = dc;
            t = t + 1;
        }
        i = 1; j = 3; dc = 3;t = 1;z = 1;sumai = 0;
        while(i<=3){
            while((j>=t)&&(t<=3)){
                z = z * A[i][j];
                i = i + 1;
                j=j-1;
            }
            sumai = sumai + z;
            z = 1;
            i = 1;
            dc = dc + 1;
            j = dc;
            t = t + 1;
        }
        det = sumad - sumai;
        return det;
    }
}

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
public class Ejer4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las variables
        int n, m, k, l;
        n = 0; m = 0; k = 0; l = n * m;
        
        System.out.println("\t---Mayor Elemento, Transpuesta y Elementos Impares de una Matriz---");
        System.out.print("¿Cuántas filas tiene su matriz? : ");
        n = leer.nextInt();
        System.out.print("¿Cuantas columnas tiene su matriz? : ");
        m = leer.nextInt();
        System.out.println("Su matriz corresponde a una matriz de "+m+" X "+n);
        
        int A [][] = new int [n][m];
        int B [][] = new int [n][m];
        int C [] = new int [l];
        
        leer_Matriz(n, m, A);
        mayor(n, m, A);
        transpuesta(n, m, A, B);
        escribir_Matriz(n, m, B);
        impar(n, m, A, C);
        
        k = impar2(n, m, A, C);
        if(k>0){
            escribir_Vector(k, C);
        }
        else{
            System.out.println("La matriz no tiene números impares");
        }
        
    }
    public static void leer_Matriz(int fila, int columna, int [][] M){
        Scanner leer = new Scanner(System.in);
        int i, j;
        System.out.println("\nIngresar los elementos de la matriz: ");
        for (i = 0; i<fila; i++){
            for(j = 0; j<columna; j++){
                System.out.print("M ["+i+"] ["+j+"] = ");
                M[i][j] = leer.nextInt();
            }
        }
    }
    public static void mayor(int fila, int columna, int [][] M){
        Scanner leer = new Scanner(System.in);
        int i, j, may;
        may = 0;
        for (i = 0; i<fila; i++){
            for(j = 0; j<columna; j++){
                if (M[i][j]>may){
                    may = M[i][j];
                } 
            }
        }
        System.out.println("El elemento mayor de la matriz es: " +may);
    }
    public static void transpuesta(int fila, int columna, int [][] M1, int [][] M2){
        Scanner leer = new Scanner(System.in);
        int i, j;
        
        for (i = 0; i<fila; i++){
            for(j = 0; j<columna; j++){
                M2[i][j]=M1[j][i];
            }
        }
    }
    public static void impar(int fila, int columna, int [][] M, int [] V){
        Scanner leer = new Scanner(System.in);
        int i, j, k;
        k = 0;
        for (i = 0; i<fila; i++){
            for(j = 0; j<columna; j++){
                if (M[i][j] % 2 == 0){
                    k = k + 1;
                    V[k] = M[i][j];
                }
            }
        }
    }
    public static int impar2(int fila, int columna, int [][] M, int [] V){
        Scanner leer = new Scanner(System.in);
        int i, j, k;
        k = 0;
        for (i = 0; i<fila; i++){
            for(j = 0; j<columna; j++){
                if (M[i][j] % 2 == 0){
                    V[k] = M[i][j];
                    k = k + 1;
                }
            }
        }
        return k;
    }
    public static void escribir_Matriz(int fila, int columna, int [][] M1){
        Scanner leer = new Scanner(System.in);
        int i, j;
        System.out.println("Matriz Transpuesta es: ");
        for (i=0; i<fila; i++) {
            for (j=0; j<columna; j++) {
                System.out.print(M1[i][j]+"   ");
            }
            System.out.println("");
        }
    }
    public static void escribir_Vector(int tam, int [] v){
        int i;
        for (i = 0; i<tam; i++){
            System.out.println(v[i]+"  ");
        }
    }
}

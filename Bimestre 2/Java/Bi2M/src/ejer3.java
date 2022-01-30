
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diegojp
 */
public class ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,m,i,j;
        double sumaA,sumaB,promA,promB;
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
        
        //Promedio
        sumaA = A[0][0] + A[0][m-1] + A[n-1][0] + A[n-1][m-1];
        promA= sumaA/4;
        
        //promb
        System.out.println("\n ingresar los terminos de la matriz B");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                
                System.out.println("B["+i+"]["+j+"]=");
                B[i][j]=leer.nextInt();
                
            }
        }
        sumaB = B[0][0] + B[0][m-1] + B[n-1][0] + B[n-1][m-1];
        promB= sumaB/4;
        
        //Comparar promedios
        if(promA==promB){
            System.out.println("El promedio de A es "+promA+"y el de la matriz b es "+promB+"es decir son promedios igualales");
        }
        else{
            System.out.println("los promedios no son iguales");
        }
    }
}

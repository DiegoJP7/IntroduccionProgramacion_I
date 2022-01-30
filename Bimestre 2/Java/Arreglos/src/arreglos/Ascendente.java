/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Ascendente {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,i,j,aux;
        aux=0;n=0;
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        //declara vector
        int [] A = new int [n];
        
        System.out.println("Ingrese los terminos del vector");
        
        for(i=0; i<n; i++){
            System.out.println("A["+i+"]");
            A[i]=leer.nextInt();
        }
        //Presentar vector original
        System.out.println("Vector original");
        for(i=0; i<n; i++){
            System.out.println("A["+i+"]="+A[i]);
        }
        
        //ordenar vector
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(A[i]>A[j]){
                    aux=A[i];
                    A[i]=A[j];
                    A[j]=aux;
                }
            }
        }
        //Presentar el vector ordenado
        System.out.println("---VECTOR ORDENADO-----");
        for(i=0; i<n; i++){
            System.out.println("A["+i+"]="+A[i]);
        }
    }
    
}

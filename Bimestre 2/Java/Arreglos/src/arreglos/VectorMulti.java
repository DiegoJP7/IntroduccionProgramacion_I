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
public class VectorMulti {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i;
        int escalar;
        n=0; escalar=0;
        System.out.println("Ingrese el tamaño del escalar");
        escalar =leer.nextInt();
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        double [] A = new double [n];
        double [] B = new double [n];
        for(i=0; i<n; i++){
            System.out.println("Ingrese los numero del vector A:");
            A[i]=leer.nextDouble();
            
        }
        //Multiplicar por el escalar
            for(i=0; i<n; i++){
                B[i]= A[i] * escalar;
            }
        //Presentar el vector B
        for(i=0; i<n; i++){
            System.out.println("B= "+B[i]);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesbi2;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Funciones6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=0;
        int num=0;
        int cont=0;
        
        System.out.println(" función que permite encontrar y determinar cuántas veces se ha encontrado el mismo número en un vector");
        System.out.println("Ingrese el numero a buscar");
        n=leer.nextInt();
        
        int [] A= new int[n];
        System.out.println("Ingrese los elementos del vector \n");
        
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el elemento A["+i+"]=");
            A[i]=leer.nextInt();
        }
        System.out.println("Ingrese el elemento a buscar en el vector");
        num=leer.nextInt();
        
        cont=BuscarVector(A, num,n);
        System.out.println("El numero "+num+ "se ha encontrado "+cont+" tantas veces");
        for(int i=0;i<n;i++){
            System.out.print(" A["+A[i]+"]=");
        }
            
    }
    public static int BuscarVector(int[]B, int num, int n) {
        
        int cont =0;
        for(int i =0; i<n;i++){
            if(B[i]==num){
                
            }
        }
        return cont;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4b2;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=10;
        int numero=0;
        int cont=0;
        boolean esPrimo;
        int [] A= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el elemento A["+i+"]=");
            A[i]=leer.nextInt();
            numero=A[i];
            
            esPrimo=Primo(A,numero);
            
            if(esPrimo==true){
                System.out.println("***El numero "+numero+" es primo***");
            }
            
        }
    }
        public static boolean Primo(int[] A, int numero) {
        int div=0;
        
        for(int i=1; i <= numero; i++){
            if(numero%i==0){
                div=div+1;
            }
        }
        for(int i=1; i <= numero; i++){
            if (div==2){
            
            return true;
            
        }
            else{
            return false;
        }
        }
        return false;
        
        
    }
}

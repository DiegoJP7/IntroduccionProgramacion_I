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
public class ejer1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, cif;
        num=0;
        System.out.println("Función que reciba un número y devuelva la cantidad de digitos");
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
        cif = Cifras(num);
        System.out.println("El numero "+num+ " tiene "+cif+" digitos");
        
    }
    
    public static int Cifras(int n){
    int cifra=0;    
        while(n!=0){             
            n = n/10;     
            cifra= cifra+1;
        }
        return cifra;
    }
}

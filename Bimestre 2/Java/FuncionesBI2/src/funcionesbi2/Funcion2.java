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
public class Funcion2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num=0;
        boolean band;
        
        System.out.println("Funcion para verificar si un numero es positivo o negativo");
        System.out.println("Ingrese el numero a verificar");
        num=leer.nextInt();
        
        band=funNegPos(num);
        
        if(band==true){
            System.out.println("El numero "+num+" es positivo");
        }
        else{
            System.out.println("El numero "+num+" es negativo");
        }
        System.out.println("Fin funcion 1");
        //Comprovar llamado de la funcion
        if(funNegPos(num)==true){
            System.out.println("El numero "+num+" es positivo 1");
        }
        else{
            System.out.println("El numero "+num+" es negativo 1");
        }
        System.out.println("Fin funcion 1");
    }
    public static boolean funNegPos(int numero) {
        if(numero > 0){
            return true;
        }
        else{
            return false;
        }
    }
}

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
public class Funcion3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num=0;
        boolean esImpar;
        
        System.out.println(" función para verificar si un número es impar y un procedimiento para verificar si es primo");
        System.out.println("Ingrese el numero a verificar: ");
        num=leer.nextInt();
        
        esImpar = Impar(num);
   
            Primo(num);
           
        else{
            System.out.println("El numero no es impar por lo cual no se verifica si es primo");
        }
    }
    public static boolean Impar(int numero) {
        if(numero%2==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean Primo(int numero) {
        int div=0;
        for(int i=1; i <= numero; i++){
            if(numero % i==0){
                div=div+1;
            }
        }
        if(div ==2){
            System.out.println("El numero "+numero+" es impar y es primo");
        }
        else{
            System.out.println("El numero "+numero+" es impar y no es primo");
        }
        return false;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_repetitivos;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        int i, n,num;
        double total;
        i = 1; n = 0;num = 1; total = 1;
        //Ingreso de datos
        System.out.println("Ingrese el numero a multiplicar");
        num=leer.nextInt();
        System.out.println("Ingrese el maximo de numeros a multiplicar");
        n = leer.nextInt();
        //Proceso
        while (i<=n){
            
            total = num*i;
            System.out.println(i);
            
            System.out.println(num+" x "+i+ " = "+total );
            i = i +1;
            
        }
    }    
    
}

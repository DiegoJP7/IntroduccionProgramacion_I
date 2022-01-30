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
public class Secuecnias {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
    
        //Declaracion de variables
        int i, n;
        double suma,num, den, term;
        i = 1; n = 0; suma =0;num = 1; den = 1;term=1;
        
        //ingreso de datos
        System.out.println("Ingrese el limite del cliclo");
        n = leer.nextInt();
        System.out.println("Ingrese el numerador");
        num = leer.nextInt();
        System.out.println("Ingrese en denominador");
        den = leer.nextInt();
        
        //Proceso
        while (i <= n){
            num = num + 2;
            den = den + 3;
            term = num/den;
            System.out.println(i);
            i = i + 1;
            suma = suma + term;
            
            System.out.println("El termino "+i+ " es "+num+"/"+den);
            System.out.println("La suma total es "+suma);
        }
    }    
    
}

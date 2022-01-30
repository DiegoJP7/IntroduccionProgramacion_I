/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4b2;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n,i,cont = 0,ft,suma = 0;
        double promed;
        i=0;n=1;
        while (n!=0){
        System.out.println("Ingrese los Numeros, el numero 0 es el limite");
        n=leer.nextInt();
        i=i+1;
            if((n % 2 == 0 )&&(n >0)) {
            cont = cont + 1;
            ft = 1;
                for (i =1 ; i <=n ; i++) {
                ft = ft * i;
                }
            suma = suma + ft;
             System.out.println(ft);
        }
    }
    promed = suma/cont;
    //Salida
    System.out.println("La suma de los numeros es: "+suma);
       
    System.out.println("Media: " + promed);
    }   
}

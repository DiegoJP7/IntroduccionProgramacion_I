/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bi2m;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Bi2M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, cont,suma, fact ;
        double prom;
        num=0; cont=0; prom=0; suma = 0;
        do{  
            System.out.print("Ingrese un número:");
            num = leer.nextInt();
            if((num % 2 == 0 )&&(num >0)) {
                cont = cont + 1;
                fact = 1;
                for (int i =1 ; i <=num ; i++) {
                    fact = fact * i;
                }
            suma = suma + fact;
            }
            
        }while(num != 0);    
        prom = suma/cont;
        System.out.println(suma);
        System.out.println(cont);
        System.out.println("Media: " + prom);
        
    }
    
    
    
}

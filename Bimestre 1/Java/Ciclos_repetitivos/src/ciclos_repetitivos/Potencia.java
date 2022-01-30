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
public class Potencia {
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    
    //Declaracion de varibles
    
    int base, pot, result;
    int i;
    base=0; pot=0; result=1;i=1;
    
    //ingreso de datos
    
        System.out.println("ingrese la base:");
        base = leer.nextInt();
        System.out.println("Ingrese la potencia");
        pot = leer.nextInt();
        
        while (i <= pot){
            
            result=  result * base ;
            i = i + 1;
            
            
        }
        System.out.println("i es "+i);
        System.out.println("La potencia de la base "+base+ " es "+result);
    }
}

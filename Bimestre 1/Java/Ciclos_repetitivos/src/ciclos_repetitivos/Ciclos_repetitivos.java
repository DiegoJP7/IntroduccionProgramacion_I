/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos_repetitivos;
import java.util.Scanner;
/**
 *
 * @author diegojp
 */
public class Ciclos_repetitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //Declaracion de varibles
        int i, n, suma;
        i = 1; n = 1;suma = 0;
        
        //Ingresar el limite del cilco
        System.out.println("Ingrese el limite del ciclo");
        n = leer.nextInt();
        
        //palabra reservada while
        //Proceso
        while(i <= n){
            
            System.out.println(i);
            suma = suma + i;
            i = i + 1;
            
        }
        System.out.println("i es "+i);
        System.out.println("La suma es: "+suma);
        i = n; suma = 0;
        while (i >= 1){
            System.out.println("Suma es "+suma);
            suma = suma + i;
            System.out.println(i);
            i = i - 1;
            
        }
        System.out.println("i es "+i);
        System.out.println("La suma es: "+suma);
        
    }
    
    
}

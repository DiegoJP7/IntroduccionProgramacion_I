/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2ext;
import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Tarea2Ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        int num1, num2, dif;
        num1=0;num2=0;
        
        //Ingreso de datos
        System.out.println("Programa para determinar si la diferencia entre los dos es un número divisor exacto de alguno de los dos números.\n");
        System.out.println("Ingrese el primer numero: ");
        num1= leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2= leer.nextInt();
        
        //Proceso
        if (num1>num2){
            dif = num1 - num2;
        }
        else{
            
            dif= num2 - num1;
        }
        
            
        
        if ((num1%dif == 0)||(num2%dif == 0)){
            System.out.println("La diferencia entre ambos numeros es un numero divisor de uno de los numeros");  
        }
        else {
            System.out.println("La diferencia no es divisor para ninguno de los dos números ");
        }
        
    }
    
}

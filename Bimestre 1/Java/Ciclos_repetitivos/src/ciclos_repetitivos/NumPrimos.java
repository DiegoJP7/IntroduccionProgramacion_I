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
public class NumPrimos {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Inicializar las variables
        int i, n, num;
        int j,divisor;
        
        n=0; num=0;divisor=0;
        System.out.println("Ingrese el limite de numeros a vrificar");
        n = leer.nextInt();
        
        for(i=1; i<=n;i++){
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            //par o imoar
            if(num%2==0){
                System.out.println("El numero "+num+ " es par");
            }
            else{
                System.out.println("El numero "+num+ " es impar"); 
            }
            //Obtener los metodos a verificar si un numero es primo
            j=1;
            
            while(j<=num){
                
                if (num%j==0){
                    divisor=divisor+1;
                    
                }
                j=j+1;
            }
            
            if (divisor == 2){
                System.out.println("El numero " +num+" es primo");
                System.out.println("----------------------------------------------------");
            }
            else{
                System.out.println("El numero " +num+" no es primo");
                System.out.println("----------------------------------------------------");
            }
            divisor=0;
        }
    }            
    
}

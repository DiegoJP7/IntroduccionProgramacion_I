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
public class EjercicioFactorial {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Inicializar las variables
        int i=0,fac,num;
        fac = 1; num = 1;
        //Ingeso de datos
        
        System.out.println("Ingrese el numero a calcular su factorial");
        num = leer.nextInt();
        //Proceso
        while (i <= num){
	i = i+1;
        
            System.out.println(i);
        fac = i * fac;
        }
        System.out.println("El factorial del numero "+num+" es : "+fac);

			
	
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras_condicionales;
import java.util.Scanner;
/**
 *
 * @author diegojp
 */
public class Conversion_Graddos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables
        Scanner leer = new Scanner(System.in);
        double gC, gF,gK;
        gC = 0; gF = 0; gK = 0;
        
        //entrda de datos
        System.out.println("Estructuras logicas condicionales simples");
        System.out.println("Programa para convertir en grados \n");
        
        System.out.println("Ingrese los grados centigrados: ");
        gC = leer.nextDouble();
        
        if (gC > 0){
            gF =(9/5)*(gC + 32);
            gK = gC + 273.15;
        System.out.println("La equivalencia en grados Farenheid es "+gF);
        System.out.println("La equivalencia en grados Kelvin es "+gK);
        }
        
        
    }
    
}

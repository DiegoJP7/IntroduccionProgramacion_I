/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesbi2;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class FuncionesBI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num=0;
        
        System.out.println("Procedimiento para verificar si un numnero es par o impar");
        System.out.println("Ingrese el numero a verificar");
        num=leer.nextInt();
        
        ParImpar(num);
        
        System.out.println("+++++Fin Procedimiento 1++++++");
        
        NegPos(num);
        
        System.out.println("+++++Fin Procedimiento 2++++++");
    }
    //Procedimiento para verificar si un numero es par o no
    
    public static void ParImpar(int numero) {
        if (numero %2==0){
            System.out.println("El numero "+numero+" es par\n");
        }
        else{
            System.out.println("El numero "+numero+" es impar\n");
        }
            
    }
    public static void NegPos(int numero) {
        if (numero >0 ){
            System.out.println("El numero "+numero+ "es positivo");
        }
        else{
            System.out.println("El numero "+numero+ "es negativo");
        }
            
    }
}

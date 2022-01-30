/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;
import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Claculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declare la variable e inicializar
        double num1, num2, resp;
        int opc;
        
        num1=0;num2=0;resp=0;
        
        //ingreso de datos
        System.out.println("Calculadora basica\n");
        
        System.out.println("Ingrese el valor del primer numero");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el valor del segundo numero");
        num2 = leer.nextDouble();
        System.out.println("\n");
        
        System.out.println("Escoja la operacion del siguiente menu");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division\n");
        
        System.out.println("Ingrese la opcion: ");
        opc = leer.nextInt();
        
        switch (opc){
            case 1: {
                resp = num1 + num2;
                System.out.println("La suma es: "+resp);
            }
            break;
            case 2:{
                resp = num1 - num2;
                System.out.println("La resta es: "+resp);
            }
            break;
            case 3:{
                resp = num1*num2;
                System.out.println("La multiplicacion es: "+resp);
            }
            break;
            case 4:{
                resp = num1/num2;
                System.out.println("La division es: "+resp);
            }
            break;
            default:
                System.out.println("No existe la opcion que ingreso");
                break;
        }
        
    }
    
}

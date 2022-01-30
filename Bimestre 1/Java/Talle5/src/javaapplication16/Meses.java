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
public class Meses {
    public static void main(String[] args) {
         // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        int opc;
        //Entrada de datos
        System.out.println("Programa para identificar los meses a partir de su numero\n");
        System.out.println("Elija su opcion");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("6.");
        System.out.println("7.");
        System.out.println("8.");
        System.out.println("9.");
        System.out.println("10.");
        System.out.println("11.");
        System.out.println("12.\n");
        System.out.println("Ingrese la opcion");
        opc = leer.nextInt();
        
        switch (opc){
            case 1: {
                System.out.println("El mes numero "+opc+ " es Enero");
                
            }
            break;
            case 2: {
                System.out.println("El mes numero "+opc+ " es Febrero");
                
            }
            break;
            case 3: {
                System.out.println("El mes numero "+opc+ " es Marzo");
                
            }
            break;
            case 4: {
                System.out.println("El mes numero "+opc+ " es Abril");
                
            }
            break;
            case 5: {
                System.out.println("El mes numero "+opc+ " es Mayo");
                
            }
            break;
            case 6: {
                System.out.println("El mes numero "+opc+ " es Junio");
                
            }
            break;
            case 7: {
                System.out.println("El mes numero "+opc+ " es Julio");
                
            }
            break;
            case 8: {
                System.out.println("El mes numero "+opc+ " es Agosto");
                
            }
            break;
            case 9: {
                System.out.println("El mes numero "+opc+ " es Septiembre");
                
            }
            break;
            case 10: {
                System.out.println("El mes numero "+opc+ " es Octubre");
                
            }
            break;
            case 11: {
                System.out.println("El mes numero "+opc+ " es Noviembre");
                
            }
            break;
            case 12: {
                System.out.println("El mes numero "+opc+ " es Diciembre");
                
            }
            
            break;
            default:
                System.out.println("No existe la opcion que ingreso");
                break;
        }
    }
        
    
}

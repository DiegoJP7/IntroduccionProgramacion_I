/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionfc1;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Problema1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        double n;
        n=0;
        //Introduccion de datos
        System.out.println("Introduzca la nota del estudiante");
        n = leer.nextDouble();
        //Condiciones 
        if(n >= 3.0){
            System.out.println("La nota introducida es valida como aprovada");
            if((n >= 4.6)&&(n<=5.0)){
                System.out.println("Estudiante exelente");
        }
            else{
                if((n>=4.1)&&(n >= 4.5)){
                    System.out.println("El alumno es muy bueno");
            }
                else{
                    if((n>=3.6)&&(n >= 4.0)){
                        System.out.println("El estudiante es bueno");
                    }
                    else{
                        if((n>=3.3)&&(n >= 3.5)){
                            System.out.println("El alumno registro un desempeño aceptable");
                        }
                        else{
                            if((n>=3.0)&&(n >= 3.2)){
                                System.out.println("Alumno aprovado");
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("El alumno registra una calificacion no aprovatoria");
        }
    }
    
}

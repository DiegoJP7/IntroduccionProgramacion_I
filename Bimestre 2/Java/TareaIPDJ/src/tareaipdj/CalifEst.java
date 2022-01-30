/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaipdj;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class CalifEst {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Inicializar las variables
        int i, n;
        int j,divisor,aprov,deprov;
        double num;
        
        n=0; num=0;divisor=0;aprov=0;deprov=0;
        //Proceso
        System.out.println("--Programa para verificar si la nota de N estudintes es aprovatoria o no");
        System.out.println("Ingrese el numero de estudiantes a calificar");
        n = leer.nextInt();
        
        for(i=1; i<=n;){
            System.out.println("Ingrese la nota del estudiante");
            num = leer.nextDouble();
            
            if(num >= 7){
                System.out.println("El estuadiante tiene de nota "+num+ " por lo tanto esta aprovado");
                System.out.println("---------------------------------------------------------------------");
                i = i + 1;
                aprov=aprov+1;
            }
            else{
                System.out.println("El estuadiante tiene de nota "+num+ " por lo tanto no esta aprovado");
                System.out.println("---------------------------------------------------------------------");
                i = i + 1;
                deprov=deprov+1;
            }
            
            
        }
        System.out.println("El total de estudiantes aprobados es: "+aprov);
        System.out.println("El total de estudiantes reprobados es: "+deprov);
        
    }            
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n,i;
        double suma,promed,mayor;
        suma=0;promed=0;mayor=0;
        
        System.out.println("Ingrese el numero de notas");
        n=leer.nextInt();
        
        double [] Notas = new double [n];
        System.out.println("Nombres estudiantes");
        
        String[] Nombres=new String[n];
        
        //Ingresa las notas al vector
        for(i=0; i<n; i++){
            System.out.println("Ingrese el nombre "+i);
            Nombres[i] = leer.next();
            System.out.println("Ingrese la nota "+i+ ":");
            Notas[i]=leer.nextDouble();
            System.out.println("----------------------------------------");

        }
        //Clacular suma de las notas
        for(i=0;i<n;i++){
            suma=suma+Notas[i];
        }
        //Promedio
        
        promed=suma/(n-1);
        //Presentar os elementos del vector notas
        System.out.println("---Las notas son:----");
        for(i=0;i<n;i++){
            System.out.println("Notas["+i+"]="+Notas[i]);
        }
        System.out.println("------------------------------");
        System.out.println("El promedio de notas es: "+promed);
        
        //nota mas alta
        mayor= Notas[0];
        for(i=1;i<n;i++){
            if(Notas[i]>mayor){
                mayor=Notas[i];
            }
            //System.out.println("---"+mayor);
        }
        System.out.println("--Nota mayor = "+mayor);
        System.out.println("--Las notas en las posiciones impares son");
        
        for(i=0;i<n;i++){
            if(i%2!=0){
                System.out.println("Notas["+i+"] ="+Notas[i]);
            }
            
        }
        
        System.out.println("\n NOTAS Y NOMBRES DE ESTUDIANTES");
        for(i=0;i<n;i++){
            System.out.println(Nombres[i]+" tiene una nota de "+Notas[i]);
        }
    }
    
}

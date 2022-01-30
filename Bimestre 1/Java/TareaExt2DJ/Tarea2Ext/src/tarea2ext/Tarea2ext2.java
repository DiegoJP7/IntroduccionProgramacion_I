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
public class Tarea2ext2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        int anio, mes, dia, dia1, mes1, anio1;
        anio=0; mes=0; dia=0; dia1=0; mes1=0; anio1=0;
        //Ingreso de datos
        System.out.println("Ingrese la fecha del dia de hoy ");
        System.out.println("Dia: ");
        dia1 = leer.nextInt();
        System.out.println("Mes: ");
        mes1 = leer.nextInt();
        System.out.println("Año:");
        anio1 = leer.nextInt();
        System.out.println("\n");
        System.out.println("--------------------------------------------------");
        System.out.println("Ingrese el dia de nacimiento en numeros");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento en numeros ");
        mes = leer.nextInt();
        System.out.println("Ingrese el año del nacimiento en numeros");
        anio = leer.nextInt();
        //Proceso
        if (anio<= 1900){
            System.out.println(" el rango de los años es 1901 - 2021");
        }
        else{
            if ((anio >= 1901)&&(anio <=2021)){
                anio = anio1 - anio;
                
            }
        }
        if (mes > 12){
            System.out.println(" el rango de los meses es 12");
            
        }
        if (mes<mes1){
            mes = mes1-mes;
        }
        else {
            mes = (mes - mes1) ;
            
        }
        if (dia > 31) {
            System.out.println("El rango maximo de dias es 31");
        }
        if (dia<dia1){
            dia= dia1-dia+1;
        }
        else{
            dia= dia-dia1+1;
        }
            
        
         //Salida
         
         System.out.println("Los años son "+anio + ", los meses son "+mes+ " y los dias son "+dia);
        
            
    }
    
}

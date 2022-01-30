/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;
import java.util.Scanner;
/**
 *
 * @author diegojp
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion e inicializacion de variables
        Scanner leer = new Scanner(System.in);
        int h24, n24, h12, n12;
        String periodo;
        
        h24=0; n24=0; h12=0; n12=0;
        periodo = "a.m";
        
        //Ingresoso de los datos
        System.out.println("Ingrese la hora en formato 24 horas a 12 horas\n");
        System.out.println("Ingrese la hora en 24 horas");
        h24 = leer.nextInt();
        
        //Proceso
        if ((h24 <= 24)&&(h24 >= 0)&&(n24 >= 0)&&(n24 <= 60)){
            
            if (n24 == 60){
                h24= h24+1;
                n24=0;
            }
            else{
                n12= n24;
            }
            if(h24>12){
                
                h12= h24 -12;
                periodo = "pm";
                System.out.println("El tiempo de " +h24+" horas y " +n24+" minutos equivale a " +h12+ " horas "+n12+ " minutos " +periodo);
                
                
            }
        }   
        else{
            
            System.out.println("Error: La hora o minutos ingresados no son validos");
        }
        
    
    }
    
}

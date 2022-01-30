/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exmbimedj;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Variables
        int num,clave,l,i;
        clave=1987;
        l=4;
        i=0;
        //Inicio
        System.out.println("Caja Fuerte bloqueada, ingrese su clave de 4 digitos");
        System.out.println("-----------------------------------");
                    do{
                        System.out.println("Ingrese la clave");
                        num=leer.nextInt();
                        if(num==clave){
                                
                    System.out.println("La caja fuerte se ha abierto satisfactoriamenteLa caja fuerte se ha abierto satisfactoriamente");
                    i+=5;

                            
                            
                        }
                        else{
                        System.out.println("Lo siento, esa no es la combinación");
                        i=i+1;
                        clave=1987;
                        l=l-1;
                        System.out.println("Le quedan "+l+" intentos");
                        }
                        if(l==0){
                            System.out.println("La caja fuerte ha sido bloqueada");
                        }
                    }while(i<=4||l==0);
                    
                    
    }            
                      
       
        
    
}

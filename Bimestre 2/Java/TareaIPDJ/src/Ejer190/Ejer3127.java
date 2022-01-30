/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer190;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Ejer3127 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Variables
        int n, i, j;
        

        System.out.println("Ingrese el numero N: ");
        n = leer.nextInt();

        for (i = 0; i < n; i=i+1) {
            for (j = 0; j < i + 1; j=j+1) {
                
                System.out.print("*");

            }
            System.out.println("");
            
        }
        
        i+= 1;

    }

}

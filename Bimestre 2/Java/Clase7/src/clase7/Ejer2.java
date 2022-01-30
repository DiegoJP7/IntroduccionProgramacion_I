/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
int iCantidad = 0;
int cif = n;
		
while (cif>0){
  cif = cif/10;
  iCantidad++;
}
		
System.out.println(n + " tiene " + iCantidad + " dígitos");
    }
    
    
}

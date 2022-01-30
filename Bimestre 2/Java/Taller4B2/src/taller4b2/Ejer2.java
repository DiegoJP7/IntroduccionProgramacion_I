/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4b2;

/**
 *
 * @author diegojp
 */
public class Ejer2 {
    public static void main(String[] args) {
        int iCantidad = 0;
        int iNumero = 0;
int iTemp = iNumero;
		
while (iTemp>0){
  iTemp = iTemp/10;
  iCantidad++;
}
		
System.out.println(iNumero + " tiene " + iCantidad + " dígitos");
    }
}

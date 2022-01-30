/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probleaextra2;
import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class ProbleaExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa para convertir de metros a centimetros, kilometros, pies y pulgadas
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa para convertir de metros a centimetros, "
                + "kilometros, pies y pulgadas, \n");
        
        //Declaracion varibales
        double cM;
        double cCm; 
        double cKm;
        double cFt;
        double cPl;
        //Inializacion de variable
        cM=0;
        cCm=0;
        cKm=0;
        cFt=0;
        cPl=0;
        
        //Entrada de datos
        System.out.println("Ingrese los metros");
        cM = leer.nextDouble();
        
        //Proceso
        cCm = cM * 100;
        cKm = cM /1000;
        cFt = cM * 3.281;
        cPl = cM * 39.37;
        
        //Salida
        System.out.println(+cM+ " metros son " +cCm + " centimetros");
        System.out.println(+cM+" metros son " +cKm + " kilometros");
        System.out.println(+cM+" metros son " +cFt +" pies");
        System.out.println(+cM+" metros son " +cPl + " pulgadas");
        
        
    }
    
}

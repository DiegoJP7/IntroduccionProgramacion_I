/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposdedatos;
import java.util.Scanner;
/**
 *
 * @author diegojp
 */
public class AreaPoligono {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declara las variables
        double A;
        double B;
        double C;
        double alTriag;
        double areaT, areaR, areaTotal;
        String nombre;
        
        //Inicializar las variables
        A = 0; B = 0;alTriag = 0; areaT = 0;areaR=0;areaTotal=0;
        
        System.out.println("---Programa para calcular el area de un poligono--- \n");
        System.out.println("Ingrese el nombre del usuario: ");
        nombre = leer.next();
        
        //Ingresar datos
        System.out.println("Ingresa la altura del terreno (A): ");
        A = leer.nextDouble();
        
        System.out.println("Ingresa la base del terreno (B): ");
        B = leer.nextDouble();
        
        System.out.println("Ingresa la altura del rectangulo del terreno (C): ");
        C = leer.nextDouble();
        
        //Proceso 
        alTriag = A - C;
        areaT = (B * alTriag)/2;
        areaR = B * C;
        areaTotal = areaT + areaR;
        
        System.out.println("El area del triangulo del terreno es: " +areaT + "\n");
        System.out.println("El area de triangulo del terreno es: " +areaR + "\n");
        System.out.println("El area total del triangulo es: " +areaTotal + "\n");
        
        
    }
    
}

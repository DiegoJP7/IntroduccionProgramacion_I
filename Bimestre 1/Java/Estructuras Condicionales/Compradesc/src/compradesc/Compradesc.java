/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compradesc;
import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Compradesc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //declaracion de varibales
        String nomProd1, nomProd2, nomProd3;
        double precioProd1, precioProd2, precioProd3;
        double cantProd1, cantProd2, cantProd3;
        double costoProd1, costoProd2, costoProd3;
        double subTotal, desc, IVA, Total;
        
        precioProd1 = 0; precioProd2 = 0; precioProd3 = 0;
	cantProd1 = 0; cantProd2 = 0; cantProd3 = 0;
	costoProd1 = 0; costoProd2 = 0; costoProd3 = 0; 
	subTotal = 0; desc = 0; IVA = 0; Total = 0;
        
        //Ingresar datos
        System.out.println("--Ingrese los datos del producto 1--");
        System.out.println("Nombre:");
        nomProd1 = leer.next();
        System.out.println("Precio:");
        precioProd1 = leer.nextDouble();
        System.out.println("Cantidad: ");
        cantProd1 = leer.nextDouble();
        
        System.out.println("--Ingrese los datos del producto 2--");
        System.out.println("Nombre:");
        nomProd2 = leer.next();
        System.out.println("Precio:");
        precioProd2 = leer.nextDouble();
        System.out.println("Cantidad:");
        cantProd2 = leer.nextDouble();
        
        System.out.println("--Ingrese los datos del producto 3--");
        System.out.println("Nombre:");
        nomProd3 = leer.next();
        System.out.println("Precio:");
        precioProd3 = leer.nextDouble();
        System.out.println("Cantidad: ");
        cantProd3 = leer.nextDouble();
        
        //Proceso
        costoProd1 = precioProd1 * cantProd1;
        costoProd2 = precioProd2 * cantProd2;
        costoProd3 = precioProd3 * cantProd3;
        
        subTotal = costoProd1 + costoProd2 + costoProd3;
        if(subTotal <= 10){
            desc = subTotal * 0.05;
        }
	if((subTotal > 10) && (subTotal <= 30)){
            desc=subTotal *0.15;
    }   
        if(subTotal > 30){
            desc=subTotal*0.20;
            
        }
	IVA = ((subTotal - desc) *0.12);
	Total = (subTotal - desc) + IVA;
        
        System.out.println("--Producto 1--");
        System.out.println("Nombre: "+nomProd1);
        System.out.println("Precio: "+precioProd1);
        System.out.println("Cantidad: "+cantProd1);
        System.out.println("-------------------------------------");
        System.out.println("Costo: "+costoProd1);
        System.out.println("\n");
        
        System.out.println("--Producto 12--");
        System.out.println("Nombre: "+nomProd2);
        System.out.println("Precio: "+precioProd2);
        System.out.println("Cantidad: "+cantProd2);
        System.out.println("-------------------------------------");
        System.out.println("Costo: "+costoProd2);
        System.out.println("\n");
        
        System.out.println("--Producto 3--");
        System.out.println("Nombre: "+nomProd3);
        System.out.println("Precio: "+precioProd3);
        System.out.println("Cantidad: "+cantProd3);
        System.out.println("-------------------------------------");
        System.out.println("Costo: "+costoProd3);
        System.out.println("\n");
        
        System.out.println("----------");
        System.out.println("SubTotal: "+subTotal);
        System.out.println("Descuento: "+desc);
        System.out.println("Valor IVA: "+IVA);
        System.out.println("     ---------");
        System.out.println("Total: "+Total);
    }
    
   
    
}

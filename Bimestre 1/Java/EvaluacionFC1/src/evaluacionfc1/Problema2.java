/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionfc1;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        String nombre;
        int tipo_cliente;
        double desc1, desc2, desc3, cantlibros, subtotal,subtotal1, costlibro, desca1, desca2,costotal;
        desc1 =0; desc2 =0; desc3 =0; subtotal =0;subtotal1=0;costlibro =0;costotal=0;
        
        
        
        
        //Intro
        System.out.println("Ingrese el nombre del cliente");
        nombre = leer.next();
        System.out.println("Ingrese el tipo de cliente");
        tipo_cliente = leer.nextInt();
        System.out.println("Ingrese la cantidad de libros");
        cantlibros = leer.nextDouble();
        System.out.println("Ingrese el valor de los libros");
        costlibro = leer.nextDouble();
        
        //Proceso
        System.out.println("Nombre del cliente: " +nombre);
        System.out.println("Tipo del cliente: "+tipo_cliente);
        System.out.println("Cantidad de libros: "+cantlibros);
        System.out.println("Costo por libro: "+costlibro);
        subtotal=costlibro*cantlibros;
        switch (tipo_cliente){
            case 1:{
                desc1=subtotal*0.30;
                subtotal1=subtotal-desc1;
                System.out.println("El descuento es de 30%: " +desc1);
                
            }
            break;
            case 2:{
                desc2=subtotal*0.20;
                subtotal1=subtotal-desc2;
                System.out.println("El descuento es de 20%: " +desc2);
                
            }
            break;
            case 3:{
                desc3=subtotal*0.10;
                subtotal1=subtotal-desc3;
                System.out.println("El descuento es de 10%: " +desc3);
                
            }
            break;
        }
        if(cantlibros>10){
            desca1=subtotal1*0.08;
            subtotal1=subtotal1-desca1;
            System.out.println("El descuento es de 4%: "+desca1);
        }
        else {
            if ((cantlibros>5)||(cantlibros<9)){
                desca2=subtotal1*0.04;
                subtotal1=subtotal1-desca2;
                System.out.println("El descuento es de 8%: " +desca2);
            }
            
        }
        System.out.println("El precio final es: "+subtotal1);
        
        
            
            
            
            
            
            
            
        
    }
    
}

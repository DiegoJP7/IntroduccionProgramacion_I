/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposdedatos;

/**
 *
 * @author diegojp
 */
public class TiposDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("---Programa de tipos de datos, operadores y expreciones en Java");
        System.out.println("Introduccion a la programacion");
        System.out.println("Diego Alfonso Jumbo");
        System.out.println("----");
        
        //Tipos de datos enteros
        
        int num1 = 14;
        int num2 = 2;
        int num3 = num1 + num2;
        System.out.println("El valor de la variable entera num3 es: " +num3);
        
        //Tipos de datos reales - double
        
        System.out.println("----");
        double dec1 = 0.7;
        double dec2 = 9.65;
        double dec3 = dec1 * dec2;
        System.out.println("El valor de la variable decimal dec3 es:  " +dec3);
        
        //Tipos de datos caracter - char
        
        System.out.println("----");
        char letra1 = 'D';
        char letra2 = 'J';
        System.out.println("Los caracteres son: " +letra1 + letra2);
        
        //Tipo de datos tipo cadena - string
        
        String nombre, apellido, domicilio, telefono;
        
        //Inicio de los string
        nombre = "Diego Alfonso";
        apellido = "Jumbo Pardo";
        domicilio = "Av Salvador Bustamante Celi, Urbanizacion Estancia del Rio, Loja - Ecuador";
        telefono = "072711033";
        
        System.out.println("**Presentar variables string**");
        System.out.println("Mi nombre es: " +nombre);
        System.out.println("Mi apellido es: " +apellido);
        System.out.println("Vivo en: " +domicilio);
        System.out.println("mi numero de telefono es: " +telefono);
        System.out.println("\n");
        System.out.println("Me llamo " +nombre+ "" +apellido+", vivo en " +domicilio+", y mi telefono de casa es "+telefono+"\n");
        
        System.out.println("**Presentar en una sola linea**");
        
        System.out.print("Me llamo " +nombre+""+apellido+ ", vivo en "+domicilio+ ", y mi telefono de casa es "+telefono+"\n");
        
        System.out.print("**Presentar concatenar variables de tipo string** \n");
        
        System.out.printf("Me llamo".concat(nombre).concat(apellido).concat(" y vivo en ").concat(domicilio).concat(" y mi telefono es ").concat(telefono));
        
        
                
                
    }
    
}

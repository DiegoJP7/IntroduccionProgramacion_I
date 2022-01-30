/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3_clase;

/**
 *
 * @author diegojp
 */
public class TipoDatos {
    
    public static void main(String[] args) {
        
        //Declarando variables tipo entero
        int num1;
        num1 = 10;
        int num2 = 13;
        
        //Declarando variables tipo decimal
        double num3;
        num3 = 45.789;
        
        double num4 = 23.9;
        
        //Declarar variables tipo char
        char encender = 'S';
        encender = 'N';
        
        //declarar variables tipo cadena
        String cadena;
        cadena = "Diego Alfonso";
        
        String apellido = "Jumbo Pardo";
        
        //Operadores <aritmeticos
        int suma;
        suma = 10 + 15;
        suma = num1 + num2;
        
        System.out.println(suma);
        
        int suma1 = 14 +34;
        
        System.out.println(suma1);
        
        double mult = 13 * 23;
        double mult1 = num1 * num2;
        System.out.println(mult1);
        
        double div = 34.5/12.4;
        double div1 = num1/num2;
        System.out.println(div1);
        
        //operadores condicionales
        System.out.println("--Operadores Condicionales--");
        int a = 34;
        int b = 7;
        
        System.out.println(a > b);//true
        System.out.println(a >= b);//true
        System.out.println(a < b);//false
        System.out.println(a <= b);//false
        System.out.println(a == b);//false
        System.out.println(a != b);//true
        
        System.out.println("--Operadores logicos--");
        System.out.println("--Conjuncion - AND --");
        System.out.println(true && true);// true
        System.out.println(true && false);// false
        System.out.println(false && false);// false
        System.out.println("-----------------");
        System.out.println((a > b)&&(a >= b));
        System.out.println((a == b)&&(b > a));
        
        System.out.println("--Disyuncion - or --");
        System.out.println(true || true);//true
        System.out.println(true || false);// true
        System.out.println(false || false);//false
        
        System.out.println("--Negacion--");
        System.out.println(!true);//false
        System.out.println(!false);//true
        
        System.out.println("---funciones matematicas---");
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.max(12, 10));
        System.out.println(Math.min(45, 1));
    }
    
}

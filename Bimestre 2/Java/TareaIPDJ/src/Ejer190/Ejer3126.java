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
public class Ejer3126 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Variables
        int sdn, nd, n,cn;
        sdn=0;nd=0;
        System.out.println("Por favor, digite un numero entero");
        n = leer.nextInt();
        cn=n;
        if(cn<0){
            cn=-n;
        }
        if(cn==0){
            sdn=0;
            nd+=1;
        }
       
            if(cn>0){
                sdn=sdn+(cn%10);
                nd+=1;
                cn=cn%10;
            
        }
        System.out.println(n+" tiene " +nd+" digitos y la suma de los digitos de " +n + " es: "+sdn );
    }
    
}

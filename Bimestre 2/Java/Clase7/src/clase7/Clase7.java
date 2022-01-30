/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        Scanner leer = new Scanner(System.in);
        int n,divisor,num,menor,i,j,primo;
        n=1;divisor=1;num=1;menor=0;i=1;j=1;primo=0;
        System.out.println("Ingrese el limite");
        n = leer.nextInt();
        
        while (i<=n){
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            for(j=1;j<=num;j++){
                if (num%j==0){
                    
                    divisor=divisor+1;
                    
                    
                }
            }
            if(divisor==2){
                primo=primo+1;
                
                    if(primo==1){
                        menor=num;
                        
                    }
                    if(num<menor){
                        menor=num;
                        
                    }
                }
            
            divisor=0;
            i=i+1;

        }
        System.out.println("el numero menor es "+menor);
            
        System.out.println("-------------------------------------");
       
    }
    
}

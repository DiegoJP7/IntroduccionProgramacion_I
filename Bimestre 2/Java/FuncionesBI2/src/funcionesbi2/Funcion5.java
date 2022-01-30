/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesbi2;

import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Funcion5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,n,numP, denP, potP, factP;
        double suma;
        numP=-1;
        denP=0;
        potP=0;
        suma=0;

        
        
        System.out.println("Ingresa el limite de la serie");
        n=leer.nextInt();
        
        for(i=-1;i<=n; i++){
            numP=Numerador(numP);
            denP=Denominador(denP);
            factP=Factorial(denP);
            potP=Potencia(potP, numP);
            
            System.out.println(numP+"^"+potP+"/"+denP+"!");
            suma= suma + ((numP*potP)/factP);
        }
        System.out.println("La suma de la serie numerica es: "+suma);
    }
    //Funcion para obtener el numerador
    public static int Numerador(int num) {
        num=num+2;
        return num;
    }
    public static int Denominador (int den){
    den=den + 2;
    return den;
    }
    public static int Factorial (int den) {
        int fact, j, i;
        fact=1;
        for(j=1; j<=den; j++) {
            fact = fact* j;
        }
        return fact;
    }
    public static int Potencia(int pot, int numP) {
        pot = pot + 3;
        return pot;
    }
}

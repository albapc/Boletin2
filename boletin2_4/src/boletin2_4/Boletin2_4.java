
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {


    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        int cantInicial, billetes100, billetes20, billetes5, monedas1, resto;
        System.out.println("Introduce cantidade en euros:");
        cantInicial=ler.nextInt();
        billetes100=cantInicial/100;
        resto=cantInicial%100;
        billetes20=resto/20;
        resto=resto%20;
        billetes5=resto/5;
        monedas1=resto%5;
        
       System.out.println("Cantidade total:\n"+billetes100+" billetes de 100€\n"
               +billetes20+" billetes de 20€\n"+billetes5+" billetes de 5€\n"+monedas1+" monedas de 1€.");
    }
    
}

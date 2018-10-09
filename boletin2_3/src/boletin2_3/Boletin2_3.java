
package boletin2_3;

import java.util.Scanner;


public class Boletin2_3 {


    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int cantTotal, eur100, num1, eur20, num2, eur5, num3, eur1, num4; 
        System.out.println("Introduce número de billetes de 100€:");
        eur100=ler.nextInt();
        num1=eur100*100;
        System.out.println("Introduce número de billetes de 20€:");
        eur20=ler.nextInt();
        num2=eur20*20;
        System.out.println("Introduce número de billetes de 5€:");
        eur5=ler.nextInt();
        num3=eur5*5;
        System.out.println("Introduce número de monedas de 1€:");
        eur1=ler.nextInt();
        num4=eur1*1;
        cantTotal=num1+num2+num3+num4;
        System.out.println("Cantidade total:"+cantTotal+".");
      
        }
        
    }
    

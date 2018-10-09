
package boletin2_2;

import java.util.Scanner;


public class Boletin2_2 {

    
    public static void main(String[] args) {
       Scanner ler= new Scanner (System.in);
       double graosC, graosF, graosK;
       System.out.println("Introduce graos centígrados");
       graosC=ler.nextDouble();
       graosF= 32+(9*graosC/5);
       graosK= graosC+273.15f;
       System.out.println("Graos Fahrenheit: "+graosF +".\nGraos Kelvin: "+graosK+".");
    }
    
}


package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {

  
    public static void main(String[] args) {
     Scanner ler= new Scanner(System.in); 
    
     System.out.println("Introduzca el sueldo fijo:");//sueldo bruto
     double sueldoFijo=ler.nextDouble();
     
     System.out.println("Introduzca el importe total de ventas:");//comision
     double importeVentas=ler.nextDouble();
     double comision=(importeVentas*5)/100;
     
     System.out.println("Introduzca kilómetros realizados:");//kilometraje
        double kmTotales= ler.nextDouble();
        double kilometraje= kmTotales*2;
     
     System.out.println("Introduzca número de días de desplazamiento:");//dietas
        double diasDespl=ler.nextDouble();
        double dietas=diasDespl*30;
     
     double sueldoBruto= sueldoFijo+comision+kilometraje+dietas;
     
     //calculo sueldo liquido
     
     double irpf=(sueldoBruto*18)/100;
     int segSoc=36;
     double sueldoLiq= sueldoBruto-(irpf+segSoc);
     
     System.out.println("Sueldo bruto a percibir: "+sueldoBruto+"\nSueldo líquido a percibir: "+sueldoLiq);
    }
    
}


package boletin2_1;

import java.util.Scanner;


public class Boletin2_1 {

    
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        float prezoTarifa, prezoPagado, porcentaxe;
        System.out.println("Introduce prezo da tarifa");
        prezoTarifa=ler.nextFloat();
        System.out.println("Introduce prezo pagado");
        prezoPagado=ler.nextFloat();
        porcentaxe=(100*prezoPagado)/prezoTarifa;
        System.out.println("A porcentaxe total descontada é dun "+porcentaxe+"%.");
    }
    
}

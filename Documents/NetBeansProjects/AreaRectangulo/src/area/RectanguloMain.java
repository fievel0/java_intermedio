
package area;

import java.util.Scanner;

public class RectanguloMain {
    
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);
        System.out.print("Dame la base: ");
        int base = entrada.nextInt();
        
        System.out.print("Dame la altura: ");
        int altura = entrada.nextInt();
        
        Rectangulo mensajero = new Rectangulo(base, altura);
        
        mensajero.impArea();
        
    }
    
}


package suma;

import java.util.Scanner;  //Librería Scanner
public class SumaMain {
    public static void main(String args[]){ //Método main el cual permite ejecución del proyecto, este núnca debe faltar
        
        Scanner entrada = new Scanner(System.in);   //declaración del objeto entrada para recibir por teclado cualquier dato
        
        System.out.println("Dame el primer Valor: ");
        int valorUno = entrada.nextInt();
        
        System.out.println("Dame el segundo Valor: ");
        int valorDos = entrada.nextInt();
        
        Suma valores = new Suma(valorUno, valorDos); //Aqui se construye un mensajero "valores" el cual se declara
                                                     //del tipo que se va a enviar y recibir los datos, separando métodos y 
                                                     //objetos para encapsulamiento. 
                                                     //NOTA: hay que notar que aqui se llevan los datos hacia la clase Suma
                                                     //sin esto no funciona la otra clase.                                          
        valores.Imprimir();
    }
}

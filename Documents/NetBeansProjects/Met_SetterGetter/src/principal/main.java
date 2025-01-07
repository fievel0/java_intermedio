package principal;

import entity.Restaurant;
import java.util.Scanner;
import pagos.Consumo;

/**
 *
 * @author FABIAN
 * Este programa permite hacer un ejemplo de como utilizar los metodos getter y setter
 */
public class main{
    public static void main(String[] args){
        //String redColor = "\u001B[31m";  //si quieres que se active el color rojo debes descomentar estas
        //String resetColor = "\u001B[0m"; //dos lineas, esta sirve para regresar al color negro normal
        System.out.println("BIENVENIDOS AL RESTAURANT LOS BICHOS");
        System.out.println("Ayudanos con tu Nombre: ");
        Scanner entrada = new Scanner(System.in);  //creando un objeto de tipo Scanner, con el nombre entrada
        String nomCli = entrada.nextLine();
        
        Restaurant datos = new Restaurant(nomCli); //creo un objeto con nombre datos del tipo Restaurant
                                                   //la idea es poder llamar a la clase Restautant 
                                                   //y enviarle el nombre del Cliente para instanciar
        
        Consumo datosConsumo = datos.getValor();
       // datosConsumo.setpostre(0); //OJO si descomentamos esta linea quitando solo los // al inicio
                                     //podemos poner valores en lugar del 0, siempre contará con dicho
                                     //valor, esto quiere decir que si le pongo 1, ASI le ponga la compra
                                     //SIN POSTRE el programa siempre dira que hemos consumido postre
                                     //y si le ponemos 0 siempre dira que no hemos consumido POSTRE
                                     
        
        datosConsumo.despedida();        
        //System.out.println(redColor + "Consumio postre? " + datosConsumo.getPostre() + resetColor); //si descomentas esta linea
                                                                                                    //puedes obtener la información
                                                                                                    //privada del argumento postre
                                                                                                    //utilizando el método Setter
                                                                                                    //también se utiliza el color rojo
        
        
    }
}

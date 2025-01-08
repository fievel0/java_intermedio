package entity;

import java.util.Scanner;
import pagos.Consumo;


public class Restaurant{
    Scanner con = new Scanner(System.in);
    private String nombClie=""; // esta variable esta declarada como local
                                //la idea es llamar el contenido de la clase main
    private int ventrada, vsegundo, total, postre;
    private Consumo valor;
    
    public Restaurant(String nomCli){
        this.nombClie = nomCli;   //aqui se instancia la variable del nombre cliente
                                  //para poder llamarlo de la clase main
                                  //se necesita utilizar el comando this, sin este 
                                  //no funciona la instancia entre la variable nombClie
                                  //y la llamada desde la clase main comCli a través del
                                  //constructor Restaurant
    }
    
    private void con_pla(){ //este es un método para hacer los procesos del primer y
        System.out.println("Bienvenido " + nombClie);   // segundo plato
        System.out.println("Ingresa el valor de la entrada ");
        ventrada = con.nextInt();
        System.out.println("Ingresa el valor del segundo plato ");
        vsegundo = con.nextInt();
        total = ventrada + vsegundo; //aqui se obtiene el total
    }
    
    
    public void post(){ //en este método se llama al anterior método para obtner su 
        con_pla();   // información, ojo que estos métodos utilizaron VOID
        System.out.println("Desea postre(1 = Sí, 0 = NO): ");  //aqui la validación del postre
        postre = con.nextInt();
        
        valor = new Consumo(nombClie, total, postre); //este es un objeto de tipo Consumo
                                                      //que es la clase que se va a llamar 
                                                      //y se pasa los argumentos obtenidos
    }
    
    public Consumo getValor() {   //este es un método getter para esta clase 
        if (valor == null) { // con este método se puede obtener acceso a la información
            post();          //privada de la clase Consumo, si se obtuvo postre se llama
        }                   // al método post, caso contrario solo se llama al valor sin
        return valor;       //postre        
    }
    
    
    
}


package suma;

//Clase que contiene los métodos y procesos de la suma, estos son llamados desde los valores ingresasdos 
//en main
public class Suma {
    
    private int vUno, vDos, resultado; //Variables locales de la clase suma
    
    //Constructor en el cual se reciben los valores que viene del main y se los asigna a las variables locales de la clase
    public Suma(int valorUno,int valorDos){ 
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    
    //metodo que contiene el proceso de suma de las cantidades de las variables locales
    private void Operacion(){   //OJO que aqui se pone al método private para ENCAPSULAR 
        resultado = vUno + vDos;
    }
    
    //método que contiene la respuesta del proceso de la suma, OJO que se debe llevar el metodo donde 
    //se realizó la suma
    public void Imprimir(){    //OJO que si va a entregar un valor el método necesita utilizar el VOID
        Operacion(); //Método llamado con el valor de resultado
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    
}

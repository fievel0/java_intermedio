package pagos; //los paquetes estan separados para mejorar la organización

/**
 *
 * @author FABIAN
 */
public class Consumo {
    private String nombre_cliente;
    
    private int totalConsumo, postre;
    
    public Consumo(String nombClie, int total, int postre){ //en este constructor se llama a todos
        this.nombre_cliente = nombClie;                     //los métodos y se instancias sus argumentos
        this.totalConsumo = total;
        this.postre = postre;
    }
    
    private void imprimir(){   //este método imprime resultados
        System.out.println("Bienvenido " + nombre_cliente);
        System.out.println("su consumo total es: " + totalConsumo);
        
        if(postre == 1){
            System.out.println("Usted Consumio postre");
            totalConsumo = totalConsumo + 2;
            System.out.println("su consumo total con postre es: " + totalConsumo);
        }else {
            System.out.println("Usted no consumio postre");
            System.out.println("su consumo total sin postre es: " + totalConsumo);
        }
        
    }
    
    public void despedida(){ //este es el único método publico ya que es llamado para su impresión
        imprimir();          //desde la clase main
        System.out.println("Es un gusto atenderlo " + nombre_cliente + " Vuelva pronto!!!!");
        
    }
    
    //METODOS SETTER Y GETTER
    //Aqui se declaran los métodos mencionados, tomando en cuenta que son ejemplos para 
    //mostrar el uso de estos, Hay que saber también que estos métodos sirven para 
    //ingresar a los argumentos privados sin alterar su sintaxis ni sus modificadores
    //de acceso
    public int getPostre(){  //metodo getter para obtener acceso al argumento privado
       return  postre;
    }
    
    public void setpostre(int postre){ //metodo setter, para mostrar y alterar el contenido 
        this.postre = postre;// de un argumento privado
    }
    
}

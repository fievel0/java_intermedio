
package area;

public class Rectangulo {
    private int vbase, valtura, area;
    
    public Rectangulo(int base, int altura){
        this.vbase = base;
        this.valtura = altura;
    }
        
    private void calArea(){
        area = vbase * valtura;
    }
    
    public void impArea(){
        calArea();
        System.out.println("El area del rectángulo es: " + area);
    } 
}

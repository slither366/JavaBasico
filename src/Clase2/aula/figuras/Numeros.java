
package Clase2.aula.figuras;

public class Numeros {
    
    private final double pi = 3.1415;
    
    public static void main(String[] args) {
        Numeros num=new Numeros();
        num.getPi();
        System.out.println("num.getPi()");
    }
    
    public double getPi(){
        return pi;
    }
}

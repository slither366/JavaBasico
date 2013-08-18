
package Clase3.aula.usuInterface;

public class Oracion implements Capitalizable{

        Oracion(String n){
    texto=n;
    }

    
    private String texto;
    @Override //Polimorfismo SobreEscritura
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override //Polimorfismo SobreEscritura
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
    
    public String agregaPalabra(String t){
             texto=texto.concat(" "+t);
     return texto;

    }
    
}

package Clase2.aula.zoologico;

public class Tigre extends Animal {
    
    //pueden haber muchos constructores, si no lo tiene es implicito
    public Tigre() {
    }
    
    public Tigre(String nombre) {
        this.setNombre(nombre);
    }    
    
    //Overriding
    @Override
    void hacerRuido() {
        //super.hacerRuido(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ruge Grrrr!");
    }

    //Overloading
    void hacerRuido(boolean molestar) {
        if (molestar) {
            System.out.println("rugir y zarpar");
        }
    }

    void hacerRuido(String hambre) {
        System.out.println("Miauuuuu " + hambre);
    }
    
    void zarpar(){
        System.out.println("Estoy dando un zarpaso :_D");
    }
}

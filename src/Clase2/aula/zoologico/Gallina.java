package Clase2.aula.zoologico;

public class Gallina extends Animal {

    String pico;

    public Gallina() {
        this.setNumeroPatas(2);
    }    
    
    //Costructor
    public Gallina(String nombre){
        this.setNombre(nombre);
        this.setNumeroPatas(2);
        
    }
    
    @Override
    void hacerRuido() {
        //super.hacerRuido(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cooo Cooo");
    }

    void picar(){
        System.out.println("Estoy picando mi maiz xD");
    }
    
    
    
}

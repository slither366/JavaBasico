
package Clase2.aula.universo;

public class Universo {
    
    public static void main(String[] args) {
        Hombre hombre = new Hombre();
        hombre.alimentarse();
        hombre.contaminar();
    }
    
    void executeHibrido(){        
        ET alienET = new ET();
        alienET.alimentarse();
        
        Hibrido alf2 = new Hibrido();
        alf2.alimentarse();
        alf2.comerGato();
    }
}

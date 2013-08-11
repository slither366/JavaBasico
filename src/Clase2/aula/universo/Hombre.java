
package Clase2.aula.universo;

import Clase2.aula.universo.interfaces.HumanoInterfaces;
import Clase2.aula.universo.interfaces.SerVivo;

public class Hombre implements SerVivo, HumanoInterfaces{

    @Override
    public void alimentarse() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Comer");
    }

    @Override
    public void comunicar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Hablar");
    }

    @Override
    public void reproducirse() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Reproducir");
    }

    @Override
    public void contaminar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Contaminar");
    }
    
    
    
}


package Clase2.aula.universo;

import Clase2.aula.universo.interfaces.SerVivo;

public class Alienigena implements SerVivo{

    @Override
    public void alimentarse() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("COMER");
    }

    @Override
    public void comunicar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Mentalmente");
    }

    @Override
    public void reproducirse() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Asexualmente");
    }
    
}

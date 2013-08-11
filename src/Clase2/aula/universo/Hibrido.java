
package Clase2.aula.universo;

import Clase2.aula.universo.interfaces.MelmakianoInterface;

public class Hibrido extends Hombre implements MelmakianoInterface{

    @Override
    public void comerGato() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Comer hamburguesa de Gato");
    }
    
}

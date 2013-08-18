/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.aula.usuInterface;

/**
 *
 * @author PCC-DOMINGO
 */
public class Palabra implements Capitalizable {

    private String texto;

    Palabra(String n) {
        texto = n.replaceAll(" ", "");
    }

    @Override
    public String cambiaMayuscula() {

        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
}

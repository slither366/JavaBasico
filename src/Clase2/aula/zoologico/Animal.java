package Clase2.aula.zoologico;

public class Animal {

    private int numeroPatas;
    private String especies;
    private String nombre;
    private double tamaño;

    void hacerRuido() {
        System.out.println("maullar");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getEspecies() {
        return especies;
    }

    public void setEspecies(String especies) {
        this.especies = especies;
    }
    
    void printNombrePatas(){
        System.out.println(this.nombre+" "+this.numeroPatas);
    }
}

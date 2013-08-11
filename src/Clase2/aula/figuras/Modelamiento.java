package Clase2.aula.figuras;

public class Modelamiento {

    public static void main(String[] args) {
        
    }

    public static void doAbstracto() {

        Cuadrado cuadro = new Cuadrado();
        cuadro.setAlto(10d);// tipo double 10.0 = 10d
        cuadro.setAncho(10d);
        //cuadro.setLado(10d);

        System.out.println(cuadro.getArea());
    }
}

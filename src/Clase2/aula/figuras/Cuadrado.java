package Clase2.aula.figuras;

public class Cuadrado extends Shape {

    @Override
    public Double getArea() {
        //esto queria decir que no implementa nada
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double resultado = this.getAlto() * this.getAncho();
        return resultado;
    }
    
    public void setLado(Double lado){
        this.setAlto(lado);
        this.setLado(lado);
    }
}

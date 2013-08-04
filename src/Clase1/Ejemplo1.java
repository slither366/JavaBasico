package Clase1;

import javax.sound.midi.Soundbank;
import javax.swing.JOptionPane;

public class Ejemplo1 {

    public static void main(String[] args) {

        Ejemplo1.ejercicioMatriz();

    }

    public static void ejercicio1() {
        int numeroX = 15;
        int numeroY = 38;

        int numeroTemp = numeroX;
        numeroX = numeroY;
        numeroY = numeroTemp;

        System.out.println("" + numeroX + " " + numeroY);
    }

    public static void ejercicio6() {
        if ((0.0 / 0.0) == (0.0 / 0.0)) {
            System.out.println("0.0");
        }
        boolean letra = true && false;
        System.out.println("" + letra);
    }
    
    public static void ejemploSwitch(){
        int diaSem = 6;
        String texto = " ";
        switch(diaSem){
            case 1: texto="Es Lunes";
                break;
            case 2: texto="Es Martes";
                break;
            case 3: texto="Es Miercoles";
                break;
            case 4: texto="Es Jueves";
                break;
            case 5: texto="Es Viernes";
                break;
            case 6: texto="Es Sabado";
                break;
            case 7: texto="Es Domingo";
                break;    
        }
        System.out.println(""+texto);
    }
    
    public static void ejemploWhile(){
        int numX=0;
        
        do{
            System.out.println(""+numX);
            ++numX;
        }while(numX<6);
    }
    
    public static void ejercicio7(){
        
        /*Supongamos que tenemos una tienda de ropa, sobre la ropa vamos a aplicar 
        un % de descuento según las edades. Si el cliente es menor de edad tendrá 
         un descuento del 15%, si es mayor de 60 año tendrá un descuento del 
      30%. El resto de clientes pagaran la ropa sin descuentos. 
         Tenemos que hacer un programa que guarde el % correcto en una
                 variable (porcentaje) según la edad de la variable cliente.*/
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("ingresa algo"));
        double desc=0;
        
        if(edad<=18){
            desc = 0.15;
        }else if(edad>=60){
            desc = 0.30;
        }else{
            desc = 0;
        }
        System.out.println(""+desc);
        
    }

    public static void ejercicioMatriz(){
        
        int[] matrizNumeros = new int[5];
        matrizNumeros[0] = 648;
        matrizNumeros[1] = 649;
        matrizNumeros[2] = 647;
        matrizNumeros[3] = 6438;
        matrizNumeros[4] = 644;
        
        for (int z = 0; z < matrizNumeros.length; z++) {
            int j = matrizNumeros[z];
            System.out.println(""+j);
        }   
    }
    /*
    public void ejercicioMatrizBi(mes){
        int[] meses = {30,28,31,30,31,30,31,30,31,30,31,30};
        return(mes+1);
    }*/


}


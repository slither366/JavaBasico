/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.aula;

/**
 *
 * @author PCC-DOMINGO
 */
import Clase2.aula.zoologico.Tigre;
import java.util.Date;
public class ClaseObject {
               
       public static void main(String[] srgs){
           //ClaseObject.dotoString();
           ClaseObject.rareCompare();
       }
       // CUANDO DEFINES COMO STATIC NO NECESITAS INSTANCIAR PARA VOLVER A EL
       public static void doEquals(){
           Date fechaNacimiento = new Date();
           //Date fechCumpleaños = fechaNacimiento;
           Date fechaCumpleaños = new Date();
           
           if(fechaNacimiento == fechaCumpleaños){
                System.out.println("Iguales");
            }
           
           if(fechaNacimiento.equals(fechaCumpleaños)){
               System.out.println("Iguales");
           } 
       }
       
           public static void dotoString(){
               Date fechaNacimiento = new Date();
               System.out.println(fechaNacimiento.toString());
           }
           
           public static void overrideToString(){
               ClaseObject myobject = new ClaseObject();
               System.out.println(myobject.toString());//No devuelve atributos por el principio de informacion oculta
           }

           @Override //Sobreescribiendo el método tostring
           //Que pasa si no pone @Override = hace el cambio pero es para que explicitamente lo entiendan los programers.
           public String toString(){
               return "EXPLICAMOS LA CLASE OBJECT";
           }
           
           public static void rareCompare(){
               //Solo si declaras de esta forma estos objetos son iguales
               Integer numero1 = 12;
               Integer numero2 = 12;
               //Si declaras de esta forma, estos objetos son diferentes.
               Integer numeroX = new Integer(12);
               Integer numeroY = new Integer(12);
               
               if(numero1 == numero2){
                   System.out.println("iguales A Y B");
               }
               
               if(numeroX == numeroY){
                   System.out.println("iguales X E I");
               }
               //Solo basta tener el Valor int de uno para que el otro también extraiga su valor Entero.
               if(numeroX.intValue() == numeroY){
                   System.out.println("Estos valores si son Iguales");
               }
               
               if(numeroX.equals(numeroY)){
                   System.out.println("Ver Método con control");
               }
               

               
           }
           
           
             /*CLASE TIGRE PROBAR EN CASA
            @Override
            public boolean equals(Object obj){
                
               Tigre tigreJorge = new Tigre("Jorge");
               Tigre tigreJose = new Tigre("Jorge");

               System.out.println(tigreJorge.equals(tigreJose));
                       //retorna true                
                
                
               if (obj instanceof Tigre) {
                   //Casteando ((Tigre) obj)
                   return ((Tigre) obj).getNombre().equals(this.getNombre());
               }
               return false;

                }     */     

    
}

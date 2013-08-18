package Clase3.aula;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import librerias.utiles;

public class Matematicas {

    public static void main(String[] args) {
        //System.out.println(Matematicas.doOperaciones());
        //Matematicas.doWrapper();
        //Matematicas.doConcatenando();
        // Matematicas.doEstraccion();
        //Matematicas.doReemplazo();
        //Matematicas.useStringBuffer();
        //Matematicas.doFormato();
        //Matematicas.doFormatMoneda();
        //Matematicas.doFormatFecha();
        //Matematicas.doFormatoFecha2();
        //Matematicas.doCompareFechas();
        
        //System.out.println(utiles.stringToDate("asdfa"));
        //Matematicas.doTextoaFecha();// te pedira que valides mediantes excepciones TRY CATCH.
        
    }

    public static void getConstant() {
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }

    public static double doOperaciones() {
        return Math.sqrt(144);
    }

    public static void doWrapper() {
        Integer entero = new Integer(123);
        System.out.println(entero.shortValue());
    }

    public static void doConcatenando() {
        String nombre = "James";
        String apellido = "Gosling";

        if (nombre.equals("James")) {
            System.out.println(nombre + " " + apellido);
        }

        String completo = nombre.concat(" " + apellido);

        if (nombre.equals("James")) {
            System.out.println(completo);
        }
    }

    public static void doEstraccion() {
        String texto = "Tecsup";

        System.out.println("Número de Caracteres: " + texto.length() + "\n");
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.substring(i, i + 1) + "\n");
        }

    }

    public static void doReemplazo() {
        String texto = "java permite crear java applets, javabeans y java servlets";
        System.out.println(texto.replaceAll("java", "JAVA"));
    }

    public static void useStringBuffer() {
        StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");

        sb.insert(11, " en");
        sb.delete(21, sb.length());

        System.out.println(sb);

    }

    public static void doFormato() {
        // Establecer el Locale como US para usar el punto como 
        // separador decimal.
        NumberFormat formatNumero = NumberFormat.getInstance(Locale.US);

        // Agrupar 
        formatNumero.setGroupingUsed(true);
        System.out.println(formatNumero.format(10000000.0045451));

        // No agrupar
        formatNumero.setGroupingUsed(false);
        System.out.println(formatNumero.format(10000000.0045451));

        System.out.println("Con 3 enteros mínimo");
        formatNumero.setMinimumIntegerDigits(3);
        System.out.println(formatNumero.format(12));

        System.out.println("Con 5 enteros máximo");
        formatNumero.setMaximumIntegerDigits(5);
        System.out.println(formatNumero.format(123456));

        System.out.println("Con 4 enteros máximo en los decimales");
        formatNumero.setMaximumFractionDigits(4);
        System.out.println(formatNumero.format(123.981454));

        System.out.println("Con 2 enteros mínimo en los decimales");
        formatNumero.setMinimumFractionDigits(2);
        System.out.println(formatNumero.format(45.2));

    }

    public static void doFormatMoneda() {
        // Formato de moneda
        NumberFormat formatGermany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatGermany.setGroupingUsed(false);
        NumberFormat nfd = NumberFormat.getCurrencyInstance(Locale.US);
        nfd.setGroupingUsed(false);
        Locale lp = new Locale("es", "PE");
        NumberFormat formatPeru = NumberFormat.getCurrencyInstance(lp);
        formatPeru.setGroupingUsed(false);

        System.out.println("Moneda Euro  :" + formatGermany.format(150));
        System.out.println("Moneda Dolar :" + nfd.format(150));
        System.out.println("Moneda Soles :" + formatPeru.format(150));

    }

    public static void doFormatFecha() {

        GregorianCalendar ahora = new GregorianCalendar(Locale.US);

        // Crear una fecha
        //ahora = new GregorianCalendar(1987,9,17);

        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
        //
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
        //
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));
    }

    public static void doFormatoFecha2() {
        Date now = new Date();
        System.out.println(now.getTime());

        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);

        SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        //df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);


        String s = df.format(now);
        String s1 = df1.format(now);
        String s2 = df2.format(now);
        String s3 = df3.format(now);
        String s4 = df4.format(now);
        String s5 = df5.format(now);

        System.out.println("(Default) Hoy es " + s);
        System.out.println("(SHORT)   Hoy es " + s1);
        System.out.println("(MEDIUM)  Hoy es " + s2);
        System.out.println("(LONG)    Hoy es " + s3);
        System.out.println("(FULL)    Hoy es " + s4);
        System.out.println("(CUSTOM)  Hoy es " + s5);

    }

    public static void doCompareFechas() {
        Calendar c1 = new GregorianCalendar(2011, 9, 1);
        Date d1 = c1.getTime();

        Calendar c2 = new GregorianCalendar(2011, 9, 3);
        Date d2 = c2.getTime();

        if (d1.after(d2)) {
            System.out.println("d1 es después que d2");
        }
        if (d1.before(d2)) {
            System.out.println("d1 es antes que d2");
        }

    }
    
    //porque poner THROWS por que puede traer problemas
    public static void doTextoaFecha() throws ParseException{
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date xfecha = dateFormat.parse("14/08/2013");
        System.out.println(xfecha);
    }


}

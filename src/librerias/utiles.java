package librerias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class utiles {

    public static Date stringToDate(String fecha) {

        DateFormat dateFormat = DateFormat.getDateInstance();
        Date xdate = null;
        try {
            xdate = dateFormat.parse(fecha);
        } catch (ParseException e) {
            System.out.println("Error: Formato de fecha incorrecta");
        }

        return xdate;
    }
}

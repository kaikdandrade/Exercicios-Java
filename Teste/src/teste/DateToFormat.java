package teste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToFormat {

    public static void getDateBr() {
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
    }

    public static void getDateSystem() {
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
    }

    public static void getDateTimeBr() {
        System.out.println(new SimpleDateFormat("yyyy/MM/dd hh:mm").format(new Date()));
    }

    public static void getDateTimeSystem() {
        String txtDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        txtDate += " às ";
        txtDate += new SimpleDateFormat("hh:mm").format(new Date());
        System.out.println(txtDate);
    }
}

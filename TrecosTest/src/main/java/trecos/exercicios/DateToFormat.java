package trecos.exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToFormat {

    public String getDateBr() {
        return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    }

    public String getDateUs() {
        return new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    }
}

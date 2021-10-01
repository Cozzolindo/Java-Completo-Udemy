
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main{
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat date3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        date3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date dia1 = date1.parse("30/09/2021");
        Date dia2 = date2.parse("25/06/2018 14:37:59");
        Date actual = new Date();
        Date mili = new Date(System.currentTimeMillis());
        Date zero = new Date(0L);
        Date utc = Date.from(Instant.parse("2018-06-09T15:42:07Z"));

        System.out.println(date2.format(dia1));
        System.out.println(dia2);
        System.out.println(date2.format(actual));
        System.out.println(date2.format(zero));
        System.out.println(date2.format(mili));
        System.out.println(date3.format(utc));
    }
}
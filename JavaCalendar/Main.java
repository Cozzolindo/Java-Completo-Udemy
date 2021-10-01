import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main{
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dia2 = date2.parse("25/06/2018 14:37:59");
        Date actual = new Date();
        Calendar cal2 = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(dia2);
        cal2.setTime(actual);
        int minutes = cal2.get(Calendar.MINUTE);
        cal1.add(Calendar.HOUR_OF_DAY, 4);
        dia2 = cal1.getTime();


        System.out.println(date2.format(dia2));
        System.out.println(dia2);
        System.out.println(minutes);
        
    }
}
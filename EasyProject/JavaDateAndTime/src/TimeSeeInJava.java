import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeSeeInJava {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();

        int hour = c.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
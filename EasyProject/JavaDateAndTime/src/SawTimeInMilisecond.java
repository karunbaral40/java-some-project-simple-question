import java.util.Calendar;

public class SawTimeInMilisecond {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        long millis = c.getTimeInMillis(); // current time in milliseconds
        System.out.println("Current time in milliseconds: " + millis);
    }
}
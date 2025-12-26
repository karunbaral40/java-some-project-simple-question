import java.util.Scanner;
import java.util.GregorianCalendar;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year:");
        // Ensure we handle non-integer input to avoid crashes
        if (sc.hasNextInt()) {
            int year = sc.nextInt();

            // Create an instance of GregorianCalendar to access the method
            GregorianCalendar cal = new GregorianCalendar();

            if (cal.isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Please enter a valid numeric year.");
        }

        sc.close();
    }
}
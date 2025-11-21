import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String s = sc.nextLine();

            String reversed = new StringBuilder(s).reverse().toString();


            if (s.equals(reversed)) {
                System.out.println(s + " is a palindrome.");
            } else {
                System.out.println(s + " is not a palindrome.");
            }
    }
}

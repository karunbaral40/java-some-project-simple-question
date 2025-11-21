import java.util.Scanner;

public class AllTypeOfManupalationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line:");
        String a = sc.nextLine();

        // finding the length
        System.out.println("Length: " + a.length());

        // converting into lowercase
        String lower = a.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // converting into uppercase
        String upper = a.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // trim spaces
        String trimmed = a.trim();
        System.out.println("Trimmed: " + trimmed);

        sc.close();
    }
}

import java.util.Scanner;

public class LowerCaseUpperCase {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a string");
            String s1=sc.nextLine();

            System.out.println("in lower case");
                System.out.println(s1.toLowerCase());
            System.out.println("in upper case");
                System.out.println(s1.toUpperCase());

        }
    }



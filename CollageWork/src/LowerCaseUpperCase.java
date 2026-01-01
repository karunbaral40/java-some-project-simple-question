import java.util.Scanner;

public class LowerCaseUpperCase {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a string");
            String s1=sc.nextLine();
            System.out.println("1.lower case\n2.upper case" );
           int choice=sc.nextInt();
            if (choice==1){
                System.out.println(s1.toLowerCase());
            }else {
                System.out.println(s1.toUpperCase());
            }
        }
    }



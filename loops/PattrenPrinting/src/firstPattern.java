//    Print a simple pattern of stars (*) for 5 rows:
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
import java.util.Scanner;
public class firstPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of i");
        int n=sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }


    }

}

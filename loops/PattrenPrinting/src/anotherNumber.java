import java.util.Scanner;

public class anotherNumber {
    // write a java method to print following pattren :
    //    //12345
    //    //1234
    //    //123
    //    //12
    //    //1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of i");
        int n=sc.nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }
}



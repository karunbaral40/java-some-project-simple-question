import java.util.Scanner;
public class PrintFactriol {
    public static void main(String[] args) {
        //Take a number from the user and print its factorial.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number:");
        int num=sc.nextInt();
        if (num==0){
            System.out.println("the factorial is 1");
        }
       else {
            int n=1;
            for (int i = 1; i <= num; i++) {
               n=i*n;
            }
            System.out.println("the factorial is: " + n);
        }
    }
}

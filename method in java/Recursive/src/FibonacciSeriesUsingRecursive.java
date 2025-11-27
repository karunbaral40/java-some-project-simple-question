import java.util.Scanner;
public class FibonacciSeriesUsingRecursive {
    //write a program to show the Fibonacci Series Using Recursive
    static int recursive(int n){
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
        if(n==0||n==1){
            return n-1;
        } else {
            return recursive(n - 1) + recursive(n - 2); // recursion
        }



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number :");
        int x=sc.nextInt();
        System.out.println("Fibonacci series up to " + x + " terms:");
        for (int i = 0; i < x; i++) {
            System.out.print(recursive(i) + " ");
        }


    }
}

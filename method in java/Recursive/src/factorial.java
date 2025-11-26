import java.util.Scanner;
public class factorial {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
          int fact=  n*factorial(n-1);
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number:");
        int a=sc.nextInt();
        System.out.println("the factorial is " + factorial(a));
    }
}

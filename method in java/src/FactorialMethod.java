import java.util.Scanner;
public class FactorialMethod {
    static int factriol(int a){
        int mul=1;
        for (int i = 1; i <= a; i++) {
            mul=i*mul;
        }
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num1=sc.nextInt();
        int mul=factriol(num1);
        System.out.println("the factriol of " + num1 + " is :"+mul);

    }
}

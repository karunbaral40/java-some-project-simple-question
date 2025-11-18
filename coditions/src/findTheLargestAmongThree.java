import java.util.Scanner;
public class findTheLargestAmongThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number:");
        int num2=sc.nextInt();
        System.out.println("enter the third number:");
        int num3=sc.nextInt();
        if (num1>num2&&num1>num3){
            System.out.println("the first number is greatest");
        } else if (num2>num3) {
            System.out.println("the second number is greatest");
        }
        else {
            System.out.println("the third number is greatest");
        }
    }
}

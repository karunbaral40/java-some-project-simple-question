import java.util.Scanner;

public class HAHAWhenWorksHEHEWhenItDidNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the first number: ");
        int num2=sc.nextInt();
        try{
            float num3=num1/num2;
            System.out.println("HaHa........");
            System.out.println(num3);
        }
        catch (ArithmeticException e){
            System.out.println("HeHe...");
            System.out.println(e);
        }

    }
}

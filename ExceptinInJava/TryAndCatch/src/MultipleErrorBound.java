//Multiple Catch Blocks
//Ask the user to enter two numbers and divide them.
//Use two catch blocks:
//        - One for ArithmeticException
//- One for InputMismatchException
//Print different messages for each error.


import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleErrorBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();

        System.out.println("enter the second number");
        int num2=sc.nextInt();
        try{
            int result=num1/num2;
        }
        catch (ArithmeticException e){
            System.out.println("Error: you can't divide anything by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Error: Please enter only whole numbers.");
        }
        System.out.println("end!!!!");

    }
}

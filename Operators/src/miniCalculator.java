import java.util.Scanner;

public class miniCalculator {
    //write a program to make mini calculator in java using break statent.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float num1 = sc.nextFloat();

        System.out.println("Enter the second number:");
        float num2 = sc.nextFloat();

        System.out.println("Enter operator (+, -, *, /, %):");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Cannot divide by zero.");
                } else {
                    System.out.println("Result = " + (num1 / num2));
                }
                break;

            case '%':
                System.out.println("Result = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid operator!");
        }
    }
}

//making calculator using exception
import java.util.Scanner;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Invalid Input: Strings are not allowed";
    }

    @Override
    public String getMessage() {
        return "Please enter a valid number (decimal or integer)";
    }
}

class Calculator {
    public static double calculate(double num1, double num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0)
                    throw new ArithmeticException("Cannot divide by zero");
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}

public class CalculatorWithException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            if (!sc.hasNextDouble()) {
                throw new InvalidInputException();
            }
            double num1 = sc.nextDouble();

            System.out.println("Enter the second number:");
            if (!sc.hasNextDouble()) {
                throw new InvalidInputException();
            }
            double num2 = sc.nextDouble();

            sc.nextLine(); // clear buffer

            System.out.println("Enter operator (+, -, *, /):");
            String op = sc.nextLine();

            double result = Calculator.calculate(num1, num2, op);
            System.out.println("Result: " + result);

        } catch (InvalidInputException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }
}
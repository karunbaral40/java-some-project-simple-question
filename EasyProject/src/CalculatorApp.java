//- Simple Calculator
//- Make a Calculator class with methods:
//        - add(), subtract(), multiply(), divide().
//        - In the main class, ask the user for two numbers and an operation.
//- Use the methods to perform the calculation.

import java.util.*;

class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void calculate(String op) throws Exception{
        if(op.equals("+")) {
            int sum = num1 + num2;
            System.out.println("The sum of the two numbers is: " + sum);
        }
        else if(op.equals("-")) {
            int diff = num1 - num2;
            System.out.println("The difference of the two numbers is: " + diff);
        }
        else if(op.equals("*")) {
            int mul = num1 * num2;
            System.out.println("The multiplication of the two numbers is: " + mul);
        }
        else if(op.equals("/")) {
            try {
                int div = num1 / num2;
                System.out.println("The division of the two numbers is: " + div);
            }catch (ArithmeticException e){
                System.out.println("division by zero"+e);
            }
        }
        else {
            System.out.println("This operator is not valid");
        }
        throw new Exception("Invalid operator: " + op);
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        try {


            System.out.println("Enter the first number: ");
            calc.setNum1(sc.nextInt());

            System.out.println("Enter the second number: ");
            calc.setNum2(sc.nextInt());

            sc.nextLine(); // consume newline
            System.out.println("Enter the operator (+, -, *, /): ");
            String operator = sc.nextLine();

            calc.calculate(operator);
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
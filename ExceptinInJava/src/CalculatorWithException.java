import java.util.Scanner;

class InvalidInputException extends Exception {
    public String toString() {
        return " don't allow string";
    }

    public String getMassage() throws Exception {
        return "please enter number with decimal or without decimal";
    }
}
    class Calculator{
        double num1;
        double num2;
        String op;
        public double getNum1() {

            return num1;
        }
        public void setNum1(double num1) {
            this.num1 = num1;
        }

        public double getNum2() {

            return num2;
        }

        public String getOp() {
            return op;
        }

        public void setOp(String op) {
            this.op = op;
        }

        public void setNum2(double num2) {
            this.num2 = num2;


    }
}

public class CalculatorWithException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     Calculator C=new Calculator();
            System.out.println("Enter the first number");
            C.setNum1(sc.nextDouble());
            sc.nextLine();
            System.out.println("Enter the second number");
            C.setNum2(sc.nextDouble());
            sc.nextLine();
        System.out.println("enter the operator");
        C.setOp(sc.nextLine());

        }

    }


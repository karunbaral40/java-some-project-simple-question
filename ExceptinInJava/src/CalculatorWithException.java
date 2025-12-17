import java.util.Scanner;

class InvalidInputException extends Exception {
    public String toString() {
        return " don't allow string";
    }

    public String getMassage()  {
        return "please enter number with decimal or without decimal";
    }
}
    class Calculator{
        double num1;
        double num2;
        double result;
        String op;
        Calculator(double  num1,double  num2,String op){
            try {
            if (op.equals("+")){
                result=num1+num2;
                System.out.println("sum:"+result);
            } else if (op.equals("-")) {
                result = num1-num2;
                System.out.println("num1-num2:"+result);
            } else if (op.equals("*")) {
                result=num1*num2;
            }

                else {
                    result=num1/num2;
                    System.out.println("num1/num2:"+result);
            }
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }

        }


    }



public class CalculatorWithException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


            try {
                System.out.println("Enter the first number");
                double num1= sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the second number");
                double num2=sc.nextDouble();
                sc.nextLine();
                System.out.println("enter the operator");
                String Op=sc.nextLine();


                Calculator C=new Calculator(num1,num2,Op);
            }
            catch (Exception e){
                System.out.println(e);
            }


        }

    }


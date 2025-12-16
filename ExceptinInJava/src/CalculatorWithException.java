import java.util.Scanner;
class InvalidInputException extends Exception{
    public String toString(){
        return" don't allow string";
    }
    public String getMassage() throws Exception{
        return "please enter number with decimal or without decimal";
    }
}
public class CalculatorWithException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the first number");
            double num1=sc.nextDouble();
            System.out.println("Enter the second number");
            double num2=sc.nextDouble();
        }
        catch (InvalidInputException e){
            System.out.println(e);
        }
    }
}

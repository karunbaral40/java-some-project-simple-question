import java.util.Scanner;

public class DivisonByZero {
    public static void main(String[] args) {
        int a=6000;
        System.out.println("try to dived a num 6000 by any number");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number");
        int num=sc.nextInt();
        float result;
        
        try{
            result=(float)a/num;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("this is because");
            System.out.println(e);
        }
        System.out.println("end of program");

    }
}

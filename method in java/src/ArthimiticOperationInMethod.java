import java.util.Scanner;
public class ArthimiticOperationInMethod {
    //write a program to using arthimetic operation in java
    static int sum(int a , int b){
        int s=a+b;
        return s;
    }
    static int mul(int a , int b){
        int m=a*b;
        return m;
    }
    static int div(int a , int b){
        int x=a/b;
        return x;
    }
    static int sub(int a , int b){
        int y=a-b;
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int sum=sum(num1 ,num2);
        System.out.println("the sum of given two number is " +sum);
        int mul=mul(num1,num2);
        System.out.println("the multiplication of given two number is " +mul);
        int div=div(num1,num2);
        System.out.println("the division of given two number is " +div);
        int sub=sub(num1,num2);
        System.out.println("the subtraction of given two number is " +sub);



    }
}

import java.util.Scanner;
public class ArthimiticOperationInMethod {
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
        System.out.println("the sum of two number is " +sum);
        int mul=mul(num1,num2);
        System.out.println("the multiplecation of two number is " +mul);
        int div=div(num1,num2);
        System.out.println("the divison of two number is " +div);
        int sub=sub(num1,num2);
        System.out.println("the subtraction of two number is " +sub);



    }
}

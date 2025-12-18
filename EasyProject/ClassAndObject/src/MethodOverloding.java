//2. Method Overloading
//Write a Calculator class with overloaded add() methods:
// - add(int a, int b)
//- add(double a, double b)
//- add(int a, int b, int c)


import java.util.Scanner;

class Calculator{
    static void add(int a, int b){
        int sum=a+b;
        System.out.println("sum is:"+sum);
    }
    static void add(double a, double b){
        double sum=a+b;
        System.out.println("sum is:"+sum);
    }
    static void add(int a, int b , int c){
        int sum=a+b+c;
        System.out.println("sum is:"+sum);
    }

}
public class MethodOverloding {
    public static void main(String[] args) {
        Calculator C=new Calculator();
        C.add(10,20);
        C.add(10.30,20.33);
        C.add(10,20,40);

    }
}

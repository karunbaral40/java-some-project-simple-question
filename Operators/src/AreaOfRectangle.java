import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) {
       // Write a program to calculate the area of a rectangle using arithmetic operators.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length : ");
        float l=sc.nextFloat();
        System.out.println("enter the breadth : ");
        float b=sc.nextFloat();
         float area=l*b;
        System.out.println("the area of the rectangle is " +area);

    }
}

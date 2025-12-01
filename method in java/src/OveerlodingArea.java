//write a program to calculate area and voloum by using method overloading
import java.util.*;
class rectangle{
    int l;
    int b;
    int h;
    static void area(int l ,int b){
        int area=l*b;
        System.out.println("the area is : " + area);
    }
    static void area(int l ,int b ,int h){
        int voloum=l*b*h;
        System.out.println("the area is : " + voloum);
    }
}
public class OveerlodingArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rectangle area=new rectangle();
        System.out.println("enter the length");
        area.l= sc.nextInt();
        System.out.println("enter the breadth");
        area.b= sc.nextInt();
        System.out.println("enter the height");
        area.h= sc.nextInt();

    area.area(area.l,area.b);
    area.area(area.l,area.b,area.h);
    }
}

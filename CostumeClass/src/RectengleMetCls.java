//create a class rectangle  with a method to initilize its side ,calculate area parameter.
import java.util.Scanner;
class rectangle {
    float length;
    float breadth;

    static float area(float length, float breadth) {
        float A = length * breadth;
        System.out.println("the area of given rectangle is: " + A);
        return A;
    }

    static float Parimater(float length, float breadth) {
        float P = 2 * (length + breadth);
        System.out.println("the area of given rectangle is: " + P);
        return P;
    }

}
public class RectengleMetCls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rectangle book=new rectangle();
        System.out.println("enter the length of rectangle :" );
        book.length=sc.nextFloat();
        System.out.println("enter the breadth of rectangle :" );
        book.breadth=sc.nextFloat();
        book.area(book.length,book.breadth);
        book.Parimater(book.length,book.breadth);
    }
    }


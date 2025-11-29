//create a class squre with a method to initilize its side ,calculate area parameter.
import java.util.Scanner;
class square{
    float length;
    static float Area(float length) {
        float A = length * length;
        System.out.println("the area of the square is :"+A);
        return A;
    }
    static float Parameter(float length){
        float P=4*length;
        System.out.println("the paremeter of the square is :"+P);
        return P;
    }
}
public class squreMain {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        square fence=new square();
        System.out.println("enter the length of the square");
        fence.length=sc.nextFloat();
        fence.Area(fence.length);
        fence.Parameter(fence.length);

    }
}


//creating a class cylinder and extend it to circle.
import java.util.Scanner;

class Circles1 {
    public int r;

    Circles1(int r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}

class Cylinder extends Circles1 {
    public int h;

    Cylinder(int r, int h) {
        super(r);
        this.h = h;
    }

    public double volume() {
        return Math.PI * r * r * h;
    }
}

public class CircleAndCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        int radius=sc.nextInt();
        System.out.println("enter the height");
        int height=sc.nextInt();
        Cylinder c = new Cylinder(radius, height);

        System.out.println("Area of base circle: " + c.area());
        System.out.println("Volume of cylinder: " + c.volume());
    }
}

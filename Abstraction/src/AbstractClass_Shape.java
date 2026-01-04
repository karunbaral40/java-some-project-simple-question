//Write an abstract class Shape with:
// - an abstract method double area()
//- an abstract method double perimeter()



import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        double area1 = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area1);
        return area1;
    }

    @Override
    double perimeter() {
        double peri = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + peri);
        return peri;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
        return area;
    }

    @Override
    double perimeter() {
        double peri = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + peri);
        return peri;
    }
}

public class AbstractClass_Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter radius:");
            int radius = sc.nextInt();
            Circle c1 = new Circle(radius);
            c1.area();
            c1.perimeter();
        } catch (InputMismatchException e) {
            System.out.println("Enter a whole number");
            sc.nextLine();
        }

        try {
            System.out.println("Enter length:");
            int length = sc.nextInt();

            System.out.println("Enter breadth:");
            int breadth = sc.nextInt();

            Rectangle r1 = new Rectangle(length, breadth);
            r1.area();
            r1.perimeter();
        } catch (InputMismatchException e) {
            System.out.println("Enter a whole number");
        }
    }
}
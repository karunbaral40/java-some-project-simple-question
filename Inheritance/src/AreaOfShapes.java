//- Create a Shape class with a method area().
//Extend it into Circle and Rectangle
// classes.Override area() to calculate the correct values.
// Base class
class Shape1 {
    public double area() {
        return 0;
    }
}


class Circle1 extends Shape1 {
    int r;

    Circle1(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}


class Rectangle1 extends Shape1 {
    int l, b;

    Rectangle1(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public double area() {
        return l * b;
    }
}


public class AreaOfShapes {
    public static void main(String[] args) {
        Circle1 c = new Circle1(12);
        System.out.println("The area of circle is: " + c.area());

        Rectangle1 r = new Rectangle1(2, 3);
        System.out.println("The area of rectangle is: " + r.area());
    }
}

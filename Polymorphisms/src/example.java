class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class example {
    public static void main(String[] args) {
        Shape s = new Circle();  // dynamic binding
        s.draw();
    }

}

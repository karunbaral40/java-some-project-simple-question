import java.util.Scanner;

class NegativeRadiusException extends Exception {
    @Override
    public String getMessage() {
        return "Make sure the radius value is always positive.";
    }
}

public class Devide {

    public static double area(float r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    public static float divide(int a, int b) {
        return (float) a / b;   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Divide example
        try {
            float result = divide(6, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        // Area example
        System.out.println("Enter the radius:");
        try {
            float r = sc.nextFloat();
            double A = area(r);
            System.out.println("Area is: " + A);
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

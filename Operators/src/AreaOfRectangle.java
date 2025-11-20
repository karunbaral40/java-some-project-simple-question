import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) {
       // Write a program to calculate the Calculate Area of Circle, Rectangle, and Triangle

                Scanner sc = new Scanner(System.in);

                System.out.println("Choose a shape to calculate area:");
                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.print("Enter your choice (1-3): ");

                int choice = sc.nextInt();
                double area = 0;

                switch (choice) {
                    case 1:
                        System.out.print("Enter radius of circle: ");
                        double r = sc.nextDouble();
                        area = 3.1416 * r * r;
                        System.out.println("Area of Circle: " + area);
                        break;

                    case 2:
                        System.out.print("Enter length: ");
                        double l = sc.nextDouble();
                        System.out.print("Enter width: ");
                        double w = sc.nextDouble();
                        area = l * w;
                        System.out.println("Area of Rectangle: " + area);
                        break;

                    case 3:
                        System.out.print("Enter base: ");
                        double b = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double h = sc.nextDouble();
                        area = 0.5 * b * h;
                        System.out.println("Area of Triangle: " + area);
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }

    


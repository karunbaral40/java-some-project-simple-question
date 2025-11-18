import java.util.Scanner;
public class BankInterestCalculator {
    public static void main(String[] args) {
        //Implement a “bank interest calculator” that calculates simple and compound interest using
        // operators, including some conditional logic.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle:");
        float p = sc.nextFloat();
        System.out.println("enter the time:");
        float t = sc.nextFloat();
        System.out.println("enter the rate:");
        float r = sc.nextFloat();
        System.out.println("enter the number of times interest is compounded per year:");
        float n = sc.nextFloat();
        if (p <= 0 || t <= 0 || r <= 0) {
            System.out.println("Error: Principal, Time, and Rate must be greater than 0.");
            return;
        }

        if (n <= 0) {
            System.out.println("Error: Compounding frequency must be at least 1.");
            return;
        }

        // Simple Interest
        double si = (p * t * r) / 100;

        // Compound Interest
        double amount = p * Math.pow((1 + (r / (100 * n))), (n * t));
        double ci = amount - p;

        // Display
        System.out.println("\n--- Interest Results ---");
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);

        // Additional Conditional Logic
        if (ci > si) {
            System.out.println("Compound interest gives you more profit than simple interest.");
        } else {
            System.out.println("Simple interest is higher (unusual case).");

        }
    }
}

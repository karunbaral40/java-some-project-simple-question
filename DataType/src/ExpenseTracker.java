import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        //: Make a small “expense tracker” storing multiple expense values in different types (int, double) and
        // calculate monthly totals, average, and display results.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your monthly food expenses ");
        int foodExp=sc.nextInt();
        System.out.println("Enter your monthly medical expenses ");
        int medicalExp=sc.nextInt();
        System.out.println("Enter your monthly travel expenses ");
        int travelExp=sc.nextInt();
        System.out.println("Enter your monthly education  expenses ");
        int educationExp=sc.nextInt();
        System.out.println("Enter your monthly clothes expenses ");
        float clothesExp=sc.nextFloat();
        double totalExp=foodExp+medicalExp+travelExp+educationExp+clothesExp;
        double avgexp=totalExp/5;
        System.out.println("the total expenses is : "+totalExp);
        System.out.println("the average expenses is : "+avgexp);


    }
}

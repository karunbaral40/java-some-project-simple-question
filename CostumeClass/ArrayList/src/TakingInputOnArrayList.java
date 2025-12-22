import java.util.ArrayList;
import java.util.Scanner;

public class TakingInputOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        for (int i = 0; i < 5; i++) {
            int n=sc.nextInt();
            marks.add(n);
        }
        System.out.println("the elements is:");
        for (int i = 0; i < marks.size(); i++) {
            System.out.print(marks.get(i)+", ");

        }
    }
}

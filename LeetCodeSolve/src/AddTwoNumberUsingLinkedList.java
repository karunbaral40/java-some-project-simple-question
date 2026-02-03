import java.util.LinkedList;
import java.util.Scanner;

public class AddTwoNumberUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        System.out.print("Enter how many numbers for first list: ");
        int size1 = sc.nextInt();
        System.out.println("Enter " + size1 + " numbers:");
        for (int i = 0; i < size1; i++) {
            l1.add(sc.nextInt());
        }

        System.out.print("Enter how many numbers for second list: ");
        int size2 = sc.nextInt();
        System.out.println("Enter " + size2 + " numbers:");
        for (int i = 0; i < size2; i++) {
            l2.add(sc.nextInt());
        }
        int minSize = Math.min(l1.size(), l2.size());

        System.out.println("Sum:");
        for (int i = 0; i < minSize; i++) {
            System.out.print(l1.get(i) + l2.get(i) + " ");
        }
        sc.close();
    }
}
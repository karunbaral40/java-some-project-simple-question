import java.util.ArrayDeque;

public class DeletingElementFromArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(10);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        System.out.println("Before removing:");
        for (int e : l1) {
            System.out.println(e);
        }

        System.out.println();

        boolean removed = l1.remove(2);  // removes the element "2"
        System.out.println("Was element 2 removed? " + removed);

        System.out.println("After removing:");
        for (int e : l1) {
            System.out.println(e);
        }
    }
}
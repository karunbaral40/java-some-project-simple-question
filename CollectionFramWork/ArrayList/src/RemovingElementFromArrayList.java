import java.util.ArrayList;

public class RemovingElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(1,2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        //show the element in java
        System.out.println("Before removing:");
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");

        }
        System.out.println(" ");
        int a=l1.remove(2);
        System.out.println("removed element :"+a);
        System.out.println("After removing:");
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}


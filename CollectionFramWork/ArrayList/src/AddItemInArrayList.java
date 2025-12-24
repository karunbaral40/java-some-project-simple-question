import java.util.ArrayList;

public class AddItemInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(10);
        l1.add(1,2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");

        }

    }
}

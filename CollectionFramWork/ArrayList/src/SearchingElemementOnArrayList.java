import java.util.ArrayList;

public class SearchingElemementOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(1,2);
        l1.add(3);
        l1.add(4);
        l1.add(2);
        l1.add(5);
        l1.add(9);
        l1.add(6);
        l1.add(8);
        l1.add(5);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

// it checks the element
        System.out.println("\n"+l1.contains(3));
// it shows element index from front
        System.out.println("this fro first index:");
            System.out.println(l1.indexOf(5));
// it shows element index from end
        System.out.println("this fro last index:");
            System.out.println(l1.lastIndexOf(5));


        }

    }


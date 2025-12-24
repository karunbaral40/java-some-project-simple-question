import java.util.LinkedList;

public class SearchingElementInLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> A=new LinkedList<>();
        A.add(10);
        A.add(5);
        A.add(11);
        A.add(12);
        A.add(14);
        A.add(15);
        A.add(5);
        A.add(25);
        A.add(35);
        for (int elment:A){
            System.out.print(elment +", ");
        }
        System.out.println();

        System.out.println( "is 10 is in this array  "+A.contains(10));
        // it shows element index from front
        System.out.println("this fro first index:");
        System.out.println(A.indexOf(5));
        // it shows element index from end
        System.out.println("this fro last index:");
        System.out.println(A.lastIndexOf(5));

    }
}

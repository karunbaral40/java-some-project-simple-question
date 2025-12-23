import java.util.LinkedList;

public class SearchElementInLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> A=new LinkedList<>();
        A.add(10);
        A.add(11);
        A.add(12);
        A.add(14);
        A.add(15);
for (int elment:A){
    System.out.print(elment +", ");
}
        System.out.println();
        System.out.println();
//adding on last
A.addLast(90);
//adding on first
        A.addFirst(1);
        for (int elment:A) {
            System.out.print(elment +", ");
        }
    }
}

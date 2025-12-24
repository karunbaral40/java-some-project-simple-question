import java.util.LinkedList;

public class RemovingElementFromLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) +", ");
        }
        System.out.println( "\nremoved element:"+list.remove(6));
        for(int element:list){
            System.out.print(element +", ");
        }

    }
}

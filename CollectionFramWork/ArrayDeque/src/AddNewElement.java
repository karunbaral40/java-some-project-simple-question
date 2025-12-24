import java.util.ArrayDeque;

public class AddNewElement {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        ArrayDeque<String> b = new ArrayDeque<>();
        ArrayDeque<Float> c = new ArrayDeque<>();
//        add integer first
        a.add(12);
        a.add(13);
        a.add(14);
        a.add(15);
        a.add(16);
        a.add(17);
        a.add(18);
        a.add(19);
        System.out.println("Integers ::");
        for (int element : a) {
            System.out.print(element + ", ");
        }
        System.out.println(" ");
//            add strings
            b.add("hello");
            b.add("there");
            b.add("who");
            b.add("are");
            b.add("you");
            b.add("he");
            b.add("he");
            System.out.println("strings ::");
            for (String e : b) {
                System.out.print(e + " ,");
            }
        System.out.println(" ");
//            add float

            c.add(12.5f);
            c.add(13.6f);
            c.add(14.7f);
            c.add(15.8f);
            c.add(16.1f);
            c.add(17.2f);
            c.add(18.3f);
            c.add(19.54f);
            c.add(11.5f);
            c.add(20.5f);
            c.add(21.5f);
            System.out.println("floats  ::");
            for (float f : c) {
                System.out.print(f + " ,");
            }



    }
}
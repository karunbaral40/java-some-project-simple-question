import java.util.ArrayList;

public class StringInArrayList {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");
        str.add("e");
        str.add("f");
        str.add("g");
        str.add("h");
        str.add("i");
        str.add("j");
        str.add("k");
        str.add("l");
        str.add("m");
        str.add("n");
        str.add("o");
        str.add("p");
        str.add("q");
        str.add("r");
        str.add("s");
        str.add("t");
        str.add("u");
        str.add("v");
        str.add("w");
        str.add("x");
        str.add("y");
        str.add("z");
        for (int i = 0; i < str.size(); i++) {
            System.out.print(str.get(i)+ " ");
        }
        //searching the character
        System.out.println("\n is k here");
        System.out.println(str.contains("k"));
        System.out.println("show index of k:");
        System.out.println(str.indexOf("k"));
    }
}

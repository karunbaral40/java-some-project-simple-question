import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add(1, "JavaScript"); // insert at index 1

        // Access
        System.out.println(list.get(0)); // Java

        // Update
        list.set(2, "Ruby");

        // Remove
        list.remove("C++");
        list.remove(0); // by index

        // Iterate
        for (String lang : list) {
            System.out.println(lang);
        }

        // Sort
        Collections.sort(list);
        System.out.println(list);
    }
}

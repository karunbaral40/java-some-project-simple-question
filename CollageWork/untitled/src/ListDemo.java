import java.util.*;
public class ListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicates allowed
        System.out.println(fruits);       // [Apple, Banana, Apple]
        System.out.println(fruits.get(1)); // Banana
    }
}

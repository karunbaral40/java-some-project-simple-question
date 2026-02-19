import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Alice", 95); // overwrites previous value
        System.out.println(scores.get("Bob")); // 85
        for (Map.Entry<String, Integer> e : scores.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}

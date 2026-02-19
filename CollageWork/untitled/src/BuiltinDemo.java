import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class BuiltinDemo {
    public static void main(String[] args) {
        // java.lang (auto-imported)
        String s = "Hello";
        System.out.println(Math.sqrt(16));  // 4.0

        // java.util
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10); nums.add(20);

        // java.io
        File f = new File("test.txt");
        System.out.println(f.exists());
    }
}

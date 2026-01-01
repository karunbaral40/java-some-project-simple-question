import java.util.Scanner;

public class CountVowals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter an string");
        String s = sc.nextLine();

        String s1 = s.toUpperCase();
        int vlen = 0;
        int clen = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vlen++;

            } else if (ch >= 'A' && ch <= 'Z') { // only count letters
                clen++;
            }

        }
        System.out.println("no of vowel" + vlen);
        System.out.println("no of const" + clen);
    }
}

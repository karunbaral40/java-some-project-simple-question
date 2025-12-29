public class equalWithOutUsingOperation {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        boolean isEqual = compareStrings(str1, str2);

        System.out.println("Are the strings equal? " + isEqual);
    }

    public static boolean compareStrings(String s1, String s2) {
        // 1. Check if they point to the same memory (optimization)
        if (s1 == s2) {
            return true;
        }

        // 2. Check for nulls or different lengths
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        // 3. Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
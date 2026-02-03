public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originalNum = x;
        int reversedNum = 0;

        while (x != 0) {
            int digit = x % 10;
            reversedNum = reversedNum * 10 + digit;
            x = x / 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Palindrome sol = new Palindrome();
        int num = 123321;

        if (sol.isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}

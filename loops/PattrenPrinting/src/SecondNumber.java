
//number pattrun
//       12345
//        1234
//        123
//        12
//        1

public class SecondNumber {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 5; i >= 1; i--) {

            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}



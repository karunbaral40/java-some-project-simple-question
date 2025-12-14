//         1
//        222
//        33333
//        4444444
//        555555555

public class NumbePyrimid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


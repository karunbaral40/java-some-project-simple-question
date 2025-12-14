//              1
//             1 1
//            1 2 1
//           1 3 3 1
//          1 4 6 4 1
//        1 5 10 10 5 1
public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 6;  // change this to print more rows

        for (int i = 0; i < rows; i++) {

            // print spaces
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

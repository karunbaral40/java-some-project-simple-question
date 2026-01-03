public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]*arr[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
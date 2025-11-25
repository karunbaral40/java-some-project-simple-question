public class GivenTheNumberIsinTheArrayOrNot {
    public static void main(String[] args) {
        // write a program to find the given number is in array in not.
        int[] num = {10, 12, 33, 63, 44, 55, 43, 52};
        boolean isIn = false;
        for (int element : num) {
            int a = 33;
            if (element == a) {
                isIn = true;
            }
        }

            if (isIn) {
                System.out.println("the number is in the array");
            } else {
                System.out.println("the number is not in the array");
            }
        }
    }


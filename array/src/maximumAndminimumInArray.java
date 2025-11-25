public class maximumAndminimumInArray {
    public static void main(String[] args) {
        //write a program to find the maximum and minimum number in given array

        int[] arr = {11, 22, 33, 44, 55, 2};
        int max = Integer.MIN_VALUE;
        for (int element : arr) {

            if (element >= max) {
                max = element;
            }

        }
        System.out.println("the maximum element in this arr is:" + max);
        int min = Integer.MAX_VALUE;

        for (int e : arr) {
            if (e < min) {
                min = e;
            }
        }

        System.out.println("The minimum element in this array is: " + min);
    }
    }

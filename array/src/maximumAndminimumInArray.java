public class maximumAndminimumInArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 2};
        int max = Integer.MIN_VALUE;
        for (int element : arr) {

            if (element >= max) {
                max = element;
            }

        }
        System.out.println("the maximum element in this arr is:" + max);
        int[] a = {11, 22, 33, 44, 55, 2};
        int min = Integer.MAX_VALUE;

        for (int e : a) {
            if (e < min) {
                min = e;
            }
        }

        System.out.println("The minimum element in this array is: " + min);
    }
    }

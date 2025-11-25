public class ArrayAndCalculateSum {
    public static void main(String[] args) {
        // write a program to sum of the array numbers in the array
        float[] num = {10.4f, 54.5f, 16.4f, 10.3f, 9.34f};
        float sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

        System.out.println("Sum = " + sum);
    }
}

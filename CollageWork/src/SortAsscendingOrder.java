public class SortOrder {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2, 9, 8};

        // 1. ASCENDING ORDER
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorting in ascending order:");
        for (int e : arr) {
            System.out.print(e + "  ");
        }
        System.out.println("\n"); // New line for clarity

        // 2. DESCENDING ORDER
        for (int i = 0; i < arr.length; i++) {
            // Start j at i + 1, just like ascending
            for (int j = i + 1; j < arr.length; j++) {
                // Just flip the sign: if i is LESS than j, swap them
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorting in descending order:");
        for (int f : arr) {
            System.out.print(f + "  ");
        }
    }
}
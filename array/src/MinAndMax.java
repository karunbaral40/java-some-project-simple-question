class MinAndMax {
    public static void main(String[] args) {

        int[] arr = {10, 2, 30, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        int arr_min = arr[0];
        int arr_max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr_min > arr[i]) {
                arr_min = arr[i];
            }
            if (arr_max < arr[i]) {
                arr_max = arr[i];
            }
        }
        System.out.println("the minimum number is:"+arr_min);
        System.out.println("the maximum number is:"+arr_max);
    }
}
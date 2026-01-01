public class FindLargest {
    public static void main(String[] args) {
        int[]arr={2,4,6,3,1,4};
       int max=arr[0];
        for (int e:arr){
            if (max<e){
                max=e;
            }
        }
        System.out.println(max);
    }
}

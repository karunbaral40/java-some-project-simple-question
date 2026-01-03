public class SortAsscendingOrder {
    public static void main(String[] args) {
        int []arr={1,4,3,5,2,9,8};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("sorting in ascending order:");
        for (int e:arr){
            System.out.print(e + "  ");

        }
    }
}

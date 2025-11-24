public class FindArrayIsSortedOrNot {
    public static void main(String[] args) {
        int []arr={12,11,13,14,15};
        boolean isSorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("this array is sorted");
        }
        else{
            System.out.println("this array isn't sorted");
        }
    }
}

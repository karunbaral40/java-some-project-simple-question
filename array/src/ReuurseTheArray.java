public class ReuurseTheArray {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,3,5,6};
        int l=arr.length;
        int a=Math.floorDiv(l,2);
        for (int i = 0; i <a ; i++) {
            int temp;
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;

        }
        for(int element:arr){
            System.out.print(element +" ");
        }
    }
}

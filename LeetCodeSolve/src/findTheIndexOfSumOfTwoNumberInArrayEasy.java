import java.util.Scanner;

public class findTheIndexOfSumOfTwoNumberInArrayEasy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        sc.nextLine();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the numbers");
        arr[i]=sc.nextInt();
        }
        System.out.println("enter the sum ");
        int sum=sc.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==sum){
                    System.out.println("the index is [ " + i +" , "+ j+ " ]");
                    break;
                }

            }

        }
    }
}

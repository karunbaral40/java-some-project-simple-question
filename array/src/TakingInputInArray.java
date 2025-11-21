import java.util.Scanner;
public class TakingInputInArray {
    public static void main(String[] args) {
        //how to take an input in array and print it in console
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element numbers:");
        int n=sc.nextInt();
        System.out.println("enter "+n+"numbers of element:");
        int []marks;
        for (int i = 1; i <=n ; i++) {
            marks[i]=sc.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(marks[i]);


        }
    }
}

import java.util.Scanner;

public class IndexOutOfBund {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int[]arr={12,13,14,15,16,14,16,100};
        System.out.println("enter an array bound between 0-7");
        int n=sc.nextInt();
        try {
            System.out.println( "Value at index " +n +" = " +arr[n]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index is out of bound we have only 0-4 index");
        }

    }
}

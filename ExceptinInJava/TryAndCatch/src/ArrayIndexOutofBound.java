//Create an array of size 5.
//Ask the user to enter an index and print the value at that index.
//If the user enters an invalid index, catch the exception and print an error.

import java.util.Scanner;

public class ArrayIndexOutofBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int[]arr={12,13,14,15,16};
        System.out.println("enter an array bound between 0-4");
        int n=sc.nextInt();
        try {
            System.out.println( "Value at index " +n +" = " +arr[n]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index is out of bound we have only 0-4 index");
        }

    }
}

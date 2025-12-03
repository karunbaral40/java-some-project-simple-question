//Question ( Array + Loop + Condition)
//Create an integer array of size 5.
//Use a for loop to store values
//Use another loop to:
//Print only even numbers using if

import java.util.Scanner;

public class LOOPSandARRAYS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        boolean isodd=true;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter the "+i+" element");
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < 5 ; i++) {
            if(arr[i]%2==0){
                System.out.print("this is odd number in array:");
                System.out.println( arr[i]);

            }
            else {
                System.out.print("this is even number in array : ");
                System.out.println(arr[i]);
            }
        }


    }
}

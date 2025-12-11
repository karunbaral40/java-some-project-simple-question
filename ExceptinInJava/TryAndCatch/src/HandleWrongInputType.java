//Write a program that asks the user to enter an integer.
//If the user enters something that is not an integer (like “abc”),
// catch the exception and print a friendly message.

import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleWrongInputType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");

        try {
            int num=sc.nextInt();
            System.out.println("you entered"+num);
        }
        catch (InputMismatchException e){
            System.out.println("you enter somthing or not an integer");
        }

    }
}

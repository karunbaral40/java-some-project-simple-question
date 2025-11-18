import java.util.Scanner;
public class PositiveNegetivZero {
    public static void main(String[] args) {
        //Check if a number entered by user is positive, negative, or zero
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number:");
        int num=sc.nextInt();
        if (num==0){
            System.out.println("given number is zero.");
        }
        else if(num<0){
            System.out.println("given number is negative");

        }
        else {
            System.out.println("given number is positive");
        }
    }
}

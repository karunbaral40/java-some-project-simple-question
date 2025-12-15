import java.util.Scanner;
import java.util.Random;
public class RockPaperscissor {
    //write a program to make simple rock paper scissors and paper game
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter : \n 1 for rock \n 2 for paper \n3 for scissor");
            int num1 = sc.nextInt();
        Random num=new Random();
        int n=num.nextInt(1,4);
        System.out.println("computer choice:"+n);
        if(num1==1&&n==2||num1==3&&n==1||num1==2&&n==3){
            System.out.println("the user wins!");
        }
        else if(num1==n){

            System.out.println("It's a draw!");
        }
        else{
            System.out.println("computer wins!");
        }

    }
}

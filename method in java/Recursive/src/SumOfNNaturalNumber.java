import java.util.Scanner;
public class SumOfNNaturalNumber {
    //write a java method to print a sum ofn natural number using recursive.
    static int sum(int num) {
        int sum = 0;
        if (num == 1) {
            return 1;
        } else {
            //without using recursion
//            for (int i = 1; i <= num; i++) {
//                sum = sum + i;
//                System.out.println("sum is :" + sum);
//
//            }
            //using recersion
            return num+sum(num-1);
//            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number:");
        int n= sc.nextInt();
        int sum=sum(n);
        System.out.println("sum of 2 num is :" +sum);


        }

    }


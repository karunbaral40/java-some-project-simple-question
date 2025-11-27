import java.util.Scanner;
public class SumOfNNaturalNumber {
    static int sum(int num) {
        int sum = 0;
        if (num == 1) {
            return 1;
        } else {
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
                System.out.println("sum is :" + sum);

            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number:");
        int n= sc.nextInt();
        sum(n);


        }

    }


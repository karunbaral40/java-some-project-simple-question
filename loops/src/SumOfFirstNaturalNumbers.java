import java.util.Scanner;
public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        //Print the sum of first n natural numbers.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number:");
        int n=sc.nextInt();
        int sum=0;
//        System.out.println("using for loop:");
//        for (int i = 1; i <=n ; i++) {
//            sum=sum+i;
//        }
//        System.out.println("sum of first n natural number is:" + sum);
//        System.out.println("using while loop:");
//        int i=1;
//        while(i<=n){
//            sum=sum+i;
//            i++;
//        }
//        System.out.println("sum of first n natural number is:" + sum);
        System.out.println("using do-while loop:");
        int i=1;
        do{
            sum=sum+i;
            i++;
        }while(i<=n);
        System.out.println("sum of first n natural number is:" + sum);
    }
}

import java.util.Scanner;
public class addFirstNeturalNumber {
    //write a program to add first natural number up to n using object
    static int netural(int a){
     int sum=0;
        for (int i = 1; i <=a ; i++) {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the natural number ");
        int num= sc.nextInt();
        int sum=netural(num);
        System.out.println("the sum is"+sum);
    }
}

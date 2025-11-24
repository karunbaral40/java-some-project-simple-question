import java.util.Scanner;
public class FabonishSeriesMethod {
    static int fabonish(int x){
        int a=1;
        int b=0;
        System.out.println("the fabonish series of given number is");

        for (int i = 0; i <=x ; i++) {
            System.out.println(b);
            int next=a+b;
            a=b;
            b=next;

        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int fob=fabonish(a);



    }
}

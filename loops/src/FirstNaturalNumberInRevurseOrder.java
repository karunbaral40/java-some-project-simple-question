import java.util.Scanner;
public class FirstNaturalNumberInRevurseOrder {
    public static void main(String[] args) {
        //Print the first n natural numbers in reverse order.
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number:");
        int n=sc.nextInt();
//        System.out.println("using for loop:");
//        for (int i = n; i >= 1 ; i--) {
//            System.out.println("first n natural numbers in reverse order :"+ i);
//        }
        System.out.println("using while loop");
        int i=n;
        while(i>=1){
            System.out.println("first n natural numbers in reverse order :"+ i);
            i--;
        }
//        System.out.println("using do-while loop");
//        int i=n;
//       do{
//            System.out.println("first n natural numbers in reverse order :"+ i);
//            i--;
//        } while(i>=1);
    }
}

import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        //Print the multiplication table of a given number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=sc.nextInt();
//        System.out.println("using for loop :");
//        for (int i = 1; i <= 10; i++) {
//           int n=i*num;
//            System.out.println(num +" * " + i + " = "+n);
//
//        }
//        System.out.println("using while loop:");
//        int i=1;
//        while(i<=10){
//            int n=num*i;
//            System.out.println(num +" * " + i + " = "+n);
//            i++;
//        }
        System.out.println("using do-while loop:");
        int i=1;
        do{
            int n=num*i;
            System.out.println(num +" * " + i + " = "+n);
            i++;
        }while(i<=10);
    }
}

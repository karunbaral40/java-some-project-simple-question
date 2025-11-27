import java.util.Scanner;
public class MultiplectionTable {
    //write a java method to print a multiplication of number n.
    static void multiplication(int n){
        for (int i = 1; i <=10 ; i++) {

            System.out.println(n+" X "+i+" = " +i*n);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number :");
        int n= sc.nextInt();
        multiplication(n);


    }
}

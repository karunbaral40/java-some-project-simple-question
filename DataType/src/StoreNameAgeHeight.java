import java.util.Scanner;
public class StoreNameAgeHeight {
    public static void main(String[] args) {
        //Store your name, age, and height in appropriate variables and print them.
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name");
        String name=sc.nextLine();

        System.out.println("enter your age");
        int age=sc.nextInt();

        System.out.println("enter your height in foot and inch");
        float height= sc.nextFloat();

        System.out.println("your datils is :");
        System.out.println("Name : " + name +"\nAge : " + age +"\nHeight : " + height);



    }
}

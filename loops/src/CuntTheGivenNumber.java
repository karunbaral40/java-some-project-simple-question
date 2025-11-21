import java.util.Scanner;
public class CuntTheGivenNumber {
    //Count the number of digits in a given number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a long number");
        long n=sc.nextLong();
        int count = 0;
        long temp = n;


        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);



    }
}

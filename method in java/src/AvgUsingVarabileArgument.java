import java.util.Scanner;
public class AvgUsingVarabileArgument {
    //write a program to find an average of numbers using variable argument.
    static  int average(int... arr){
        int sum=0;

        for(int value: arr){
            sum=sum+value;
        }

        return sum;
    }
    //write a java method to find an average of a set of a number passed as argument.
    public static void main(String[] args) {
        float sum=average(1,2,3,4);
        System.out.println("the avrage of 1,2,3,4 is :" +sum/4);

    }
}

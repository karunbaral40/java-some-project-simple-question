import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) {
        //Create a simple BMI calculator using float or double variables for weight and height.
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your height:");
        float height= sc.nextFloat();
        System.out.println("enter your weight:");
        float weight= sc.nextFloat();
        float BMI=weight/height;
        System.out.println("your bmi is :"+BMI);


    }
}

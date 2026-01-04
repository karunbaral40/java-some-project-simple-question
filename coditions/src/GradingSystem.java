import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        //Create a “grading system” where the user enters marks,
        // and you assign grades (A+, A, B+, etc.) using nested conditions or switch.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of the student");
        System.out.println("enter the first subject marks");
        float sub1=sc.nextFloat();
        System.out.println("enter the second subject marks");
        float sub2=sc.nextFloat();
        System.out.println("enter the third subject marks");
        float sub3=sc.nextFloat();
        System.out.println("enter the fourth subject marks");
        float sub4=sc.nextFloat();
        System.out.println("enter the fifth subject marks");
        float sub5=sc.nextFloat();
        float total=sub1+sub2+sub3+sub4+sub5;
        float percentage=(total*100)/500;
        if(percentage>90&&percentage<100){
            System.out.println("A+");
        }
        else if(percentage>80&&percentage<90){
            System.out.println("A");
        }
            else if(percentage>70&&percentage<80){
            System.out.println("B+");
            }
        else if (percentage>60&&percentage<70){
            System.out.println("B");
        }
        else if(percentage>50&&percentage<60){
            System.out.println("C+");
        }
        else if(percentage>40&&percentage<50){
            System.out.println("C");
        }
        else if(percentage>35&&percentage<40){
            System.out.println("D");
        }
        else {
            System.out.println("fail");
        }
        }
    }

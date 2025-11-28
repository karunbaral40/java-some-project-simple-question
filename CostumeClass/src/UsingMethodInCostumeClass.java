//this program shows the process to make costume class and  method in costume class and help to use method in main class.
import java.util.Scanner;
class StudentDetils{
    int age;
    String name;
    public void display(){
        System.out.println("the name of the student is : " + name);
        System.out.println("the age of the student is : " + age);
    }
}
public class UsingMethodInCostumeClass {
    public static void main(String[] args) {
        StudentDetils stu=new StudentDetils();
        StudentDetils stu1=new StudentDetils();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student name : ");
        stu.name=sc.nextLine();
        System.out.println("enter the student age : ");
        stu.age=sc.nextInt();
        sc.nextLine();

        System.out.println("enter the student name : ");
        stu1.name=sc.nextLine();
        System.out.println("enter the student age : ");
        stu1.age=sc.nextInt();
        stu.display();
        stu1.display();



    }
}

//this program shows the process to make another class ini same program and use its method in another class.
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
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student name : ");
        stu.name=sc.nextLine();
        System.out.println("enter the student age : ");
        stu.age=sc.nextInt();
        stu.display();


    }
}

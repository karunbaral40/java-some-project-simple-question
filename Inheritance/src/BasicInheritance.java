//Question (Single Inheritance + Object Creation)
//Create:
//Parent class Person → name, age
//Child class Student → rollNo
//Create child object and print all details.
import java.util.Scanner;
class Person{
    String name;
    int age;

    public void name(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("the name is : "+ name);

    }

}
class NewStudent extends Person{
    int rollNo;
    public void ClassTwo(int rollNo){
        this.rollNo=rollNo;
        System.out.println("the roll no is : " +rollNo);

    }
}
public class BasicInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NewStudent Rn=new NewStudent();
        System.out.println("enter the name : ");
        String name=sc.nextLine();
        System.out.println("enter the age : ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the rollno : ");
        int rollNo=sc.nextInt();

        Rn.name(name,age);
        Rn.ClassTwo(rollNo);

    }
}

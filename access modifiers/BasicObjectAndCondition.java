//Create a class Student with:
//Instance variables: name, age
//Use this keyword in constructor
//Create an object in main()
//Use if-else to check:
//If age ≥ 18 → print "Eligible"
//Else → print "Not Eligible"
import java.util.Scanner;
class student{
    private String name;
    private int age;

    public student(int age , String name){
        this.age=age;
        this.name=name;
        if(age>=18){
            System.out.println(name+" is Eligible");
        }
        else{
            System.out.println(name+" is not Eligible");
        }
    }


}
public class BasicObjectAndCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        System.out.println("enter the name");
        String name=sc.nextLine();

        System.out.println("enter the age");
        int age=sc.nextInt();


        student stu = new  student(age ,name  );


    }
}

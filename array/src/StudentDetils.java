import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//- Create a Student class with fields name, rollNumber, and marks.
//        - Write a program that stores 5 students in an array.
//        - Print the student with the highest marks.
class Student{
    String name;
    int rollNo;
    float marks;
    Student(String name,int rollNo, float marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
}
public class StudentDetils {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] st=new Student[5];
        for (int i = 1; i <= 5; i++) {
            System.out.println("enter the nameof the student "+ i);
            String name=sc.nextLine();

            System.out.println("enter the roll num of :" + name);
            int rollNo=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the marks of roll no :" + rollNo);
            float marks=sc.nextFloat();
            sc.nextLine();

            st[i]=new Student(name, rollNo, marks) ;
        }

        Student topStudent=st[0];
        for (int i = 0; i < st.length ; i++) {
            if(st[i].marks> topStudent.marks){
                topStudent=st[i];
            }

        }
        System.out.println("-----details of the top student-----");
        System.out.println("name: " +topStudent.name);
        System.out.println("roll-no: "+topStudent.rollNo);
        System.out.println("marks: "+topStudent.marks);
        System.out.println("if you want to knw about all student marks or details so press 1");
        int num= sc.nextInt();
        if(num==1){
            for (int i = 1; i <5 ; i++) {
                System.out.println("details of student "+st.length);
                System.out.println("the name is "+st[i].name);
                System.out.println("the rollNo is "+st[i].rollNo);
                System.out.println("the marks is "+st[i].marks);

            }
        }

        }


}

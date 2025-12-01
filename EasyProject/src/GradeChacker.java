//- Grade Checker
//- Create a Student class with:
//        - Fields for name and marks.
//- A method getGrade() that returns A/B/C/D/F based on marks.
//        - In the main class, take input for a student’s marks and print their grade.
import java.util.*;
class Grade{
    private float marks;

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public void Greadcheck(float marks){
        if(marks>=90){
            System.out.println("this is A+");
        }
        else if(marks<90 &&marks>=80){
            System.out.println("this is A");
        }
       else if(marks<80&&marks>=70){
            System.out.println("this is B+");
        }
       else if(marks<70 && marks>=60){
            System.out.println("this is B");
        }
       else if(marks<60 && marks>=50){
            System.out.println("this is C+");
        }
       else if(marks<50 && marks>=40){
            System.out.println("this is C");
        }
       else if(marks<40 && marks>=35){
            System.out.println("this is D");
        }
       else {
            System.out.println("fail!");
        }

    }
}
public class GradeChacker {
    public static void main(String[] args) {
        Grade gd=new Grade();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        gd.setMarks(sc.nextFloat());

        gd.Greadcheck(gd.getMarks());

    }
}

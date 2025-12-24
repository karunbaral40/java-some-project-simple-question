import java.util.ArrayList;
import java.util.Scanner;

//collage detils keeping system
class Student{

    int student_id;
    String student_name;
    double student_fee;
    Student(int id,String name,double fee){
        this.student_id=id;
        this.student_name=name;
       this.student_fee=fee;

    }

}
class courses{
    int teacher_id;
    String teacher_name;
    String accountant_name;
    double salary;
    static void account(){

    }

}


public class CollageManagementSystem {
   static ArrayList<Student> student=new ArrayList<>();
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        System.out.println("---------student details-------");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");

        do{
            System.out.println("Enter your choice!");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    ViewStudents();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }

        }while (choice!=6);
    }
        static void addStudent() {
            System.out.println("Enter the id");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the student name");
            String name=sc.nextLine();
            System.out.println("Enter the student fee");
            double fee=sc.nextDouble();
            student.add(new Student(id,name,fee));
                System.out.println("student added sucessfully!!");
            }

            static void ViewStudents(){
        if(student.isEmpty()){
            System.out.println(" list is empty!!!");
        }
        else{
            for(Student s:student){
                System.out.println(s);
            }
        }

        }
    }



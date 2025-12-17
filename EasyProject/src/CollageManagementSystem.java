import java.util.Scanner;

class collage{
    String accountant_name;
    String teacher_name;
    String course_name;
    String student_name;
    int id;
    double salary;
    double fee;
     void account(){
         System.out.println("------------------------------------");
         System.out.println("the deatils of accountant");
         System.out.println("Name:"+accountant_name);
         System.out.println("Salary:"+salary);

     }
     void student(){
         System.out.println("------------------------------------");
         System.out.println("the deatils of accountant");
         System.out.println("Name:"+student_name);
         System.out.println("student_id:"+id);
     }

     void teacher(){
         System.out.println("------------------------------------");
         System.out.println("the deatils of accountant");
         System.out.println("Name:"+teacher_name);
         System.out.println("Salary:"+salary);
     }
    void courses(){
        System.out.println("------------------------------------");
        System.out.println("the deatils of accountant");
        System.out.println("Name:"+course_name);
        System.out.println("Courses_fee:"+fee);

    }
        }



public class CollageManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student number");
        int Stu_num= sc.nextInt();
        System.out.println("enter the teacher number");
        int Tech_num= sc.nextInt();
        System.out.println("enter the courses number");
        int Cor_num= sc.nextInt();
        System.out.println("enter the Accountent number");
        int Acc_num= sc.nextInt();
        collage C=new collage();
        C.account();
        C.student();
        C.teacher();
        C.courses();
        for (int i = 0; i < Stu_num; i++) {
            System.out.println("enter the student name");
            C.student_name=sc.nextLine();
            
        }


    }
}

//collage detils keeping system
import java.util.InputMismatchException;
import java.util.Scanner;

class collage{
    String accountant_name;
    String teacher_name;
    String course_name;
    String student_name;
    String subject;
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
         System.out.println("Name:"+course_name);
         System.out.println("Courses_fee:"+fee);

     }

     void teacher(){
         System.out.println("------------------------------------");
         System.out.println("the deatils of accountant");
         System.out.println("Name:"+teacher_name);
         System.out.println("Salary:"+salary);
         System.out.println("teaching Subject:"+subject);
     }

        }



public class CollageManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("enter the student number");
            int Stu_num = sc.nextInt();
            sc.nextLine();
            System.out.println("enter the teacher number");
            int Tech_num = sc.nextInt();
            sc.nextLine();
            System.out.println("enter the Accountant number");
            int Acc_num = sc.nextInt();
            sc.nextLine();
            collage C = new collage();


//getting student details
            for (int i = 0; i < Stu_num; i++) {
                System.out.println("enter the student name");
                C.student_name = sc.nextLine();
                System.out.println("enter the student ID");
                C.id = sc.nextInt();
                sc.nextLine();
                System.out.println("enter the Course name");
                C.course_name = sc.nextLine();
                System.out.println("enter the fee of course");
                C.fee = sc.nextDouble();
                sc.nextLine();

            }
            //getting teachers details
            for (int i = 0; i < Tech_num; i++) {
                System.out.println("enter the Teacher name");
                C.teacher_name = sc.nextLine();
                System.out.println("enter How subject this teacher teach");
                int n = sc.nextInt();
                sc.nextLine();
                for (int j = 0; j < n; j++) {
                    System.out.println("enter the teaching subject ");
                    C.subject = sc.nextLine();
                }
                System.out.println("enter the Salary of teacher");
                C.salary = sc.nextDouble();
                sc.nextLine();


            }

            //getting account details
            for (int i = 0; i < Acc_num; i++) {
                System.out.println("enter the accountant name");
                C.accountant_name = sc.nextLine();
                System.out.println("enter the salary of accountant");
                C.salary = sc.nextDouble();
                sc.nextLine();
                C.student();
                C.teacher();
                C.account();
            }
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }



    }


    }


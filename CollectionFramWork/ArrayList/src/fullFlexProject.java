import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Student class
class Student {
    int id;
    String name;
    String course;

    // Constructor
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}

// Main class
public class fullFlexProject  {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 6);
    }
    // Add Student
    static void addStudent() {
        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            list.add(new Student(id, name, course));
            System.out.println("Student Added Successfully!");
        }catch(InputMismatchException e){
            System.out.println(e);
        }
    }

    // View Students
    static void viewStudents() {
        if (list.isEmpty()) {
            System.out.println("No Records Found!");
            return;
        }
        System.out.println("\nID\tName\tCourse");
        for (Student s : list) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.course);
        }
    }

    // Search Student
    static void searchStudent() {
        try {
            System.out.print("Enter ID to search: ");
            int id = sc.nextInt();

            for (Student s : list) {
                if (s.id == id) {
                    System.out.println("Record Found:");
                    System.out.println("ID: " + s.id);
                    System.out.println("Name: " + s.name);
                    System.out.println("Course: " + s.course);
                    return;
                }
            }
            System.out.println("Student Not Found!");
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }

    // Update Student
    static void updateStudent() {
        try {
            System.out.print("Enter ID to update: ");
            int id = sc.nextInt();

            for (Student s : list) {
                if (s.id == id) {
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    s.name = sc.nextLine();
                    System.out.print("Enter New Course: ");
                    s.course = sc.nextLine();
                    System.out.println("Record Updated Successfully!");
                    return;
                }
            }
            System.out.println("Student Not Found!");
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }

    // Delete Student
    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        for (Student s : list) {
            if (s.id == id) {
                list.remove(s);
                System.out.println("Record Deleted Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
}

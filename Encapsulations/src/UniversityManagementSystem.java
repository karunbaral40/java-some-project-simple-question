//- Classes: Person (base), Student, Professor, Staff.
// - Features:
// - Each has name, id, and role‑specific attributes (e.g., Student has courseList, Professor has subject).
// - Use inheritance for common fields.
// - Add an interface Payable for salary calculation (applies to Professor and Staff).
// - Task: Store multiple people in an array or ArrayList and print details using polymorphism.
import java.util.*;

// ------------------ INTERFACE ------------------
interface Payable {
    double calculateSalary();
}

// ------------------ BASE CLASS ------------------
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void printDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// ------------------ STUDENT ------------------
class Student extends Person {
    String courseName;

    Student(String name, int id, String courseName) {
        super(name, id);
        this.courseName = courseName;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Course: " + courseName);
    }
}

// ------------------ STAFF ------------------
class Staff extends Person implements Payable {
    String department;
    double salary;

    Staff(String name, int id, String department, double salary) {
        super(name, id);
        this.department = department;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
    }
}

// ------------------ PROFESSOR ------------------
class Professor extends Person implements Payable {
    String subject;
    double salary;

    Professor(String name, int id, String subject, double salary) {
        super(name, id);
        this.subject = subject;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + calculateSalary());
    }
}

// ------------------ MAIN CLASS ------------------
public class UniversityManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        // ----------- STUDENTS -----------
        System.out.print("Enter number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course Name: ");
            String course = sc.nextLine();

            people.add(new Student(name, id, course));
        }

        // ----------- PROFESSORS -----------
        System.out.print("\nEnter number of Professors: ");
        int p = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < p; i++) {
            System.out.print("Enter Professor Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Professor ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            people.add(new Professor(name, id, subject, salary));
        }

        // ----------- STAFF -----------
        System.out.print("\nEnter number of Staff: ");
        int s = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < s; i++) {
            System.out.print("Enter Staff Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Staff ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            people.add(new Staff(name, id, dept, salary));
        }

        // ----------- POLYMORPHIC OUTPUT -----------
        System.out.println("\n----- UNIVERSITY PEOPLE DETAILS -----");
        for (Person person : people) {
            person.printDetails();
            System.out.println("----------------------------------");
        }

        sc.close();
    }
}

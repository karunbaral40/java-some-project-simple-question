
//- Classes: Person (base), Student, Professor, Staff.
//        - Features:
//        - Each has name, id, and role‑specific attributes (e.g., Student has courseList, Professor has subject).
//        - Use inheritance for common fields.
//        - Add an interface Payable for salary calculation (applies to Professor and Staff).
//        - Task: Store multiple people in an array or ArrayList and print details using polymorphism.

class Person{
    String name;
    int id;
    Person(String name, int id){
        this.name=name;
        this.id=id;
    }
    void printDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

}
class Student extends Person {
    String courseName;

    Student(String name, int id, String courseName) {
        super(name, id);
        this.courseName = courseName;
    }
    void printDetails(){
        super.printDetails();
        System.out.println("course name" + courseName);
    }
}
class Staff extends Person {
    String depertmant;

    Staff(String name, int id, String depertmant) {
        super(name, id);
        this.depertmant = depertmant;
    }
}
class Professor extends Person{
    String Subject;
    Professor(String name ,int id, String Subject )  {
        super(name,id);
        this.Subject=Subject;
    }

}
public class UniversityManagementSystem {
    public static void main(String[] args) {

    }
}

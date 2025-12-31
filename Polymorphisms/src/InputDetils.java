
class Student {
    String name;
    int rollNo;
    float marks;

    void displayDetails(String name, int rollNo, float marks) {

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class InputDetils {
    public static void main(String[] args) {

        Student s = new Student();

        s.displayDetails("John", 20, 36.0f);
    }
}
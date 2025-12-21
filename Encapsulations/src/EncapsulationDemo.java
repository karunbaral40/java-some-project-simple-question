// Student.java
class Student12 {
    // Private data members (encapsulation)
    private String name;
    private int age;
    private String rollNumber;

    // Public getter and setter for 'name'
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Public getter and setter for 'age'
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) { // simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Public getter and setter for 'rollNumber'
    public String getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}

// Main class to test encapsulation
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student12 student = new Student12();

        // Set values using setters
        student.setName("Karun");
        student.setAge(21);
        student.setRollNumber("CS2025");

        // Access values using getters
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}
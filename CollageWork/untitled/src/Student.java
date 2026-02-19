// File: com/school/Student.java
package com.school;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println(rollNo + ": " + name);
    }
}
// File: Main.java
import com.school.Student;
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        s.display(); // 101: Alice
    }
}

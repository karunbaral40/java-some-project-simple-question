
    import java.util.ArrayList;
import java.util.Scanner;

    // --- CLASS 1: Identity ---
    class PersonalInfo {
        String name;
        int roll;

        PersonalInfo(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }
    }

    // --- CLASS 2: Course ---
    class CourseDetails {
        String cName;
        double fee;

        CourseDetails(String cName, double fee) {
            this.cName = cName;
            this.fee = fee;
        }
    }

    // --- CLASS 3: The Student Container ---
    class Student {
        PersonalInfo pInfo;
        CourseDetails cDetails;

        Student(PersonalInfo pInfo, CourseDetails cDetails) {
            this.pInfo = pInfo;
            this.cDetails = cDetails;
        }

        void display() {
            System.out.println("Roll: " + pInfo.roll + " | Name: " + pInfo.name +
                    " | Course: " + cDetails.cName + " | Fee: " + cDetails.fee);
        }
    }

    // --- CLASS 4: The Manager (The one you asked for) ---
    class StudentManager {
        // This class owns the ArrayList
        ArrayList<Student> allStudents = new ArrayList<>();

        // This method handles the logic of creating and adding to the list
        void addNewStudent(String name, int roll, String course, double fee) {
            PersonalInfo pi = new PersonalInfo(name, roll);
            CourseDetails cd = new CourseDetails(course, fee);

            // Wrap them into a Student object
            Student s = new Student(pi, cd);

            // Add to the ArrayList
            allStudents.add(s);
            System.out.println(">> Student added successfully!");
        }

        void printAll() {
            if (allStudents.isEmpty()) {
                System.out.println("No records found.");
            } else {
                for (Student s : allStudents) {
                    s.display();
                }
            }
        }
    }

    // --- MAIN CLASS ---
    public class ObjectClassInsideCostumeClass {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StudentManager manager = new StudentManager();
            String choice;

            do {
                System.out.println("\n--- Input Student Data ---");
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine(); // clear buffer

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Fee: ");
                double fee = sc.nextDouble();
                sc.nextLine(); // clear buffer

                // Call the Manager class to handle the addition
                manager.addNewStudent(name, roll, course, fee);

                System.out.print("Add another? (y/n): ");
                choice = sc.nextLine();
            } while (choice.equalsIgnoreCase("y"));

            System.out.println("\n--- Final Report ---");
            manager.printAll();

            sc.close();
        }
    }


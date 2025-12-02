class Student {
    private int age;   // data hidden

    public void setAge(int age) {   // setter
        this.age = age;
    }

    public int getAge() {   // getter
        return age;
    }
}
public class Example {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        System.out.println(s.getAge());
    }

}

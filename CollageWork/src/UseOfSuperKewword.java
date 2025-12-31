class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
class Person extends Student{
    int age;
    Person(String name, int age){
        super(name);
        this.age=age;

        System.out.println("name :"+name);
        System.out.println("age :"+age);

    }
}
public class UseOfSuperKewword {
    public static void main(String[] args) {
        Person p=new Person("karun",19);
    }
}

 // ----- Parent Class -----
class Animal {              // default access
    private String name;    // private → encapsulation

    protected int age;      // protected → child classes can access

    public Animal(String name, int age) {   // public constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {               // public getter
        return name;
    }

    public void speak() {                   // public method
        System.out.println("Animal makes a sound");
    }
}

// ----- Child Class -----
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {                   // polymorphism
        System.out.println(getName() + " barks!");
    }
}

// ----- Main Class -----
public class publicAndprivateAndprotectedAnddefaultAndEncapsulation {
    public static void main(String[] args) {

        Dog d = new Dog("Tommy", 3);

        System.out.println("Name: " + d.getName());   // accessing private via getter
        System.out.println("Age: " + d.age);          // protected → accessible in subclass

        d.speak();  // polymorphism in action
    }

}

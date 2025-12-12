
abstract class Animal {

    abstract void sound();


    void eat() {
        System.out.println("This animal is eating...");
    }


    void sleep() {
        System.out.println("This animal is sleeping...");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}


class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

public class BigAnimal {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();
        a.eat();
        a.sleep();

        System.out.println("----------------");

        a = new Cat();
        a.sound();
        a.eat();
        a.sleep();

        System.out.println("----------------");

        a = new Cow();
        a.sound();
        a.eat();
        a.sleep();
    }
}
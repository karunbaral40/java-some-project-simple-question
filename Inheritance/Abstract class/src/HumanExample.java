//Create va class Monkey with jump() and bit() methods.
// Create a class Human. this Monkey class and implements BasicAnimal interface with eat() and sleep( methods
abstract class Monkey {
    abstract void jump();
    abstract void bite();
}

interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    @Override
    void jump() {
        System.out.println("Jumping...");
    }

    @Override
    void bite() {
        System.out.println("Biting...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class HumanExample {
    public static void main(String[] args) {
        Human h = new Human();
        h.bite();
        h.jump();
        h.eat();
        h.sleep();


        Monkey m = new Human();
        m.jump();
        m.bite();

        BasicAnimal a = new Human();
        a.eat();
        a.sleep();
    }
}



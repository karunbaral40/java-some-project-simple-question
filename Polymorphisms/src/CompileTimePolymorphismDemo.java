// Parent class
class Vehicle {
    // Overloaded methods (compile-time polymorphism)
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void start(String keyType) {
        System.out.println("Vehicle is starting with " + keyType);
    }
}

// Child class
class Car extends Vehicle {
    // Overloaded methods in child class
    public void start(int speed) {
        System.out.println("Car is starting at speed: " + speed + " km/h");
    }
}

// Main class
public class CompileTimePolymorphismDemo {
    public static void main(String[] args) {
        // Parent class reference pointing to parent object
        Vehicle v1 = new Vehicle();
        v1.start();                // Calls start()
        v1.start("smart key");     // Calls overloaded start(String)

        System.out.println("--------------------");

        // Parent class reference pointing to child object
        Vehicle v2 = new Car();
        v2.start();                // Calls Vehicle's start()
        v2.start("manual key");    // Calls Vehicle's overloaded start(String)

        // Note: v2 cannot directly call start(int) because reference type is Vehicle
        // To access start(int), we need Car reference:
        Car c = new Car();
        c.start(80);               // Calls Car's overloaded start(int)
    }
}
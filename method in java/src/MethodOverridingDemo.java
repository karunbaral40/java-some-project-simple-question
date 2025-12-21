// Superclass
class Vehicle22 {
    // Method to be overridden
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Subclass
class Car44 extends Vehicle22 {
    // Overriding the start method
    @Override
    public void start() {
        System.out.println("Car is starting with a key ignition...");
    }

    // Overriding the stop method
    @Override
    public void stop() {
        System.out.println("Car is stopping using disc brakes...");
    }
}

// Main class to test overriding
public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Reference of Vehicle pointing to Vehicle object
        Vehicle22 v1 = new Vehicle22();
        v1.start(); // Calls Vehicle's start
        v1.stop();  // Calls Vehicle's stop

        System.out.println("--------------------");

        // Reference of Vehicle pointing to Car object (runtime polymorphism)
        Vehicle22 v2 = new Car44();
        v2.start(); // Calls Car's overridden start
        v2.stop();  // Calls Car's overridden stop
    }
}
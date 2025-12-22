// Parent class
class Vehicle11 {
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Child class Car
class Car22 extends Vehicle11 {
    @Override
    public void start() {
        System.out.println("Car starts with a key ignition...");
    }

    @Override
    public void stop() {
        System.out.println("Car stops using disc brakes...");
    }
}

// Another Child class Bike
class Bike22 extends Vehicle11 {
    @Override
    public void start() {
        System.out.println("Bike starts with a kick...");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops using drum brakes...");
    }
}

// Main class
public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        // Parent class reference pointing to parent object
        Vehicle11 v1 = new Vehicle11();
        v1.start(); // Vehicle's method
        v1.stop();

        System.out.println("--------------------");

        // Parent class reference pointing to Car object
        Vehicle11 v2 = new Car22();
        v2.start(); // Car's overridden method
        v2.stop();

        System.out.println("--------------------");

        // Parent class reference pointing to Bike object
        Vehicle11 v3 = new Bike22();
        v3.start(); // Bike's overridden method
        v3.stop();



    }
}
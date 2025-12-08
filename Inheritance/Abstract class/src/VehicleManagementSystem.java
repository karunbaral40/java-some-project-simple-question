//- Create an abstract class Vehicle with:
//        - A field speed (int).
//        - A constructor to initialize speed.
//        - A concrete method displaySpeed() that prints "Current speed: <speed> km/h".
//        - An abstract method fuelType() that each subclass must implement.
//        - Create three subclasses:
//        - Car → prints "Fuel type: Petrol".
//        - Bike → prints "Fuel type: Diesel".
//        - ElectricScooter → prints "Fuel type: Electricity".
//        - In the main() method:
//        - Create an array of Vehicle objects (Car, Bike, ElectricScooter).
//        - Loop through the array and call both displaySpeed() and fuelType().

abstract class Vehicle{
    int speed;
    Vehicle(int speed){
        this.speed=speed;
    }
    public void speed(){
        System.out.println( "Current speed: "+ speed+ "km/h");
    }
    abstract public void fuelType();
}
class Car extends Vehicle{
    Car(int speed){
        super(speed);
    }
    public void fuelType(){
        System.out.println("Fuel type: Petrol");
    }
}
class Bike extends Vehicle{
    Bike(int speed){
        super(speed);
    }
    public void fuelType(){

        System.out.println("Fuel type: Diesel");
    }
}
class ElectricScooter extends Vehicle{
    ElectricScooter(int speed){
        super(speed);
    }
    public void fuelType(){
        System.out.println("Fuel type: Electricity");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Vehicle v1=new Car(10);
Vehicle v2=new Bike(20);
        Vehicle v3=new ElectricScooter(5);
v1.fuelType();
v1.speed();
v2.fuelType();
        v2.speed();
v3.fuelType();
        v3.speed();

    }
}

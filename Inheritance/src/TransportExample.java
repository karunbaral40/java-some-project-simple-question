//- Create an abstract class Transport with abstract method move(). Extend it into Car, Bike, and Train.
//- Add fields like speed and capacity.
//        - Demonstrate polymorphism by storing different transports in a list and calling move().
//        - Bonus: Add an interface Fuel with method refuel() and implement it in Car and Bike.
abstract  class Transport{
    int speed;
    int capacity;
    Transport(int speed,int capacity){
        this.speed=speed;
        this.capacity=capacity;

    }
   abstract void move();
   abstract void capacity();
}
interface Fuel{
    void Refuel();
}


class car1 extends Transport implements Fuel{
    car1(int speed, int capacity){
        super(speed, capacity);
    }
    @Override
    void move( ) {
        System.out.println("speed is "+ speed +"kh/hrs");
    }


    @Override
    public void capacity(){
        System.out.println("the capacity is "+ capacity +" of people");
    }
    @Override
    public void Refuel() {
        System.out.println("fuel low....");
    }
}
class Bike1 extends Transport implements Fuel {
    Bike1(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    void move() {
        System.out.println("Bike moves at " + speed + " km/h.");
    }

    @Override
    void capacity() {
        System.out.println("Bike capacity: " + capacity + " passenger(s).");
    }
    @Override
    public void Refuel() {
        System.out.println("Bike is refueling...");
    }
}
class Train extends Transport {
    Train(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    void move() {
        System.out.println("Train moves at " + speed + " km/h.");
    }

    @Override
    void capacity() {
        System.out.println("Train capacity: " + capacity + " passengers.");
    }
}




public class TransportExample {
    public static void main(String[] args) {
Transport [] Transport={
        new car1(120,5),
        new Bike1(120,2),
        new Train(500,50)
};
for (Transport t:Transport){
    t.move();
    t.capacity();
}
Fuel car=new car1(120,5);
Fuel Bike=new Bike1(120,2);
        car.Refuel();
Bike.Refuel();


    }
}

// Define an interface called Vehicle with methods start() and stop().
// Create two classes Car and Bike that implement Vehicle.
// Each should print a message when start() and stop() are called.
// Finally, write a main method to demonstrate polymorphism using the interface.
interface Vehicle2{
    public void start();
    public void stop();
}
class dukeBike implements Vehicle2{
   public void start(){
        System.out.println("start the bike");
    }
   public void stop(){
        System.out.println("stop the bike");
    }
}
class hondacar implements Vehicle2{
    public void start(){
        System.out.println("start the car");
    }
    public void stop(){
        System.out.println("stop the bike");
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle2 vc=new dukeBike();
        vc.start();
        vc.stop();
        Vehicle2 ca=new hondacar();
        ca.start();
        ca.stop();

    }
}

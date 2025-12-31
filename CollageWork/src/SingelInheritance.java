class Vehicle {
    void start(){
        System.out.println("starting......................");
    }
}
class car extends Vehicle{
    void stop(){
        System.out.println("stoping............");
    }
}
public class SingelInheritance {
    public static void main(String[] args) {
        car c=new car();
        c.start();
        c.stop();
    }
}

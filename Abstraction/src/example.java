abstract class Vehicle1 {
    abstract public void start();
}

class Bike1 extends Vehicle1 {
   public void start() {
        System.out.println("Bike starts");
    }
}
public class example {
        public static void main(String[] args) {
            Vehicle1 v = new Bike1();
            v.start();
        }
    }



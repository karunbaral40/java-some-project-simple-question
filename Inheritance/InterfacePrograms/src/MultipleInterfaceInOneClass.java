interface Break{
    void stop();
        }
interface Accelerator{
    void speed();
}
interface Gear{
    void gearUp();
    void gearDown();
}
class Bike implements Break,Accelerator,Gear{
    @Override
    public void stop() {
        System.out.println("it helps to stop a bike");
    }

    @Override
    public void speed() {
        System.out.println("it can increase speed");
    }

    @Override
    public void gearUp() {
        System.out.println("gear up by one");
    }

    @Override
    public void gearDown() {
        System.out.println("it helps to gear down by one");
    }
}
public class MultipleInterfaceInOneClass {
    public static void main(String[] args) {
        Bike B= new Bike();
        B.stop();
        B.speed();
B.gearUp();
        B.gearDown();
    }
}

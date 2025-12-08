//- Define an abstract class Appliance with abstract method turnOn().
// Implement it in WashingMachine and Microwave.
abstract class BasicFunction{
    abstract  void TrunOn();
    abstract  void TrunOff();

}
class WashingMachine extends BasicFunction{
    @Override
    void TrunOn() {
        System.out.println("washing machine turning on....");
    }
    @Override
    void TrunOff() {
        System.out.println("washing machine turning off....\n \n \n");
    }
}
class MicroOven extends BasicFunction{
    @Override
    void TrunOn() {
        System.out.println("MicroOven machine turning on....");
    }
    @Override
    void TrunOff() {
        System.out.println("MicroOven machine turning off....");
    }
}

public class DigitalOnOrOff {
    public static void main(String[] args) {


        WashingMachine WM = new WashingMachine();
        WM.TrunOn();
        WM.TrunOff();
        MicroOven MO = new MicroOven();
        MO.TrunOn();
        MO.TrunOff();
    }
}

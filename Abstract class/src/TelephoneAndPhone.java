//Create a class TelePhone with ring(), lift() and disconnect() methods as abstract methods.
//Create another class Smart Telephone and demonstrate polymorphism
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnet();
}
class SmartTelephone extends Telephone{
    @Override
    void ring() {
        System.out.println("rington...");
    }

    @Override
    void lift() {
        System.out.println("hello speaking...");
    }

    @Override
    void disconnet() {
        System.out.println("cull cut..");
    }
    void camera(){
        System.out.println("clicking photo...");
    }
    void mp3player(){
        System.out.println("music playing....");
    }
}
public class TelephoneAndPhone {
    public static void main(String[] args) {
        Telephone th=new SmartTelephone();
        th.disconnet();
        th.lift();
        th.ring();;


    }
}

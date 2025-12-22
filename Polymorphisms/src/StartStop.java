class v{
    public void start(){
        System.out.println("starting.....");
    }
}
class B extends v{
    public void start(int speed){
        System.out.println(" it's starting....." + speed);
    }

}
public class StartStop {
    public static void main(String[] args) {
        v v1= new v();
        v1.start();

        v v2= new B();
        v2.start();

    }

}

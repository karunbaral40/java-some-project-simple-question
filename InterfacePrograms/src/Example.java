interface Bicycle{
    public void applyBreak(int decrement);
    public void speedUp(int increment);
}
class NewBrand implements Bicycle{
    int speed=5;
   public void applyBreak(int decrement){
        speed=speed-decrement;
       System.out.println("the decrease speed :"+speed);
    }
    public void speedUp(int increment){
        speed=speed-increment;
        System.out.println("the increase speed :"+speed);

    }
}
public class Example {
    public static void main(String[] args) {
        NewBrand NB=new NewBrand();
       NB.applyBreak(3);
        NB.speedUp(4);
    }
}

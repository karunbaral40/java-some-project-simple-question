class Human{
    void eat(){
        System.out.println("Human is eating...");
    }
}
class Boy extends Human{
    @Override
    void eat(){
        System.out.println("Boy is eating...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Boy b= new Boy();
        b.eat();
    }
}

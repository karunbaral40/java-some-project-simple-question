class Shapes{
    void area(){
        System.out.println("this is area");
    }
}
class Circle1 extends Shapes{
void parameter(){
        System.out.println("this is parameter");
    }
        }
        class Rectangle extends Circle1{
    void volume(){
        System.out.println("this is volume");
    }
        }
public class MultipleInheritance {
    public static void main(String[] args) {
Rectangle r=new Rectangle();
r.volume();
r.area();
r.parameter();
    }
}

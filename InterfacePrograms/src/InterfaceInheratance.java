interface cycle{
    void wheel();
    void handel();
}
interface HeroBicycle extends cycle{
    void gear();
    void motar();
}
class HeroV2 implements HeroBicycle{
    public void wheel(){
        System.out.println("wheel....");
    }

    @Override
    public void handel() {
        System.out.println("turn right or left ");
    }

    @Override
    public void gear() {
        System.out.println("up and down");
    }

    @Override
    public void motar() {
        System.out.println("automation");
    }
}
public class InterfaceInheratance {
    public static void main(String[] args) {
HeroV2 Bk=new HeroV2();
Bk.wheel();
Bk.handel();
Bk.gear();
Bk.motar();
    }
}

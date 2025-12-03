//Question (instanceof + Override + Casting)
// Using previous Shape → Circle:
// Check object using instanceof
// Cast it into Circle
// Call a Circle-only method
class Shapes {
    public void drew() {
        System.out.println("drawing.....");
    }
}

class Circles extends Shapes {
    @Override
    public void drew() {
        super.drew();
        System.out.println("circle drawing........");
    }


    public void circleOnlyMethod() {
        System.out.println("This is a Circle-only method!");
    }
}

public class instanceofAndOverrideAndCasting {
    public static void main(String[] args) {

        Shapes sc = new Circles();
        sc.drew();

        if (sc instanceof Circles) {
            System.out.println("sc is an instance of Circles");
            Circles c = (Circles) sc;
            c.circleOnlyMethod();
        }

        Shapes s2 = new Shapes();
        s2.drew();
        System.out.println("s2 instanceof Circles? " + (s2 instanceof Circles));
    }
}
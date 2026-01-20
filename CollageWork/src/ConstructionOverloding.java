class Over{
    Over(int a) {
        System.out.println("the value of a is "+a);
    }
    Over(int a,int b) {
        System.out.println("the value of a & b is "+a+" "+b);
    }
}
public class  ConstructionOverloding {
    public static void main(String[] args) {
        Over o=new Over(10);
        Over l=new Over(10 ,20);
    }
}

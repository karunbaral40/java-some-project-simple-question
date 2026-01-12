interface A{
    void demo(int a);
}
public class UsingLamdaOerationWithParameatr {
    public static void main(String[] args) {
        A a=(int x )-> System.out.println("the value of a is :"+x);
    a.demo(5);
    }
}

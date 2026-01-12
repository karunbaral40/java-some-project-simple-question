interface A{
    void demo(int a);
}
public class UsingLamdaOerationWithParameatr {
    public static void main(String[] args) {
        A b=a -> System.out.println("the value of a is :"+a);
    b.demo(5);
    }
}

interface lamda{
    void demo(int a,int b);
}
public class lamdaAndTwoParamater {
    public static void main(String[] args) {
        lamda l=(a,b)-> System.out.println("value of a and b are:"+a+" , "+b);
        l.demo(10,30);
    }
}

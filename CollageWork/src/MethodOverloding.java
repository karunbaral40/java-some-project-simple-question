class over1{
    void first(int a){
        System.out.println("the value of a is:"+a);
    }
    void first(int a,int b){
        System.out.println("the value of a and b are:"+a+"  " +b);
    }
}
public class MethodOverloding {
    public static void main(String[] args) {
        over1 o=new over1();
        o.first(10);
        o.first(10,20);
    }
}


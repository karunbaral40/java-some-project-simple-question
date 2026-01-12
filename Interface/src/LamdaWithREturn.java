interface b {
    int cat(int a, int x);
}

public class LamdaWithREturn {
    public static void main(String[] args) {
//        b s = (a, x) -> {
//            return a + x;
//        };
//
//        int re = s.cat(5, 10);
//        System.out.println("the sum is : " + re);
        b s=(a,x)->a+x;
        int re=s.cat(10,20);
        System.out.println("th result is : "+re);
    }
}
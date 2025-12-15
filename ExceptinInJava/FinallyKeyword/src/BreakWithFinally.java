public class BreakWithFinally {

    public static void main(String[] args) {
        int a=10;
        int b=9;
while (true){
    try{
        int c=a/b;
        System.out.println("the value of c is :" + c);
    } catch (Exception e) {
        System.out.println(e);
        break;
    }
    finally {
        System.out.println("the value of b is :"+b +"\n");
    }
    b--;
}




    }
}

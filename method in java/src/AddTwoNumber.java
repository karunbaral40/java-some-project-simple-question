public class AddTwoNumber {
    static int numbers(int a ,int b){
        int c;
//        here i can check that if i change the value of a then it will change a program or not
//        a=10;
        c=a+b;
        return c;
    }
    public static void main(String[] args) {
        int x=15;
        int y=20;
        int z=numbers(x,y);
        System.out.println(z);

    }
}

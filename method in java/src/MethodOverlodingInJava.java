public class MethodOverlodingInJava {
    static void simple(){
        System.out.println("hello students!");

    }
    static void simple(int a){
        System.out.println("hello "+a +" students!");
    }
    static void simple(int a,int b){
        System.out.println("hello "+a+" boys and "+b+" girls!");


    }

    public static void main(String[] args) {
        simple();
        simple(100);
       simple(50,50);
    }
}

//For understand how it works
class threads extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("hello its first");
        }
    }
}
class threads2 extends Thread{
    public void run(){
    int i=0;
    while(i<1000){
        System.out.println("hello its second");
    }
    }
}
public class SimpleExample {
    public static void main(String[] args) {
        threads t1=new threads();
threads2 t2=new threads2();
t1.start();
t2.start();
    }
}

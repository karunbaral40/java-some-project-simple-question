//syntax + how its works
class ThreadA implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("hello!! its first");
            i++;
        }
    }

    class ThreadB implements Runnable {
        @Override
        public void run() {
            int i = 0;
            while (i < 1000) {
                System.out.println("hello!! its second");
                i++;
            }
        }
    }
}

public class Example {
    public static void main(String[] args) {
        // First thread
        ThreadA t1 = new ThreadA();
        Thread T1 = new Thread(t1);

        ThreadA.ThreadB t2 = t1.new ThreadB();
        Thread T2 = new Thread(t2);

        T1.start();
        T2.start();
    }
}
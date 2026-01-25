public class ThreadLifeCycle extends Thread {
    public void run() {
        System.out.println("hello");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle l = new ThreadLifeCycle();

        System.out.println(l.getState()); 
        l.setPriority(10);
        System.out.println(l.getState());
        System.out.println(Thread.currentThread().getState());

        l.start();
        Thread.sleep(100);

        System.out.println(l.getState());
        l.join();
        System.out.println(l.getState());
    }
}
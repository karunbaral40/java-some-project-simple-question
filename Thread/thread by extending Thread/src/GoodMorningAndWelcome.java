class Morning extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("good morning!!!!!");
            i++;
        }
    }
}
    class welcome  extends Thread{
        @Override
        public void run() {
            int i=0;
            while (i<10000){
                System.out.println("welcome!!!!!");
                i++;
            }
        }
    }

public class GoodMorningAndWelcome {
    public static void main(String[] args) {
       welcome wc=new welcome();
       Morning m=new Morning();
       wc.start();
       m.start();
    }
}

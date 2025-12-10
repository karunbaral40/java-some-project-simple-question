class Morning1 extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(200);
        }
        catch (Exception e){
            System.out.println(e);
        }
        int i = 0;
        while (i < 10000) {
            System.out.println("good morning!!!!!");
            i++;
        }
    }
}
class welcome1  extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<10000){
            System.out.println("welcome!!!!!");
            i++;
        }
    }
}

public class GoodMorningAndWelcomeWithSleep  {
    public static void main(String[] args) {
        welcome1 wc=new welcome1();
        Morning1 m=new Morning1();
        wc.start();
        m.start();
    }
}


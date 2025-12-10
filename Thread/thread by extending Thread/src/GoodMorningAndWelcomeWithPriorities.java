
class goodMorning extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("good morning!!!!!");
            i++;
        }
    }
}
class welcomeToYou  extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<10000){
            System.out.println("welcome!!!!!");
            i++;
        }
    }
}

public class GoodMorningAndWelcomeWithPriorities  {
    public static void main(String[] args) {
        welcomeToYou wc=new welcomeToYou();
        goodMorning m=new goodMorning();
        wc.setPriority(4);
        m.setPriority(10);
        wc.start();
        m.start();
    }
}

class morning implements Runnable{

   public void run() {
       int i=0;
       while (i<10000){
            System.out.println("good morning!!!!");
            i++;
        }
    }
}
class wellcome implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("welcome!!!!");
            i++;
        }
    }
}
public class WellcomeAndGoodMorning {
    public static void main(String[] args) {
        wellcome wc=new wellcome();
        Thread well=new Thread(wc);
        morning m=new morning();
        Thread mor=new Thread(m);
        well.start();
        mor.start();
    }

    }


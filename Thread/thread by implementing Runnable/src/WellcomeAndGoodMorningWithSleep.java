
class morning2 implements Runnable{

    public void run() {
        try{
            Thread.sleep(200);
        }
        catch (Exception e){
            System.out.println(e);
        }
        int i=0;
        while (i<10000){
            System.out.println("good morning!!!!");
            i++;
        }
    }
}
class wellcome2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("welcome!!!!");
            i++;
        }
    }
}
public class WellcomeAndGoodMorningWithSleep {

    public static void main(String[] args) {
        wellcome2 wc=new wellcome2();
        Thread well=new Thread(wc);

        morning2 m=new morning2();
        Thread mor=new Thread(m);
        well.start();
        mor.start();
    }

}


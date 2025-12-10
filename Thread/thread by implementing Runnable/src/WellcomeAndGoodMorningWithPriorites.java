class morningEveryone implements Runnable{

    public void run() {
        int i=0;
        while (i<10000){
            System.out.println("good morning!!!!");
            i++;
        }
    }
}
class wellcomeHere implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("welcome!!!!");
            i++;
        }
    }
}
public class WellcomeAndGoodMorningWithPriorites  {
    public static void main(String[] args) {
        wellcomeHere wc=new wellcomeHere();
        Thread well=new Thread(wc);
        morningEveryone m=new morningEveryone();
        Thread mor=new Thread(m);
        well.setPriority(10);
        mor.setPriority(1);
        well.start();
        mor.start();
    }

}


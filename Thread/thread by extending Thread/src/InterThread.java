class Costumer{
    int amount=10000;
    synchronized void withdraw(int amount){
        if(this.amount<amount){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }

        }
        this.amount-=amount;
        System.out.println("Withdraw completed "+this.amount);
    }
    synchronized void deposit(int amount){
        this.amount+=amount;
        System.out.println("deposit completed"+this.amount);
        notify();
    }


}
public class InterThread {
    public static void main(String[] args) {
        Costumer c=new Costumer();
        new Thread  (()->c.withdraw(15000)).start();
        new Thread  (()->c.deposit(15000)).start();
    }
}

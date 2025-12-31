
public class BankAccount {
    private double balance;
    public void deposit(double amount){
        balance+=amount;
        System.out.println("deposit :"+amount);
    }
    public void withdraw(double amount){
        balance-=amount;
        System.out.println("withdraw :"+amount);
    }


    public void displayBalance(){
        System.out.println("Balance:"+balance);
    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.deposit(1000);
        b.withdraw(200);
        b.displayBalance();
    }
}

import java.util.Scanner;

//- Create a BankAccount class with private fields accountNumber and balance.
//        - Add getters and setters with validation (e.g., balance cannot be negative).
//        - Write a test program that deposits and withdraws money safely
class BankAccount{
    private long accountNumber;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
public class BankManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount Bank= new BankAccount();
        System.out.println("enter the balance");
        Bank.setBalance(sc.nextDouble());
        System.out.println("enter the account number");
        Bank.setAccountNumber(sc.nextLong());
if (Bank.getBalance()<0){
    System.out.println("not valid !! balance is zero");
}
else {
    System.out.println("enter the amount to withdraw");
    float amount= sc.nextFloat();;
    if(Bank.getBalance()<amount){
        System.out.println("error!! not enough money");
    }
    else{
        System.out.println("your amount has been withdraw" + amount);
    }

}

        }
    }


//Create a class BankAccount with:
//        - balance
// - deposit()
// - withdraw()
// Throw a custom exception NegativeBalanceException if the user tries to withdraw more than the balance.

import java.util.Scanner;


class NegativeBalanceException extends Exception {
    @Override
    public String toString() {
        return "Withdrawal amount exceeds available balance!";
    }
}


class BankAccount {
    float balance;

    BankAccount(float balance) {
        this.balance = balance;
    }

    void deposit(float amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(float amount) throws NegativeBalanceException {
        if (amount > balance) {
            throw new NegativeBalanceException();
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(1000); // initial balance

        System.out.println("Enter deposit amount:");
        float deposit = sc.nextFloat();
        acc.deposit(deposit);

        System.out.println("Enter withdraw amount:");
        float withdraw = sc.nextFloat();

        try {
            acc.withdraw(withdraw);
        } catch (NegativeBalanceException e) {
            System.out.println(e);
        }

        System.out.println("Final Balance: " + acc.balance);
    }
}
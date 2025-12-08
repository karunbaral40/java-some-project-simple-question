//- Create an abstract class Payment with:
//        - A field amount (double).
//        - A constructor to initialize amount.
//- A concrete method printReceipt() that prints "Payment of <amount> processed.".
//        - An abstract method processPayment() that each subclass must implement.
//        - Create three subclasses:
//        - CreditCardPayment → prints "Processing credit card payment of <amount>."
//        - PayPalPayment → prints "Processing PayPal payment of <amount>."
//        - BankTransferPayment → prints "Processing bank transfer of <amount>."
//        - In the main() method:
//        - Create an array of Payment objects with different types.
//- Loop through the array, call both processPayment() and printReceipt()


abstract class Payments {
    double amount;

    Payments(double amount) {
        this.amount = amount;
    }

    public void printReceipt() {
        System.out.println("Payment of " + amount + " processed");
    }

    public abstract void processPayment();
}


class CreditCard extends Payments {

    CreditCard(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Processing credit card payment of " + amount);
    }
}


class Bank extends Payments {

    Bank(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Processing bank payment of " + amount);
    }
}


public class Payment {
    public static void main(String[] args) {

        Payments p1 = new CreditCard(1000);
        Payments p2 = new Bank(1000);

        p1.processPayment();
        p1.printReceipt();

        p2.processPayment();
        p2.printReceipt();
    }
}

import java.util.Scanner;
public class ConsaleBasedReceipt {
    public static void main(String[] args) {
        //Create a console-based receipt for a small shop. Include item names, quantity, price, and total, properly formatted.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the item you want to purchase");
        int n=sc.nextInt();
        String name="";
        float qty=1;
        int price=20;
        float total=qty*price;
        sc.nextLine();
        for (int i = 0; i <n ; i++) {


            System.out.println("enter the item name");
            name = sc.nextLine();

            System.out.println("enter the item quantity");
            qty = sc.nextFloat();
            sc.nextLine();

            System.out.println("enter the item price");
             price = sc.nextInt();
             total = qty * price;
            sc.nextLine();
        }
        for (int i = 0; i <n ; i++) {

            System.out.println("|item names | " + name + "|");
            System.out.println("|quantity   | " + qty + "|");
            System.out.println("price       | " + price + "|");
            System.out.println("total       | " + total + "|");
        }



    }
}

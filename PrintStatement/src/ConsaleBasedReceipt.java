import java.util.Scanner;
public class ConsaleBasedReceipt {
    public static void main(String[] args) {
        //Create a console-based receipt for a small shop. Include item names, quantity, price, and total, properly formatted.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the item you want to purchase");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <n ; i++) {


            System.out.println("enter the item name");
            String name = sc.nextLine();

            System.out.println("enter the item quantity");
            float qty = sc.nextFloat();
            sc.nextLine();

            System.out.println("enter the item price");
            int price = sc.nextInt();
            float total = qty * price;
            sc.nextLine();


            System.out.println("|item names | " + name+ "|");
            System.out.println("|quantity   | " + qty+"|");
            System.out.println("price       | " + price+"|");
            System.out.println("total       | " + total+"|");
        }



    }
}

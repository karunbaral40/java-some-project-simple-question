import java.util.Scanner;
public class SimplePrint {
    public static void main(String[] args) {
        //Print your daily schedule in a formatted way using System.out.println(). Include time and activity.
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your daily routune: ");
        System.out.println("1.wake up time : ");
        int time= sc.nextInt();

        sc.nextLine();
        System.out.println("2.after weak wake up: ");
        String after= sc.nextLine();
        System.out.println("3. bed time : ");
        int bed= sc.nextInt();
        sc.nextLine();
        System.out.println("weak up"+time+"\n"+after+"bedtime" +bed);



    }
}

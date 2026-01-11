import java.util.Scanner;

enum laptop{
    dell,acer,lenovo,hp,asus;
}
public class EnumAsArrayWithCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the laptop name" );
        String n=sc.next();
        laptop[] l=laptop.values();
        for (laptop l1:l) {
            if (n.equalsIgnoreCase(l1.name())) {
                if(l1==laptop.hp) {
                    System.out.println("this is hp's laptop");
                }else if(l1==laptop.dell) {
                    System.out.println("this is dell's laptop");
                }else if(l1==laptop.acer) {
                    System.out.println("this is acer's laptop");
                }else if(l1==laptop.lenovo) {
                    System.out.println("this is lenovo's laptop");
                }else {
                    System.out.println("this is asus's laptop");
                }
            }
        }
    }
}

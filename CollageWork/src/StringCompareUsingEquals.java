import java.util.Scanner;

public class     StringCompareUsingEquals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String s1=sc.nextLine();
        System.out.println("enter second string");
        String s2=sc.nextLine();
        if (s1.equals(s2)){
            System.out.println("strings are equal");
        }else {
            System.out.println("strings are not equal");
        }
    }
}

import java.util.Scanner;

public class ReverseTheGivenString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an string");
        String S=sc.nextLine();
        String rs="" ;
        for (int  i = S.length()-1;i >= 0; i--) {
            rs+= S.charAt(i);
        }
        System.out.println(rs);
    }
}

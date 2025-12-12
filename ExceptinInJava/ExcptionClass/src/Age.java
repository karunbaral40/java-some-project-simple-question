import java.util.Scanner;

class MAXAgeException extends Exception{
    public String toString(){
        return "Age can't greater than 100 years";
    }
    public String getMassage(){
        return "make sure the value of age enter correctly";
    }
}
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age >= 100 ) {
            try {
throw new MAXAgeException();
            }
            catch (MAXAgeException e){
                System.out.println(e);
                System.out.println(e.getMassage());
                e.printStackTrace();
            }
        }
    }
}

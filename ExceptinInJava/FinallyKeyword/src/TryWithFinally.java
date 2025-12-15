//❌wrong way
public class TryWithFinally {
    public static void main(String[] args) {
      int  a=10;
       int  b=0;
       try {
           int c = a / b;
           System.out.println(c);
       }
       finally {
           System.out.println("cannot divide by zero");
       }
    }
}

//Write an interface name with pen and make a method name write() and refill().
interface pen{
   void write();
   void refill();
}
class TopTen implements pen{
    public void write(){
        System.out.println("writing....");
    }
    public void refill(){
        System.out.println("refiling....");
    }
}
public class PenWithWriteAndRefil{
    public static void main(String[] args) {
TopTen tt=new TopTen();
tt.write();
tt.refill();
    }
}

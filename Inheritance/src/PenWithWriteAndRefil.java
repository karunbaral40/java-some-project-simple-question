//Write an abstract class pen and make a method name write() and refill().
abstract class pen{
  abstract void write();
  abstract void refill();
}
class TopTen extends pen{
    void write(){
        System.out.println("writing....");
    }
    void refill(){
        System.out.println("refiling....");
    }
    void changeNib(){
        System.out.println("changing nib");
    }
}
public class PenWithWriteAndRefil{
    public static void main(String[] args) {
        pen tt=new TopTen();
tt.write();
tt.refill();
TopTen tp=new TopTen();
tp.changeNib();
    }
}

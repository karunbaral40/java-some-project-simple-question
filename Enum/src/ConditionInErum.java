enum Status1{
    running ,pending,failed, succeed,wait;
        }
public class ConditionInErum {
    public static void main(String[] args) {

        Status1 s=Status1.wait;
        if (s==Status1.failed){
            System.out.println("you failed");
        } else if (s==Status1.pending) {
            System.out.println("wait some time");
        } else if (s==Status1.succeed) {
            System.out.println("you succeed");
        } else if (s==Status1.wait) {
            System.out.println("wait sometime");
        } else {
            System.out.println("it worked");
        }
    }
}

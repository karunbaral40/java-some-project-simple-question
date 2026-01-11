enum Status{
running,pending, failed, succeed;
}
public class DemoStatus {
    public static void main(String[] args) {
        Status s=Status.failed;
        System.out.println(s);
        Status s1=Status.running;
        System.out.println(s1);
        Status s2=Status.pending;
        System.out.println(s2);
        Status s3=Status.succeed;
        System.out.println(s3);

    }
}

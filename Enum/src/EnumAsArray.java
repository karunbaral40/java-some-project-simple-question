enum Status2{
    running,stop,pending,start,end;
}
public class EnumAsArray {
    public static void main(String[] args) {
Status2 []s =Status2.values();
for (Status2 arr:s){
    System.out.println(arr);
}
    }
}

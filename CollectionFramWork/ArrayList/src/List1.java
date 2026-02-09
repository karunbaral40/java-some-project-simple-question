
import java.util.*;

public class List1 {
    public static void main(String[] args) {
       List<String> list= Arrays.asList("A","B","C");
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

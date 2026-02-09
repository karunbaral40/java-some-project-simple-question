import java.util.HashMap;

public class HasMapExample
{
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Ram");
        map.put(2,"Shayam");
        map.put(3,"Shyam");
        map.put(4,String.valueOf(3));

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));


    }

}

import java.util.Scanner;
public class ReplaceSpaceWithUnderscore {
    //wap to replace space with underscore
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any sentence");
        String sen=sc.nextLine();

       String modi= sen.trim().replace(" " ,"_");
        System.out.println(modi);

    }

}

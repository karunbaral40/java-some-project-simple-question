//create a class tommy for hitting running and firing.
import java. util.Scanner;
class Tommy{
    static void hitting(){
        System.out.println("hitting......");
    }

    static void running(){
        System.out.println("runing......");
    }

    static void firing(){
        System.out.println("firing......");
    }
}
public class RunHitEtc {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tommy c=new Tommy();
        System.out.println("enter \n 1 for hitting \n 2 for running \n 3 for firing");
        System.out.println("enter num 1 or 2 or 3");

        int a=sc.nextInt();

        if (a==1) {
            c.hitting();
        } else if(a==2) {
           c.running();
        }
        else if(a==3){
            c.firing();
        }
        else{
            System.out.println("this number is not valid ");
        }
    }
}

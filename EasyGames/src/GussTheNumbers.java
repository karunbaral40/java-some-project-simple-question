//create a game crete a game to guess the number using methods and classes
import java.util.*;
class Game{
    private int numberToGuss;
    private int attempts;
    public Game(){
        //generate a random number 1 to 100
        Random rand=new Random();
        numberToGuss=rand.nextInt(100)+1;
        attempts=0;
    }
public boolean checkGuss(int guess){
        attempts ++;
        if(guess==numberToGuss){
            System.out.println("congratulation! you guess write");
        }
        else if (guess>numberToGuss){
            System.out.println("too high! guess again");
        }
        else {
            System.out.println("too low! guess again");
        }
        return false;
}
}
public class GussTheNumbers {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Game game=new Game();
boolean win=false;

        System.out.println("i can have number between 1 to 100.have you any guts to guess it: ");
        while(!win){
            System.out.println("enter your guess");
            int guess= sc.nextInt();
            win = game.checkGuss(guess);
        }

    }
}

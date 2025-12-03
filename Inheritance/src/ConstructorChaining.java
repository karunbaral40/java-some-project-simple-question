//Question (Constructor Chaining)
//Create:
//Parent class Vehicle → constructor with speed
//Child class Bike → constructor with gear
//Pass speed from child to parent using super.
import java.util.Scanner;
class Vehicle{
    int speed;

    public Vehicle(int speed){
        this.speed=speed;
        System.out.println("this is the speed of the vehicle : "+speed);
    }

}
class Bike extends Vehicle{
    int gear;
   public Bike(int speed,int gear){
       super(speed);
       this.gear=gear;

       System.out.println("this is the gear of the bike : " + gear);
   }

}
public class ConstructorChaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the speed of bike");
        int speed=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the gear of bike");
        int gear=sc.nextInt();
        sc.nextLine();
Bike b=new Bike(speed,gear);
    }
}

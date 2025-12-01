//create a class cylinder and use getter & setter to set the value of radius and height and calculate area and volume.
import java.util.Scanner;
class Cylinder{
    private float radius;
    private float height;

public float getnum1(){
    return radius;
}
public void setnum1(float radius){
    this.radius=radius;
}
public float getnum2(){
    return height;
}
public void setnum2(float height){
    this.height=height;
}

public double area(){
    double area=(2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    System.out.println("the area is: " + area);
    return area;
}
public double volume(){
    double volume=Math.PI*radius*radius*height;
    System.out.println("the volume is: " + volume);
    return volume;
}
}

public class CylinderSet {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Cylinder cy=new Cylinder();
        System.out.println("enter the radius : ");
cy.setnum1(sc.nextFloat());
        System.out.println("enter the height : ");
        cy.setnum2(sc.nextFloat());

        cy.area();
        cy.volume();


    }
}

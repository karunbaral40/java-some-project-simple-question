//Question  (Inheritance + Method Overriding)
//Create:
//Parent class Animal → method sound()
//Child class Dog → override sound()
//Call sound() using Dog object.
class Animal{
    public void Sound(){
        System.out.println("Animal make sound.......");
    }
}
class Dog extends Animal{
public void Sound(){
    System.out.println("Dog is barking....");
    }
}
public class InheritanceAndMethodOverriding {

    public static void main(String[] args) {
Dog d=new Dog();
d.Sound();

Animal a=new Animal();
a.Sound();


Animal an=new Dog();
a.Sound();
    }
}

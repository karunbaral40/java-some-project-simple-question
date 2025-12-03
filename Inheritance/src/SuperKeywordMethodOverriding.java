//Question  (super + Method Overriding)
//In the previous Animal → Dog example:
//Call parent version of sound() from child using super
class Animals{
    int a;
    int b;
   public void Sound(){
       System.out.println("Animal is making sound................");
   }
   public void Sound(int a){
       System.out.println("Animal is making sound again ................");
   }
   public void Sound(int a ,int b){
       System.out.println("Animal is making sound again and again................");
   }
}
class Dogs extends Animals{
    @Override
  public void  Sound(){
      super.Sound(a,b);
      System.out.println("dog is barking...................." );
  }
}

public class SuperKeywordMethodOverriding {
    public static void main(String[] args) {

        Dogs a=new Dogs();
        a.Sound();
    }
}

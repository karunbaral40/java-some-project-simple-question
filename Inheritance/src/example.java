class car{
    static void featurecar(){
    System.out.println("It have wheels.");
    System.out.println("we can drive it");
    }
}
class truck extends car{
    static void featuretruck(){
    System.out.println("It can carry load");
    }

}
public class example {
    public static void main(String[] args) {
        truck tk=new truck();
        tk.featurecar();
        tk.featuretruck();

    }
}

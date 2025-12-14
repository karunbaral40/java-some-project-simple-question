public class Devide {
    public static float devide(int a,int b) throws ArithmeticException{
        float dev=a/b;
        return dev;
    }
    public static void main(String[] args) {
        try{
            float a= devide(6,0);
            System.out.println(a);
        }
       catch (Exception e){
           System.out.println("Exception");
       }

    }
}

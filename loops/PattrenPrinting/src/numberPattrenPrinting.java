public class numberPattrenPrinting {
    public static void main(String[] args) {
        //write a program to print following pattrun:
        //1
        //12
        //123
        //1234
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.print("\n" );

        }
    }
}

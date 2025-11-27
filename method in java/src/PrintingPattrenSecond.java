public class PrintingPattrenSecond {
    //write a java method to print following pattren :
    //*****
    //****
    //***
    //**
    //*
    static void main(int n){
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int n=5;
        main(n);
    }
}

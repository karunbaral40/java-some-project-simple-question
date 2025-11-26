public class SumUsingVariableArgumentOneValueIsContent {
    //write a program to add numbers without limits using variable argument whare one number is consent(x).
    static int sum(int x ,int... a){
        int result=x;
        for(int value:a){
            result+=value;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("the sum of 2,3,4,5 is :" + sum(2,3 , 4 , 5));
        System.out.println("the sum of 2,3,4,5,6 is :" + sum(2,3 , 4 , 5,6));
        System.out.println("the sum of 2,3,4,5,6,7 is :" + sum(2,3 , 4 , 5 , 6 , 7));
        System.out.println("the sum of 2,3,4,5,6,7,8 is :" + sum(2,3 , 4 , 5 , 6 , 7 ,8));

    }
}

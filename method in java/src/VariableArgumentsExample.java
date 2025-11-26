public class VariableArgumentsExample {
    //write a program to add numbers without limits using variable argument
    static int sum(int... arr){
        int result=0;
        for(int value:arr){
            result=result+value;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("sum of 2 and 3 is:"+ sum(2,3));
        System.out.println("sum of 2 , 3 and 6 is:"+ sum(2,3,6));
        System.out.println("sum of 2 , 3 , 6 and 9 is:"+ sum(2,3,6,9));
        System.out.println("sum of 2 ,3 , 6 , 9 and 12 is:"+ sum(2,3,6,9,12));

    }
}

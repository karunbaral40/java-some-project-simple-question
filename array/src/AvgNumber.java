public class AvgNumber {
    public static void main(String[] args) {
        int []num={15,12,13,31,21,34};
        int sum=0;

        for(int element:num){
            sum=sum+element;


        }
        System.out.println("avg of two number is:"+sum/num.length  );
    }
}

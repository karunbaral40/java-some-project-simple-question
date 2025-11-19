public class voteUsingConditionalOperator {
    public static void main(String[] args) {
        //wap to see if the person is eligible for vote or not using conditional operator.
        int age = 19;
        String eligibility;


        eligibility = (age >= 18) ? "He is eligible to vote" : "He is not eligible to vote";

        System.out.println(eligibility);
    }
}

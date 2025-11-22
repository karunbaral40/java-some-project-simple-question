public class multiplactionOfTwo_DArray {
    public static void main(String[] args) {
        int[][]num1={{2,3,4},
                {4,5,6}};
        int[][]num2={{4,5,6},
                {7,8,9}};
        int[][]result={{0,0,0},
                {0,0,0}};
        for (int i = 0; i <num1.length ; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                result[i][j]=num1[i][j]*num2[i][j];
                System.out.print(result[i][j]+" ");

            }
            System.out.println(" ");

        }
    }
}

public class MuliplacationOfTwo_DarrayAnotherWay {
    public static void main(String[] args) {

        int[][] arr={{2, 3},
            {4, 5}
        };
        int multiply=1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                multiply=multiply*arr[i][j];

            }
            System.out.println("multiplication of all elements = " + multiply);
        }

    }
}

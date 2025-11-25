public class AddtwoMatrix {
    public static void main(String[] args) {
        //write a program to add 2two 2*3 matrix
        int[][] a= {{1, 2, 3},
                {2, 3, 4}};
        int[][] b= {{3, 2, 1},
                {4, 3, 2}};
        int[][] result= {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                result[i][j]=a[i][j]+b[i][j];
                System.out.print(result[i][j]+" ");

            }
            System.out.println(" ");

        }




    }
}

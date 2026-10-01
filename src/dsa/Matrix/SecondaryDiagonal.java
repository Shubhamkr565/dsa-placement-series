package dsa.Matrix;

public class SecondaryDiagonal {

    public static void findSecondaryDiagonal(int[][] matrix){
        int DiagonalSum = 0;
        int n = matrix.length;

        for(int i = 0; i< matrix.length; i++){

            DiagonalSum += matrix[i][i];

            if(i!=n-1-i){
                DiagonalSum += matrix[i][n-1-i];
            }
        }
        System.out.println("Secondary Diagonal: "+DiagonalSum);
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        findSecondaryDiagonal(matrix);
    }
}

package dsa.Matrix;

public class DiagonalSum {


    public static void findDiagonalSum(int[][] matrix){

        int DiagonalSum = 0;

        for(int i=0; i< matrix.length; i++){
            DiagonalSum += matrix[i][i];

        }
        System.out.println("Diagonla Sum: "+DiagonalSum);

    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        findDiagonalSum(matrix);
    }
}

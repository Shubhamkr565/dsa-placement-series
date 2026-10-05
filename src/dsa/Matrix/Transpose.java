package dsa.Matrix;

public class Transpose {

    public static void TransposeMatrix(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        TransposeMatrix(matrix);
    }
}

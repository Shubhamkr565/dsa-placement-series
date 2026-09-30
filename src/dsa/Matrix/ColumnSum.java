package dsa.Matrix;

public class ColumnSum {


    public static void findCoulumnSum(int[][] matrix){

        for(int i=0; i<matrix.length; i++){
            int sum = 0;
            for(int j=0; j< matrix.length; j++){
                sum += matrix[j][i];
            }
            System.out.println("Column: "+i+" Sum: "+sum);
        }

    }


    public static void main(String[] args) {
        // Create a 3 x 3 matrix
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        findCoulumnSum(matrix);
    }
}

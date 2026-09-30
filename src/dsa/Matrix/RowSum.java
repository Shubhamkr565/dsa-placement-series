package dsa.Matrix;

public class RowSum {

    // Method to find the sum of each row
    public static void findRowSum(int[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {

            // Store the sum of the current row
            int sum = 0;

          for (int j = 0; j < matrix[i].length; j++) {

                // Add current element to sum
                sum += matrix[i][j];
            }
            System.out.println("Row " + i + " Sum = " + sum);
        }
    }

    public static void main(String[] args) {

        // Create a 3 x 3 matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Call the method
        findRowSum(matrix);
    }
}
package dsa.Matrix;

public class FindMaximum {

    public static void findMaximum(int[][] matrix) {

        int max = matrix[0][0];

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {

            // Loop through each column
            for (int j = 0; j < matrix[i].length; j++) {

                // Check if current element is greater than max
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // Print the maximum element
        System.out.println("Max Element: " + max);
    }

    public static void main(String[] args) {

        // Create a 3 x 3 matrix
        int[][] matrix = {
                {5, 3, 7},
                {9, 22, 5},
                {7, 8, 5}
        };

        findMaximum(matrix);
    }
}

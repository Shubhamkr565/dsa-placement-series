package dsa.Matrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {

    public static List<Integer> findLuckyNumbers(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check every row
        for (int i = 0; i < rows; i++) {

            // Find minimum element in current row
            int min = matrix[i][0];
            int minCol = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minCol = j;
                }
            }

            // Check whether row minimum is maximum in its column
            boolean isLucky = true;

            for (int j = 0; j < rows; j++) {
                if (matrix[j][minCol] > min) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                result.add(min);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        List<Integer> result = findLuckyNumbers(matrix);

        System.out.println("Lucky Numbers: " + result);
    }
}
package dsa.arrays;

public class ThreeSum {

    public static void main(String[] args) {

        // Input array
        int[] arr = {-1, 0, 1, 2, -1, 4};

        // First element
        for (int i = 0; i < arr.length - 2; i++) {

            // Second element
            for (int j = i + 1; j < arr.length - 1; j++) {

                // Third element
                for (int z = j + 1; z < arr.length; z++) {

                    // Check if sum of three elements is 0
                    if (arr[i] + arr[j] + arr[z] == 0) {

                        // Print the triplet
                        System.out.println(
                                arr[i] + ", " + arr[j] + ", " + arr[z]
                        );
                    }
                }
            }
        }
    }
}
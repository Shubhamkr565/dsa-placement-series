package dsa.arrays;

public class SquareOfASortedArray {
    public static void main(String[] args) {
        // Initialize a sorted array containing both negative and positive integers
        int[] arr = {-4, -1, 0, 3, 10};

        // Print the original starting array
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n---------------------------------");

        // Step 1: Square each element in the array in-place
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // Print the array immediately after squaring (unsorted)
        System.out.print("Squared (but Unsorted) Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 2: Sort the squared array in ascending order using Bubble Sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Swap elements if the current element is greater than the next element
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("---------------------------------");

        // Print the final sorted and squared array
        System.out.print("Final Sorted Squared Array:   ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println(); // Final newline for clean console termination
    }
}

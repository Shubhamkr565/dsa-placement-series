
package dsa.SlidingWindow;

public class AverageOfEveryWindow {

    public static void findAverage(int[] nums, int k) {

        int left = 0;
        int windowSum = 0;
        int windowNumber = 1;

        for (int right = 0; right < nums.length; right++) {

            // Add the new element to the window
            windowSum += nums[right];

            // Check if the window size is k
            if (right - left + 1 == k) {

                // Print the current window sum
                System.out.println(
                        "Window Sum of " + windowNumber + ": " + windowSum
                );

                // Calculate and print the current window average
                System.out.println(
                        "Average of " + windowNumber + " Window: "
                                + (double) windowSum / k
                );

                windowNumber++;

                // Remove the leftmost element
                windowSum -= nums[left];

                // Move the left pointer forward
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {5, 9, 7, 3, 4, 6, 8, 1};
        int k = 3;

        findAverage(nums, k);
    }
}